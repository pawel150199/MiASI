// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(calculatorParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(calculatorParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(calculatorParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(calculatorParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusmin}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusmin(calculatorParser.PlusminContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusmin}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusmin(calculatorParser.PlusminContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(calculatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(calculatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idd}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdd(calculatorParser.IddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idd}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdd(calculatorParser.IddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(calculatorParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(calculatorParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scienttific_num}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterScienttific_num(calculatorParser.Scienttific_numContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scienttific_num}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitScienttific_num(calculatorParser.Scienttific_numContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atommul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtommul(calculatorParser.AtommulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atommul}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtommul(calculatorParser.AtommulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(calculatorParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link calculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(calculatorParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterNull(calculatorParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link calculatorParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitNull(calculatorParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(calculatorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(calculatorParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(calculatorParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(calculatorParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(calculatorParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(calculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(calculatorParser.VariableContext ctx);
}