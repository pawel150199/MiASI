// Generated from java-escape by ANTLR 4.11.1
package arithmetic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithmeticParser}.
 */
public interface arithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link arithmeticParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVar(arithmeticParser.ToSetVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link arithmeticParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVar(arithmeticParser.ToSetVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link arithmeticParser#input}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(arithmeticParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link arithmeticParser#input}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(arithmeticParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link arithmeticParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(arithmeticParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link arithmeticParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(arithmeticParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterToMultOrDiv(arithmeticParser.ToMultOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitToMultOrDiv(arithmeticParser.ToMultOrDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(arithmeticParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(arithmeticParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(arithmeticParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link arithmeticParser#plusOrMinus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(arithmeticParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(arithmeticParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(arithmeticParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterDivision(arithmeticParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitDivision(arithmeticParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void enterToPow(arithmeticParser.ToPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToPow}
	 * labeled alternative in {@link arithmeticParser#multOrDiv}.
	 * @param ctx the parse tree
	 */
	void exitToPow(arithmeticParser.ToPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link arithmeticParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPower(arithmeticParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link arithmeticParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPower(arithmeticParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link arithmeticParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterChangeSign(arithmeticParser.ChangeSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link arithmeticParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitChangeSign(arithmeticParser.ChangeSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link arithmeticParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(arithmeticParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link arithmeticParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(arithmeticParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(arithmeticParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(arithmeticParser.ConstantPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(arithmeticParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(arithmeticParser.ConstantEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(arithmeticParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(arithmeticParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInt(arithmeticParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInt(arithmeticParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(arithmeticParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(arithmeticParser.BracesContext ctx);
}