// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matematicaParser}.
 */
public interface matematicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(matematicaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(matematicaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(matematicaParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(matematicaParser.ConstanteContext ctx);
}