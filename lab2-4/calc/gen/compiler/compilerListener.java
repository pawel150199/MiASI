// Generated from java-escape by ANTLR 4.11.1
package compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compilerParser}.
 */
public interface compilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compilerParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(compilerParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(compilerParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stat(compilerParser.Expression_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stat(compilerParser.Expression_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(compilerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(compilerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(compilerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(compilerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(compilerParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(compilerParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDecl}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(compilerParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDecl}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(compilerParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(compilerParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(compilerParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(compilerParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(compilerParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(compilerParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stat}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(compilerParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(compilerParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(compilerParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(compilerParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link compilerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(compilerParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNawias(compilerParser.NawiasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nawias}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNawias(compilerParser.NawiasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(compilerParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(compilerParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(compilerParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(compilerParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparision(compilerParser.ComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparision}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparision(compilerParser.ComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(compilerParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(compilerParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stala}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStala(compilerParser.StalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stala}
	 * labeled alternative in {@link compilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStala(compilerParser.StalaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(compilerParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(compilerParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(compilerParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(compilerParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(compilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(compilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(compilerParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(compilerParser.RelopContext ctx);
}