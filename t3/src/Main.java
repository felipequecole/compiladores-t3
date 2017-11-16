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
        Saida out = new Saida();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        Tira_teimaLexer lexer = new Tira_teimaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Tira_teimaParser parser = new Tira_teimaParser(tokens);
        //remove todos os listeners de erro
        parser.removeErrorListeners();
        // adiciona o ErroListener Customizado
        parser.addErrorListener(new T3ErrorListener(out));
        //executa análise sintática

        if (!out.isModificado()) {//se foi bem sucedida
            //cria objeta analisador semantico

        } else {
            out.println("Fim da compilacao");
            System.out.print(out);
            try{
              PrintWriter writer = new PrintWriter(args[1], "UTF-8");
              writer.print(out);
              writer.close();
            } catch (IOException e) {
              e.printStackTrace();
        }
           // do somehing
        }
    }
}
