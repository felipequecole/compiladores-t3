// Generated from t3/src/Tira_teima.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Tira_teimaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Tira_teimaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Tira_teimaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(Tira_teimaParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#nome_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_time(Tira_teimaParser.Nome_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#treinador_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTreinador_time(Tira_teimaParser.Treinador_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#conjunto_jogadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto_jogadores(Tira_teimaParser.Conjunto_jogadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#taticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaticas(Tira_teimaParser.TaticasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#esquemas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsquemas(Tira_teimaParser.EsquemasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#conteudo_esquema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConteudo_esquema(Tira_teimaParser.Conteudo_esquemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#posicionamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosicionamento(Tira_teimaParser.PosicionamentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tira_teimaParser#espacamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspacamento(Tira_teimaParser.EspacamentoContext ctx);
}