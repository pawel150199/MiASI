import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class myVisitor extends calcBaseVisitor<Integer>{

    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(calcParser.AssignContext ctx) {
        System.out.println("ID: " + ctx.ID().getText());
        String id = ctx.ID().getText();
        int value = visit(ctx.expression());
//        System.out.println("visitAssign value: " + value + " id: " + id);
        memory.put(id, value);

        System.out.println(memory);
        return value;
    }

    @Override
    public Integer visitId(calcParser.IdContext ctx) {
        String id = ctx.ID().getText();
        return memory.get(id);
    }

    @Override
    public Integer visitComparision(calcParser.ComparisionContext ctx) {
        Integer result = 0;
        switch (visit(ctx.relop())) {
            case 0:
                if (visit(ctx.expression(0))==visit(ctx.expression(1))) {
                    result = 1;
                } else {
                    result = 0;
                }
                break;
            case 1:
                if (visit(ctx.expression(0))>visit(ctx.expression(1))) {
                    result = 1;
                } else {
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
    }

    @Override
    public Integer visitPlus(calcParser.PlusContext ctx) {
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
    public Integer visitMul(calcParser.MulContext ctx) {
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
    public Integer visitIf(calcParser.IfContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)==1) {
            result = visit(ctx.then);
        } else {
            if (ctx.else_ != null ) {
                result =  visit(ctx.else_);
            }
        }
        return  result;
    }

    @Override
    public Integer visitNawias(calcParser.NawiasContext ctx) {
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
    public Integer visitExpression_stat(calcParser.Expression_statContext ctx) {
        Integer value = visit(ctx.expression());
        //System.out.println("Wynik: " + value);
        return value;
    }

    @Override
    public Integer visitInt(calcParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
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
    public Integer visitStala(calcParser.StalaContext ctx) {
        System.out.println("TYP: " + ctx.atom().getText());
        System.out.println("STAŁA: " + memory.get(ctx.atom().getText()));
        Integer result = memory.get(ctx.atom().getText());
        return result;
    }

    @Override
    public Integer visitScientific(calcParser.ScientificContext ctx) {
        return Integer.parseInt(ctx.SCIENTIFIC_NUMBER().getText());
    }

    @Override
    public Integer visitPow(calcParser.PowContext ctx) {
        Integer result = 1;
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));

        }
        return result;
    }
}
