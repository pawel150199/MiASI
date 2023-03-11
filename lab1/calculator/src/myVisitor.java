import java.util.function.DoubleToIntFunction;

public class myVisitor extends calculatorBaseVisitor<Integer> {

    @Override
    public Integer visitFile_(calculatorParser.File_Context ctx) {
        Integer result = visit(ctx.expression(0));
        System.out.println("Wynik: " + result);
        return result;
        //return super.visitFile_(ctx);
    }

    @Override
    public Integer visitParen(calculatorParser.ParenContext ctx) {
        return super.visitParen(ctx);
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