// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(calcParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(calcParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(calcParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(calcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(calcParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_min(calcParser.Plus_minContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(calcParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(calcParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(calcParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(calcParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(calcParser.Mul_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(calcParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(calcParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(calcParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(calcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(calcParser.RelopContext ctx);
}