// Generated from matematica.g4 by ANTLR 4.5
package main.java;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link matematicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface matematicaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link matematicaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(matematicaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalo(matematicaParser.IntervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(matematicaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link matematicaParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(matematicaParser.ConstanteContext ctx);
}