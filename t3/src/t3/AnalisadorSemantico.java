package t3;
import org.antlr.v4.runtime.Token;
public class AnalisadorSemantico extends Tira_teimaBaseVisitor<Object>{
  Time time;
  TabelaDeSimbolos tabela;

  public void setTime(Time time){
    this.time = time;
  }

  public Object visitPrograma(Tira_teimaParser.ProgramaContext ctx){
    tabela = new TabelaDeSimbolos("Global");
    visitTime(ctx.time());
    visitTaticas(ctx.taticas());
    for(Tira_teimaParser.EsquemasContext ectx: ctx.esquemas()){
      visitEsquemas(ectx);
    }
    return null;
  }

  public Object visitTime(Tira_teimaParser.TimeContext ctx){
    time.nome = ctx.nome_time().CADEIA().getText();
    visitConjunto_jogadores(ctx.conjunto_jogadores());
    return null;
  }

  public Object visitConjunto_jogadores(Tira_teimaParser.Conjunto_jogadoresContext ctx){
    if(ctx == null)
      return null;
    for(Token jogador : ctx.l_jog){
        tabela.adicionarSimbolo(jogador.getText(),"jogador");
    }
    if( ctx.l_jog.size() != 10){
      Saida.println("Time:");
      Saida.println("   São necessários 10 jogadores, declarados: " +
                    String.valueOf(ctx.l_jog.size()));
    }
    return null;
  }

  public Object visitTaticas(Tira_teimaParser.TaticasContext ctx){

    for(Tira_teimaParser.Pos_taticaContext ptc: ctx.list_taticas ){
        tabela.adicionarSimbolo(ptc.IDENT().getText(),"tatica");
    }
    return null;
  }


  public Object visitEsquemas(Tira_teimaParser.EsquemasContext ctx){
    int num_jogadores = 0;
    TabelaDeSimbolos tabelaJog = new TabelaDeSimbolos("Esquema");
    for(Tira_teimaParser.Conteudo_esquemaContext aux : ctx.lista_jog_tat){
      num_jogadores += aux.l_jog_esq.size();
      for(Token jogador: aux.l_jog_esq){

        if(!tabelaJog.existeSimbolo(jogador.getText())){
          tabelaJog.adicionarSimbolo(jogador.getText(),"");
        }else{
          Saida.println("Esquema: " + ctx.IDENT(0).getText());
          Saida.println("   Jogador " + jogador.getText() + " Já foi posicionado neste esquema");
        }

        if(!tabela.existeSimbolo(jogador.getText())){
          Saida.println("Esquema: " + ctx.IDENT(0).getText());
          Saida.println("   Jogador: " + jogador.getText() + " Não declarado");
        }
      }
    }

    for(Token tk: ctx.nome_tat){
      if(!tabela.existeSimbolo(tk.getText())){
        Saida.println("Esquema: " + ctx.IDENT(0).getText());
        Saida.println("   Identificador \""+ tk.getText() + "\" não declarado anteriormente");
      }
    }
    if(num_jogadores != 10){
      Saida.println("Esquema: " + ctx.IDENT(0).getText());
      Saida.println("   São necessários 10 jogadores. Existem: ".concat(
                                            String.valueOf(num_jogadores)));
    }

    return null;
  }
}
