package t3;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by felipequecole on 22/11/17.
 */
public class GeradorDeCodigo extends Tira_teimaBaseListener {
    private String saida;
    private int qtd_linhas;
    private ArrayList<String> linhas;
    private ArrayList<String> taticas_linha;
    private HashMap<String, Tatica> taticas;

    public GeradorDeCodigo(){
        saida = "";
        qtd_linhas = 0;
        linhas = new ArrayList<>();
        taticas = new HashMap<>();
        taticas_linha = new ArrayList<>();
    }


    private void println(String texto){
        this.saida += texto + "\n";
    }


    private void print(String texto) {
        this.saida += texto;
    }


    @Override
    public String toString() {
        return this.saida;
    }

    @Override
    public void enterPrograma(Tira_teimaParser.ProgramaContext ctx) {
        println("import matplotlib.pyplot as plt");
        println("field = plt.imread(\'campo.jpg\')");
        println("plot = plt.imshow(field)");
    }


    @Override
    public void exitPrograma(Tira_teimaParser.ProgramaContext ctx) {
        println("plt.axis(\'off\')");
        println("plot.axes.get_xaxis().set_visible(False)");
        println("plot.axes.get_yaxis().set_visible(False)");
        println("plt.savefig('saida_sera.png', bbox_inches='tight', pad_inches=-0.11)");
    }


    @Override
    public void enterConteudo_esquema(Tira_teimaParser.Conteudo_esquemaContext ctx) {
        this.linhas.add(ctx.getText());
        this.qtd_linhas++;
    }


    @Override
    public void enterEsquemas(Tira_teimaParser.EsquemasContext ctx) {
        for (Token linha: ctx.nome_tat){
            taticas_linha.add(linha.getText());
        }
    }

    @Override
    public void exitEsquemas(Tira_teimaParser.EsquemasContext ctx) {
        double espaco_y = 380.0/this.qtd_linhas;
        double y = 400;
        for (String linha : this.linhas){
            System.out.println(linha);
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            double espaco_x = 200.0/numero_jogadores;
            print("plt.scatter([");
            double x = 25 + espaco_x;
            for (int i = 0; i < numero_jogadores; i++){
                print(String.valueOf(x));
                if (i != numero_jogadores-1) {
                    print(",");
                }
                x += espaco_x;
            }
            print("],[");
            for (int i = 0; i < numero_jogadores; i++) {
                print(String.valueOf(y));
                if (i != numero_jogadores-1) {
                    print(",");
                }
            }
            println("], c=\'w\', s = 200)");
            y = y - espaco_y;
        }

        // setas de ataque
        y = 400;
        int tat = 0;
        for (String linha : this.linhas){
            System.out.println(linha);
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            double espaco_x = 200.0/numero_jogadores;
            double x = 25 + espaco_x;
            Tatica tatica = taticas.get(taticas_linha.get(tat));
            for (int i = 0; i < numero_jogadores; i++){
                print("plt.arrow(");
                print(String.valueOf(x));
                print(",");
                print(String.valueOf(y));
                print(",");
                x += espaco_x;
                switch (tatica.ofensivo){
                    case "pressao":
                        println("0, -30, color=\'r\', head_width = 10)");
                        break;
                    case "flanco_direito":
                        println("20, -30, color=\'r\', head_width = 10)");
                        break;
                    case "flanco_esquerdo":
                        println("-20, -30, color=\'r\', head_width = 10)");
                        break;
                }
            }
            y = y - espaco_y;
            tat++;
        }


        // setas de defesa
        y = 400;
        tat = 0;
        for (String linha : this.linhas){
            System.out.println(linha);
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            double espaco_x = 200.0/numero_jogadores;
            double x = 25 + espaco_x;
            Tatica tatica = taticas.get(taticas_linha.get(tat));
            for (int i = 0; i < numero_jogadores; i++){
                print("plt.arrow(");
                print(String.valueOf(x+3));
                print(",");
                print(String.valueOf(y));
                print(",");
                x += espaco_x;
                switch (tatica.defensivo){
                    case "pressao":
                        println("0, -30, color=\'b\', head_width = 10)");
                        break;
                    case "flanco_direito":
                        println("20, 30, color=\'b\', head_width = 10)");
                        break;
                    case "flanco_esquerdo":
                        println("-20, 30, color=\'b\', head_width = 10)");
                        break;
                }
            }
            y = y - espaco_y;
            tat++;
        }
    }

    @Override
    public void enterTaticas(Tira_teimaParser.TaticasContext ctx) {
        for (Tira_teimaParser.Pos_taticaContext pos : ctx.list_taticas){
            Tatica aux = new Tatica(pos.getText());
            taticas.put(aux.nome, aux);
        }
    }

    @Override
    public void exitTaticas(Tira_teimaParser.TaticasContext ctx) {
        System.out.println(taticas);
    }
}
