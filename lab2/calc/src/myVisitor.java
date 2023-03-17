import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class myVisitor extends calcBaseVisitor<Integer>{

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(calcParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
//        System.out.println("visitAssign value: " + value + " id: " + id);
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitId(calcParser.IdContext ctx) {
        String id = ctx.ID().getText();
        return memory.get(id);
    }

    @Override
    public Integer visitParen(calcParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitWhile(calcParser.WhileContext ctx) {
        Integer result = 0;
        while(visit(ctx.cond)==1){
            result = visit(ctx.then);
            result -= 1;
        }
        return  result;
        //return super.visitWhile(ctx);
    }

    @Override
    public Integer visitInt(calcParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPrintExpr(calcParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expression());
        System.out.println("Wynik: " + value);
        return value;
    }


    @Override
    public Integer visitIf_statement(calcParser.If_statementContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)==1) {
            result = visit(ctx.then);
        } else {
            if (ctx.else_ != null ) {
                result =  visit(ctx.else_);
            }
        }
        return  result;
        //return super.visitIf_statement(ctx);
    }

    @Override
    public Integer visitPlus_min(calcParser.Plus_minContext ctx) {
        Integer result = 0;
//        System.out.println("VisitPlus");
        switch (ctx.op.getType()){
            case calcLexer.PLUS -> {
//                System.out.println(visit(ctx.expression(0)));
                result = visit(ctx.expression(0)) + visit(ctx.expression(1));
            }
            case calcLexer.MINUS -> {
                result = visit(ctx.expression(0)) - visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitRelop(calcParser.RelopContext ctx) {
        Integer result = null;

        if (ctx.EQ() != null)  result = 0;
        if (ctx.GT() != null ) result = 1;
        if (ctx.LT() != null ) result = 2;
        return result;
        //return super.visitRelop(ctx);
    }

    @Override
    public Integer visitComparison(calcParser.ComparisonContext ctx) {
        Integer result = 0;
        switch (visit(ctx.relop())) {
            case 0:
                if (visit(ctx.expression(0))==visit(ctx.expression(1))) {
                    System.out.println("TRUE");
                    result = 1;
                } else {
                    System.out.println("FALSE");
                    result = 0;
                }
                break;
            case 1:
                if (visit(ctx.expression(0))>visit(ctx.expression(1))) {
                    System.out.println("TRUExxx");
                    result = 1;
                } else {
                    System.out.println("FALSExxx");
                    result = 0;
                }
                break;
            case 2:
                if (visit(ctx.expression(0))<visit(ctx.expression(1))) {
                    result = 1;
                } else {
                    result = 0;
                }
                break;
        }
        return result;
        //return super.visitComparison(ctx);
    }

    @Override
    public Integer visitPow(calcParser.PowContext ctx) {
        Integer result = 1;
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));

        }
        return result;
    }

    @Override
    public Integer visitMul_div(calcParser.Mul_divContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case calcLexer.TIMES -> {
                result = visit(ctx.expression(0)) * visit(ctx.expression(1));
            }
            case calcLexer.DIV -> {
                result = visit(ctx.expression(0)) / visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitConst(calcParser.ConstContext ctx) {
        int result = 3;
        return result;
    }
}
