// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(calculatorParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(calculatorParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusmin}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusmin(calculatorParser.PlusminContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(calculatorParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atommul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtommul(calculatorParser.AtommulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(calculatorParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(calculatorParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(calculatorParser.VariableContext ctx);
}