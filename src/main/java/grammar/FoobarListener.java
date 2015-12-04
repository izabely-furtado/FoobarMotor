// Generated from C:\Users\Izabely\Documents\GitHub\FoobarMotor\src\main\java\Grammar\Foobar.g4 by ANTLR 4.1
package grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoobarParser}.
 */
public interface FoobarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FoobarParser#nomeCidade}.
	 * @param ctx the parse tree
	 */
	void enterNomeCidade(@NotNull FoobarParser.NomeCidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#nomeCidade}.
	 * @param ctx the parse tree
	 */
	void exitNomeCidade(@NotNull FoobarParser.NomeCidadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#cidade}.
	 * @param ctx the parse tree
	 */
	void enterCidade(@NotNull FoobarParser.CidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#cidade}.
	 * @param ctx the parse tree
	 */
	void exitCidade(@NotNull FoobarParser.CidadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull FoobarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull FoobarParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#palavra}.
	 * @param ctx the parse tree
	 */
	void enterPalavra(@NotNull FoobarParser.PalavraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#palavra}.
	 * @param ctx the parse tree
	 */
	void exitPalavra(@NotNull FoobarParser.PalavraContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#mapa}.
	 * @param ctx the parse tree
	 */
	void enterMapa(@NotNull FoobarParser.MapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#mapa}.
	 * @param ctx the parse tree
	 */
	void exitMapa(@NotNull FoobarParser.MapaContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull FoobarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull FoobarParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link FoobarParser#direcao}.
	 * @param ctx the parse tree
	 */
	void enterDirecao(@NotNull FoobarParser.DirecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoobarParser#direcao}.
	 * @param ctx the parse tree
	 */
	void exitDirecao(@NotNull FoobarParser.DirecaoContext ctx);
}