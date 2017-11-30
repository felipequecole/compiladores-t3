package t3;

import java.util.ArrayList;

/**
 * Created by felipequecole on 29/11/17.
 */
public class Tatica {
    String nome;
    String ofensivo;
    String defensivo;
    String espacamento;

    public Tatica(String line){
        String[] split = line.split("\\(");
        this.nome = split[0];
        split[1] = split[1].replace(")", "");
        split = split[1].split(",");
        this.ofensivo = split[0];
        this.defensivo = split[1];
        this.espacamento = split[2];
    }
}
