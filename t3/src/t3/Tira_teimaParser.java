// Generated from t3/src/t3/Tira_teima.g4 by ANTLR 4.7
package t3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tira_teimaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, INT=26, IDENT=27, CADEIA=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_time = 1, RULE_nome_time = 2, RULE_treinador_time = 3, 
		RULE_goleiro = 4, RULE_conjunto_jogadores = 5, RULE_pos_tatica = 6, RULE_taticas = 7, 
		RULE_esquemas = 8, RULE_conteudo_esquema = 9, RULE_posicionamento = 10, 
		RULE_espacamento = 11;
	public static final String[] ruleNames = {
		"programa", "time", "nome_time", "treinador_time", "goleiro", "conjunto_jogadores", 
		"pos_tatica", "taticas", "esquemas", "conteudo_esquema", "posicionamento", 
		"espacamento"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Time'", "'{'", "'compactacao'", "':'", "'}'", "'Nome'", "'Treinador'", 
		"'Goleiro'", "'Jogadores_de_linha'", "','", "'('", "')'", "'Taticas'", 
		"'Esquema'", "'['", "']'", "'pressao'", "'bola'", "'flanco_direito'", 
		"'flanco_esquerdo'", "'protege_gol'", "'faixa_central'", "'NULO'", "'agrupados'", 
		"'esparsos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "INT", "IDENT", "CADEIA", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tira_teima.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tira_teimaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TaticasContext taticas() {
			return getRuleContext(TaticasContext.class,0);
		}
		public List<EsquemasContext> esquemas() {
			return getRuleContexts(EsquemasContext.class);
		}
		public EsquemasContext esquemas(int i) {
			return getRuleContext(EsquemasContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			time();
			setState(25);
			taticas();
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				esquemas();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public Nome_timeContext nome_time() {
			return getRuleContext(Nome_timeContext.class,0);
		}
		public TerminalNode INT() { return getToken(Tira_teimaParser.INT, 0); }
		public Treinador_timeContext treinador_time() {
			return getRuleContext(Treinador_timeContext.class,0);
		}
		public GoleiroContext goleiro() {
			return getRuleContext(GoleiroContext.class,0);
		}
		public Conjunto_jogadoresContext conjunto_jogadores() {
			return getRuleContext(Conjunto_jogadoresContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(T__1);
			setState(33);
			nome_time();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(34);
				treinador_time();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(37);
				goleiro();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(40);
				conjunto_jogadores();
				}
			}

			setState(43);
			match(T__2);
			setState(44);
			match(T__3);
			setState(45);
			match(INT);
			setState(46);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_timeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(Tira_teimaParser.CADEIA, 0); }
		public Nome_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterNome_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitNome_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitNome_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_timeContext nome_time() throws RecognitionException {
		Nome_timeContext _localctx = new Nome_timeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(49);
			match(T__3);
			setState(50);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Treinador_timeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(Tira_teimaParser.CADEIA, 0); }
		public Treinador_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treinador_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterTreinador_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitTreinador_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitTreinador_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Treinador_timeContext treinador_time() throws RecognitionException {
		Treinador_timeContext _localctx = new Treinador_timeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_treinador_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__6);
			setState(53);
			match(T__3);
			setState(54);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoleiroContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(Tira_teimaParser.CADEIA, 0); }
		public GoleiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goleiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterGoleiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitGoleiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitGoleiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoleiroContext goleiro() throws RecognitionException {
		GoleiroContext _localctx = new GoleiroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_goleiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__7);
			setState(57);
			match(T__3);
			setState(58);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conjunto_jogadoresContext extends ParserRuleContext {
		public Token CADEIA;
		public List<Token> l_jog = new ArrayList<Token>();
		public List<TerminalNode> CADEIA() { return getTokens(Tira_teimaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(Tira_teimaParser.CADEIA, i);
		}
		public Conjunto_jogadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto_jogadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterConjunto_jogadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitConjunto_jogadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitConjunto_jogadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conjunto_jogadoresContext conjunto_jogadores() throws RecognitionException {
		Conjunto_jogadoresContext _localctx = new Conjunto_jogadoresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conjunto_jogadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__8);
			setState(61);
			match(T__3);
			setState(62);
			((Conjunto_jogadoresContext)_localctx).CADEIA = match(CADEIA);
			((Conjunto_jogadoresContext)_localctx).l_jog.add(((Conjunto_jogadoresContext)_localctx).CADEIA);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(63);
				match(T__9);
				setState(64);
				((Conjunto_jogadoresContext)_localctx).CADEIA = match(CADEIA);
				((Conjunto_jogadoresContext)_localctx).l_jog.add(((Conjunto_jogadoresContext)_localctx).CADEIA);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pos_taticaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Tira_teimaParser.IDENT, 0); }
		public List<PosicionamentoContext> posicionamento() {
			return getRuleContexts(PosicionamentoContext.class);
		}
		public PosicionamentoContext posicionamento(int i) {
			return getRuleContext(PosicionamentoContext.class,i);
		}
		public EspacamentoContext espacamento() {
			return getRuleContext(EspacamentoContext.class,0);
		}
		public Pos_taticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_tatica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterPos_tatica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitPos_tatica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitPos_tatica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pos_taticaContext pos_tatica() throws RecognitionException {
		Pos_taticaContext _localctx = new Pos_taticaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pos_tatica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENT);
			setState(71);
			match(T__10);
			setState(72);
			posicionamento();
			setState(73);
			match(T__9);
			setState(74);
			posicionamento();
			setState(75);
			match(T__9);
			setState(76);
			espacamento();
			setState(77);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaticasContext extends ParserRuleContext {
		public Pos_taticaContext pos_tatica;
		public List<Pos_taticaContext> list_taticas = new ArrayList<Pos_taticaContext>();
		public List<Pos_taticaContext> pos_tatica() {
			return getRuleContexts(Pos_taticaContext.class);
		}
		public Pos_taticaContext pos_tatica(int i) {
			return getRuleContext(Pos_taticaContext.class,i);
		}
		public TaticasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taticas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterTaticas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitTaticas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitTaticas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaticasContext taticas() throws RecognitionException {
		TaticasContext _localctx = new TaticasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_taticas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__12);
			setState(80);
			match(T__1);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				((TaticasContext)_localctx).pos_tatica = pos_tatica();
				((TaticasContext)_localctx).list_taticas.add(((TaticasContext)_localctx).pos_tatica);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(86);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EsquemasContext extends ParserRuleContext {
		public Conteudo_esquemaContext conteudo_esquema;
		public List<Conteudo_esquemaContext> lista_jog_tat = new ArrayList<Conteudo_esquemaContext>();
		public Token IDENT;
		public List<Token> nome_tat = new ArrayList<Token>();
		public List<TerminalNode> IDENT() { return getTokens(Tira_teimaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Tira_teimaParser.IDENT, i);
		}
		public List<Conteudo_esquemaContext> conteudo_esquema() {
			return getRuleContexts(Conteudo_esquemaContext.class);
		}
		public Conteudo_esquemaContext conteudo_esquema(int i) {
			return getRuleContext(Conteudo_esquemaContext.class,i);
		}
		public EsquemasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esquemas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterEsquemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitEsquemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitEsquemas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsquemasContext esquemas() throws RecognitionException {
		EsquemasContext _localctx = new EsquemasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_esquemas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__13);
			setState(89);
			match(IDENT);
			setState(90);
			match(T__1);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				((EsquemasContext)_localctx).conteudo_esquema = conteudo_esquema();
				((EsquemasContext)_localctx).lista_jog_tat.add(((EsquemasContext)_localctx).conteudo_esquema);
				setState(92);
				match(T__3);
				setState(93);
				((EsquemasContext)_localctx).IDENT = match(IDENT);
				((EsquemasContext)_localctx).nome_tat.add(((EsquemasContext)_localctx).IDENT);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 || _la==CADEIA );
			setState(99);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conteudo_esquemaContext extends ParserRuleContext {
		public Token CADEIA;
		public List<Token> l_jog_esq = new ArrayList<Token>();
		public List<TerminalNode> CADEIA() { return getTokens(Tira_teimaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(Tira_teimaParser.CADEIA, i);
		}
		public TerminalNode INT() { return getToken(Tira_teimaParser.INT, 0); }
		public Conteudo_esquemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo_esquema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterConteudo_esquema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitConteudo_esquema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitConteudo_esquema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conteudo_esquemaContext conteudo_esquema() throws RecognitionException {
		Conteudo_esquemaContext _localctx = new Conteudo_esquemaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conteudo_esquema);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((Conteudo_esquemaContext)_localctx).CADEIA = match(CADEIA);
				((Conteudo_esquemaContext)_localctx).l_jog_esq.add(((Conteudo_esquemaContext)_localctx).CADEIA);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(102);
					match(T__9);
					setState(103);
					((Conteudo_esquemaContext)_localctx).CADEIA = match(CADEIA);
					((Conteudo_esquemaContext)_localctx).l_jog_esq.add(((Conteudo_esquemaContext)_localctx).CADEIA);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__14);
				setState(110);
				match(INT);
				setState(111);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosicionamentoContext extends ParserRuleContext {
		public PosicionamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posicionamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterPosicionamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitPosicionamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitPosicionamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosicionamentoContext posicionamento() throws RecognitionException {
		PosicionamentoContext _localctx = new PosicionamentoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_posicionamento);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__20);
				setState(119);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EspacamentoContext extends ParserRuleContext {
		public EspacamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espacamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).enterEspacamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tira_teimaListener ) ((Tira_teimaListener)listener).exitEspacamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tira_teimaVisitor ) return ((Tira_teimaVisitor<? extends T>)visitor).visitEspacamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspacamentoContext espacamento() throws RecognitionException {
		EspacamentoContext _localctx = new EspacamentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_espacamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\3\5\3)\n\3\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7D\n\7\f\7"+
		"\16\7G\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tU\n\t\r"+
		"\t\16\tV\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\nb\n\n\r\n\16\nc\3\n\3"+
		"\n\3\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\13\3\13\3\13\5\13s\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\2\3\3\2\32\33\2\u0081\2\32\3\2\2\2\4!\3\2\2\2\6\62"+
		"\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f>\3\2\2\2\16H\3\2\2\2\20Q\3\2\2\2\22"+
		"Z\3\2\2\2\24r\3\2\2\2\26{\3\2\2\2\30}\3\2\2\2\32\33\5\4\3\2\33\35\5\20"+
		"\t\2\34\36\5\22\n\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 \3\3\2\2\2!\"\7\3\2\2\"#\7\4\2\2#%\5\6\4\2$&\5\b\5\2%$\3\2\2\2%&"+
		"\3\2\2\2&(\3\2\2\2\')\5\n\6\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\f\7\2"+
		"+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\5\2\2./\7\6\2\2/\60\7\34\2\2\60\61"+
		"\7\7\2\2\61\5\3\2\2\2\62\63\7\b\2\2\63\64\7\6\2\2\64\65\7\36\2\2\65\7"+
		"\3\2\2\2\66\67\7\t\2\2\678\7\6\2\289\7\36\2\29\t\3\2\2\2:;\7\n\2\2;<\7"+
		"\6\2\2<=\7\36\2\2=\13\3\2\2\2>?\7\13\2\2?@\7\6\2\2@E\7\36\2\2AB\7\f\2"+
		"\2BD\7\36\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\r\3\2\2\2GE\3\2"+
		"\2\2HI\7\35\2\2IJ\7\r\2\2JK\5\26\f\2KL\7\f\2\2LM\5\26\f\2MN\7\f\2\2NO"+
		"\5\30\r\2OP\7\16\2\2P\17\3\2\2\2QR\7\17\2\2RT\7\4\2\2SU\5\16\b\2TS\3\2"+
		"\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\7\2\2Y\21\3\2\2\2Z[\7"+
		"\20\2\2[\\\7\35\2\2\\a\7\4\2\2]^\5\24\13\2^_\7\6\2\2_`\7\35\2\2`b\3\2"+
		"\2\2a]\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\7\2\2f\23\3"+
		"\2\2\2gl\7\36\2\2hi\7\f\2\2ik\7\36\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2l"+
		"m\3\2\2\2ms\3\2\2\2nl\3\2\2\2op\7\21\2\2pq\7\34\2\2qs\7\22\2\2rg\3\2\2"+
		"\2ro\3\2\2\2s\25\3\2\2\2t|\7\23\2\2u|\7\24\2\2v|\7\25\2\2w|\7\26\2\2x"+
		"y\7\27\2\2y|\7\30\2\2z|\7\31\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2"+
		"\2{x\3\2\2\2{z\3\2\2\2|\27\3\2\2\2}~\t\2\2\2~\31\3\2\2\2\f\37%(+EVclr"+
		"{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}