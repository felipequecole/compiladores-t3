package t3;
import java.util.ArrayList;

public class Time{
   String nome;
   String treinadorTime;
   String goleiro;
   String conjuntoJogadores;
   int compactacao;
   ArrayList<Tatica> listaTaticas;

  Time(){
    String nome = "";
    String treinadorTime = "";
    String goleiro = "";
    String conjuntoJogadores = "";
    int compactacao = 0;
    ArrayList<Tatica> listaTaticas = new ArrayList<>();
  }

  public void addTatica(Tatica tatica){
    listaTaticas.add(tatica);
  }

}
