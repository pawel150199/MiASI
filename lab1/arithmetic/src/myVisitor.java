import java.util.HashMap;
import arithmetic.arithmeticParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import arithmetic.arithmeticBaseVisitor;

public class myVisitor extends arithmeticBaseVisitor<Double> {
    private HashMap<String, Double> variables = new HashMap<String, Double>();

    @Override
    public Double visitPlus(arithmeticParser.PlusContext ctx) {
        return visit(ctx.plusOrMinus()) + visit(ctx.multOrDiv());
    }

    @Override
    public Double visitMinus(arithmeticParser.MinusContext ctx) {
        return visit(ctx.plusOrMinus()) - visit(ctx.multOrDiv());
    }

    @Override
    public Double visitMultiplication(arithmeticParser.MultiplicationContext ctx) {
        return visit(ctx.multOrDiv()) * visit(ctx.pow());
    }

    @Override
    public Double visitDivision(arithmeticParser.DivisionContext ctx) {
        return visit(ctx.multOrDiv()) / visit(ctx.pow());
    }

    @Override
    public Double visitSetVariable(arithmeticParser.SetVariableContext ctx) {
        Double value = visit(ctx.plusOrMinus());
        variables.put(ctx.ID().getText(), value);
        return value;
    }

    @Override
    public Double visitPower(arithmeticParser.PowerContext ctx) {
        if (ctx.pow() != null)
            return Math.pow(visit(ctx.unaryMinus()), visit(ctx.pow()));
        return visit(ctx.unaryMinus());
    }

    @Override
    public Double visitChangeSign(arithmeticParser.ChangeSignContext ctx) {
        return -1*visit(ctx.unaryMinus());
    }

    @Override
    public Double visitBraces(arithmeticParser.BracesContext ctx) {
        return visit(ctx.plusOrMinus());
    }

    @Override
    public Double visitConstantPI(arithmeticParser.ConstantPIContext ctx) {
        return Math.PI;
    }

    @Override
    public Double visitConstantE(arithmeticParser.ConstantEContext ctx) {
        return Math.E;
    }

    @Override
    public Double visitInt(arithmeticParser.IntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitVariable(arithmeticParser.VariableContext ctx) {
        return variables.get(ctx.ID().getText());
    }

    @Override
    public Double visitDouble(arithmeticParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitCalculate(arithmeticParser.CalculateContext ctx) {
        return visit(ctx.plusOrMinus());
    }
}