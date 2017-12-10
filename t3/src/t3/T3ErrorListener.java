package t3;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.CommonToken;

public class T3ErrorListener implements ANTLRErrorListener {

    Saida sp;

    public T3ErrorListener(Saida sp) {
        this.sp = sp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
      String str = string.replace("mismatched input","Entrada inesperada");
      str = string.replace("extraneous input","Entrada inesperada");
      str = str.replace(" expecting",". Esperada");
      str = str.replace("missing","Faltando");
      str = str.replace("at","em");

      Saida.println(str);

    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        //CommonToken ct=parser.getToken();
        //if (!sp.isModificado()) {
      //      sp.println("Linha " + i + ": " +" - simbolo não indetificado");
    //    }
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
    }
}
