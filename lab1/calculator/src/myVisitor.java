import java.util.HashMap;
import java.util.function.DoubleToIntFunction;

public class myVisitor extends calculatorBaseVisitor<Integer> {
    private HashMap<String, Integer> variables = new HashMap<String, Integer>();

    @Override
    public Integer visitPrintExpr(calculatorParser.PrintExprContext ctx) {
        Integer result = 0;
        result = visit(ctx.expression());
        return result;
        //return super.visitPrintExpr(ctx);
    }

    @Override
    public Integer visitAssign(calculatorParser.AssignContext ctx) {
        Integer value = visit(ctx.expression());
        String key = ctx.ID().getText();
        variables.put(key, value);
        System.out.println("Zmienna: " + key + "Wartość: " + value);
        return value;
        //return super.visitAssign(ctx);
    }

    @Override
    public Integer visitIdd(calculatorParser.IddContext ctx) {
        String key = ctx.ID().getText();
        return variables.get(key);
        //return super.visitIdd(ctx);
    }

    /*
    @Override
    public Integer visitSetVar(calculatorParser.SetVarContext ctx) {
        Integer value = visit(ctx.expression());
        String key = ctx.ID().getText();
        variables.put(key, value);
        System.out.println("Zmienna: " + key + "Wartość: " + value);
        return value;
        //return super.visitSetVar(ctx);
    }
    */

    @Override
    public Integer visitVar(calculatorParser.VarContext ctx) {
        return Integer.valueOf(ctx.VARIABLE().getText());
        //return super.visitVar(ctx);
    }

    @Override
    public Integer visitFile_(calculatorParser.File_Context ctx) {
        Integer result = visit(ctx.setVar(0));
        System.out.println("Wynik: " + result);
        return result;
        //return super.visitFile_(ctx);
    }
    @Override
    public Integer visitParen(calculatorParser.ParenContext ctx) {
        return visit(ctx.expression());
        //return super.visitParen(ctx);
    }

    @Override
    public Integer visitPlusmin(calculatorParser.PlusminContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()) {
            case calculatorLexer.PLUS -> {
                result = visit(ctx.expression(0)) + visit(ctx.expression(1));
            }
            case calculatorLexer.MINUS -> {
                result = visit(ctx.expression(0)) - visit(ctx.expression(1));
            }
        }
        System.out.println("Wynik dodawania/odejmowania: " + result);
        return result;
    }

    @Override
    public Integer visitPow(calculatorParser.PowContext ctx) {
        Double result = 0.0;
        result = Math.pow(visit(ctx.expression(0)), visit(ctx.expression(1)));
        Integer int_result = result.intValue();
        return int_result;
        //return super.visitPow(ctx);
    }

    @Override
    public Integer visitMuldiv(calculatorParser.MuldivContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()) {
            case calculatorLexer.DIV -> {
                result = visit(ctx.expression(0)) / visit(ctx.expression(1));
            }
            case calculatorLexer.TIMES-> {
                result = visit(ctx.expression(0)) * visit(ctx.expression(1));
            }
        }
        System.out.println("Wynik mnozenia/dzielenia: " + result);
        return result;
        //return super.visitMuldiv(ctx);
    }

    @Override
    public Integer visitScientific(calculatorParser.ScientificContext ctx) {
        return Integer.parseInt(ctx.SCIENTIFIC_NUMBER().toString());
        //return super.visitScientific(ctx);
    }

    @Override
    public Integer visitVariable(calculatorParser.VariableContext ctx) {
        return Integer.parseInt(ctx.VARIABLE().getText());
        //return super.visitVariable(ctx);
    }
}