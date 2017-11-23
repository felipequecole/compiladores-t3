package t3;

import java.util.ArrayList;

/**
 * Created by felipequecole on 22/11/17.
 */
public class GeradorDeCodigo extends Tira_teimaBaseListener {
    private String saida;
    private int qtd_linhas;
    private ArrayList<String> linhas;

    public GeradorDeCodigo(){
        saida = "";
        qtd_linhas = 0;
        linhas = new ArrayList<>();
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
    public void exitEsquemas(Tira_teimaParser.EsquemasContext ctx) {
        double espaco_y = 350.0/this.qtd_linhas;
        double y = 400;
        for (String linha : this.linhas){
            String[] jogadores = linha.split(",");
            int numero_jogadores = jogadores.length;
            double espaco_x = 200.0/numero_jogadores;
            print("plt.scatter([");
            double x = 50;
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


    }
}
