package t3;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by felipequecole on 22/11/17.
 */
public class GeradorDeCodigo extends Tira_teimaBaseListener {
    // todo PRECISA ZERAR PRA QUANDO TEM + DE 1 TIME
    private String saida;
    private int qtd_linhas;
    private int plots;
    private ArrayList<Integer> changeTeam;
    private ArrayList<String> linhas;
    private TabelaDeSimbolos tabela;
    private ArrayList<String> taticas_linha;
    private HashMap<String, Tatica> taticas;
    private float comprimentoCampo = 1006;
    private float larguraCampo = 736;
    private float compactacaoLinha = 400;
    private float compactacaoLinhaEsparso = 600;
    private float compactacaoLinhaAgrupado = 400;
    private String nomeTecnico;
    private String nomeTime;

    private float compactacao = 800;
    public GeradorDeCodigo(){
        saida = "";
        qtd_linhas = 0;
        plots = 0;
        changeTeam = new ArrayList<>();
        changeTeam.add(0);
        linhas = new ArrayList<>();
        tabela = new TabelaDeSimbolos("geração");
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
        println("import os");
        println("field = plt.imread(os.path.join(\'data\',\'campo.jpg\'))");
        println("bola = plt.imread(os.path.join(\'data\', \'bola.png\'))");
        println("plot = plt.imshow(field)");
    }


