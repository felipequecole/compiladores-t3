package t3;
import org.antlr.v4.runtime.Token;
public class AnalisadorSemantico extends Tira_teimaBaseVisitor<Object>{
  Time time;
  TabelaDeSimbolos tabela;

  public void setTime(Time time){
    this.time = time;
  }

  public Object visitPrograma(Tira_teimaParser.ProgramaContext ctx){
    visitTime(ctx.time());
    tabela = new TabelaDeSimbolos("Global");
    visitTaticas(ctx.taticas());
    visitEsquemas(ctx.esquemas().get(0));
    return null;
  }

  public Object visitTime(Tira_teimaParser.TimeContext ctx){
    time.nome = ctx.nome_time().CADEIA().getText();
    return null;
  }
  public Object visitTaticas(Tira_teimaParser.TaticasContext ctx){
    for(Tira_teimaParser.Pos_taticaContext ptc: ctx.list_taticas ){
        tabela.adicionarSimbolo(ptc.IDENT().getText(),"tatica");
    }
    return null;
  }
  public Object visitEsquemas(Tira_teimaParser.EsquemasContext ctx){
    for(Token tk: ctx.nome_tat){
      if(!tabela.existeSimbolo(tk.getText())){
        Saida.println("Identificador \""+ tk.getText() + "\" não declarado anteriormente");
      }
    }
    return null;
  }
}
