// Generated from java-escape by ANTLR 4.11.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compilerParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(compilerParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_stat(compilerParser.Expression_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(compilerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(compilerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(compilerParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDecl}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(compilerParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(compilerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(compilerParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(compilerParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(compilerParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(compilerParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNawias(compilerParser.NawiasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(compilerParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(compilerParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparision(compilerParser.ComparisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(compilerParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(compilerParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stala}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStala(compilerParser.StalaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(compilerParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(compilerParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(compilerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(compilerParser.RelopContext ctx);
}