    @Override
    public void exitPrograma(Tira_teimaParser.ProgramaContext ctx) {
//        println("plt.axis(\'off\')");
//        println("plot.axes.get_xaxis().set_visible(False)");
//        println("plot.axes.get_yaxis().set_visible(False)");
//        println("plt.savefig('saida_sera.png', bbox_inches='tight', pad_inches=-0.11)");
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
        double espaco_y = compactacao/(this.qtd_linhas-changeTeam.get(plots));
        double y = comprimentoCampo -(comprimentoCampo - compactacao)/2 - espaco_y/2;
        int cont = 0;
        for (String linha : this.linhas){
            if (cont < changeTeam.get(plots)) {
                cont++;
                continue;
            }
            Tatica tatica = taticas.get(taticas_linha.get(cont));
            cont++;
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            double x,espaco_x;
            if(tatica.espacamento.equals("agrupados")){
              espaco_x = compactacaoLinhaAgrupado/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaAgrupado)/2 + espaco_x/2;
            }else{
              espaco_x = compactacaoLinhaEsparso/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaEsparso)/2 + espaco_x/2;
            }
            print("plt.scatter([");
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
        y =  comprimentoCampo - (comprimentoCampo - compactacao)/2 - espaco_y/2;
        int tat = changeTeam.get(plots);
        cont = 0;
        for (String linha : this.linhas){
            if (cont < changeTeam.get(plots)) {
                cont++;
                continue;
            }
            cont++;
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            Tatica tatica = taticas.get(taticas_linha.get(tat));

            double x,espaco_x;
            if(tatica.espacamento.equals("agrupados")){
              espaco_x = compactacaoLinhaAgrupado/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaAgrupado)/2 + espaco_x/2;
            }else{
              espaco_x = compactacaoLinhaEsparso/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaEsparso)/2 + espaco_x/2;
            }

            for (int i = 0; i < numero_jogadores; i++){
                print("plt.arrow(");
                print(String.valueOf(x));
                print(",");
                print(String.valueOf(y));
                print(",");
                //x += espaco_x;
                switch (tatica.ofensivo){
                    case "pressao":
                        println("0, -30, color=\'r\', head_width = 15)");
                        break;
                    case "flanco_direito":
                        println("20, -30, color=\'r\', head_width = 15)");
                        break;
                    case "flanco_esquerdo":
                        println("-20, -30, color=\'r\', head_width = 15)");
                        break;
                    case "bola":
                        println("0, -30, color=\'r\', head_width = 15)");
                        println("plt.imshow(bola, zorder=2, extent=("+ String.valueOf(x - 10) + "," +
                                String.valueOf(x+10)+ "," + String.valueOf(y - 55) + "," +
                                String.valueOf(y-35)+"))");
                        break;
                    default:
                        println("0,0)");
                }
                x += espaco_x;
            }
            y = y - espaco_y;
            tat++;
        }

        changeTeam.add(this.qtd_linhas);

        // setas de defesa
        y =  comprimentoCampo -(comprimentoCampo - compactacao)/2 - espaco_y/2;
        tat = changeTeam.get(plots);
        cont = 0;
        for (String linha : this.linhas){
            if (cont < changeTeam.get(plots)) {
                cont++;
                continue;
            }
            cont++;
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            Tatica tatica = taticas.get(taticas_linha.get(tat));

            double x,espaco_x;
            if(tatica.espacamento.equals("agrupados")){
              espaco_x = compactacaoLinhaAgrupado/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaAgrupado)/2 + espaco_x/2;
            }else{
              espaco_x = compactacaoLinhaEsparso/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaEsparso)/2 + espaco_x/2;
            }

            for (int i = 0; i < numero_jogadores; i++){
                print("plt.arrow(");
                print(String.valueOf(x+3));
                print(",");
                print(String.valueOf(y));
                print(",");
                x += espaco_x;
                switch (tatica.defensivo){
                    case "pressao":
                        println("0, -30, color=\'b\', head_width = 15)");
                        break;
                    case "flanco_direito":
                        println("20, 30, color=\'b\', head_width = 15)");
                        break;
                    case "flanco_esquerdo":
                        println("-20, 30, color=\'b\', head_width = 15)");
                        break;
                    case "bola":
                        println("0, -30, color=\'r\', head_width = 15)");
                        println("plt.imshow(bola, zorder=2, extent=("+ String.valueOf(x - 10) + "," +
                                String.valueOf(x+10)+ "," + String.valueOf(y - 55) + "," +
                                String.valueOf(y-35)+"))");
                        break;
                    default:
                        println("0,0);");
                        break;
                }
            }
            y = y - espaco_y;
            tat++;
        }
        //nomes

        y =  comprimentoCampo -(comprimentoCampo - compactacao)/2 - espaco_y/2;
        tat = changeTeam.get(plots);
        cont = 0;
        int counter = 0;
        for (String linha : this.linhas){
            if (cont < changeTeam.get(plots)) {
                cont++;
                continue;
            }

            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            Tatica tatica = taticas.get(taticas_linha.get(tat));

            double x,espaco_x;
            if(tatica.espacamento.equals("agrupados")){
              espaco_x = compactacaoLinhaAgrupado/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaAgrupado)/2 + espaco_x/2;
            }else{
              espaco_x = compactacaoLinhaEsparso/numero_jogadores;
              x = (larguraCampo - compactacaoLinhaEsparso)/2 + espaco_x/2;
            }

            for (int i = 0; i < numero_jogadores; i++){
                print("plt.text(");
                print(String.valueOf(x));
                print(",");
                print(String.valueOf(y+100));
                print(",");
                x += espaco_x;
                String nomeJogador = ctx.lista_jog_tat.get(counter).l_jog_esq.get(i).getText();
                print("\'"+nomeJogador.substring(1,nomeJogador.length()-1)+"\', ");
                println(" verticalalignment=\'bottom\',horizontalalignment=\'center\', color=\'white\', fontsize=10)");
            }
            counter++;
            y = y - espaco_y;
            cont++;
            tat++;
        }
        print("plt.text(375, 0, \'" + this.nomeTime + "\', verticalalignment=\'top\',");
        println("horizontalalignment=\'center\', color=\'black\', fontsize=12)");
        println("plot = plt.imshow(field, zorder=0)");
        println("plt.axis(\'off\')");
        println("plot.axes.get_xaxis().set_visible(False)");
        println("plot.axes.get_yaxis().set_visible(False)");
        println("plt.savefig('saida_" + String.valueOf(plots) + ".png', bbox_inches='tight', pad_inches=0.1)");
        println("plt.clf()");
        plots++;
    }

    @Override
    public void enterTaticas(Tira_teimaParser.TaticasContext ctx) {
        for (Tira_teimaParser.Pos_taticaContext pos : ctx.list_taticas){
            Tatica aux = new Tatica(pos.getText());
            taticas.put(aux.nome, aux);
        }
    }

    @Override
    public void enterNome_time(Tira_teimaParser.Nome_timeContext ctx) {
        this.nomeTime = ctx.CADEIA().getText().replace("\"", "");
    }

    @Override
    public void enterTreinador_time(Tira_teimaParser.Treinador_timeContext ctx) {
        this.nomeTecnico = ctx.CADEIA().getText().replace("\"", "");
    }
}
