package t3;

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String args[]) throws IOException, RecognitionException {


        t3.Saida out = new t3.Saida();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        t3.Tira_teimaLexer lexer = new t3.Tira_teimaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        t3.Tira_teimaParser parser = new t3.Tira_teimaParser(tokens);
        //remove todos os listeners de erro
        parser.removeErrorListeners();
        // adiciona o ErroListener Customizado
        parser.addErrorListener(new t3.T3ErrorListener(out));
        //executa análise sintática
        Tira_teimaParser.ProgramaContext arvore = parser.programa();

        if (!out.isModificado()) {//se foi bem sucedida
            //cria objeta analisador semantico
            AnalisadorSemantico as=new AnalisadorSemantico();
            Time time = new Time();
            as.setTime(time);
            //executa a análise sintatica
            as.visitPrograma(arvore);

            if(!out.isModificado()){

            GeradorDeCodigo gc = new GeradorDeCodigo();
            ParseTreeWalker.DEFAULT.walk(gc, arvore);
            try{
                PrintWriter writer = new PrintWriter(args[1], "UTF-8");
                writer.print(gc.toString());
                writer.close();
                Runtime run = Runtime.getRuntime();
                run.exec("python3 " + args[1]);
                return ;
            } catch (IOException e) {
                e.printStackTrace();
            }
          }
        }

            out.println("Fim da compilacao\n");
            System.out.print("\nErros:\n"+Saida.getTexto());
            try{
              PrintWriter writer = new PrintWriter(args[1], "UTF-8");
              //System()
              writer.print(Saida.getTexto());
              writer.close();
            } catch (IOException e) {
              e.printStackTrace();

           // do somehing
        }
    }
}
