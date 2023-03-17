// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(calcParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(calcParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(calcParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statement}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(calcParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(calcParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(calcParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calcParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calcParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus_min(calcParser.Plus_minContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus_min}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus_min(calcParser.Plus_minContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(calcParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(calcParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(calcParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(calcParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConst(calcParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConst(calcParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(calcParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(calcParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(calcParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul_div}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(calcParser.Mul_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(calcParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(calcParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(calcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(calcParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(calcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(calcParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(calcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(calcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(calcParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(calcParser.RelopContext ctx);
}