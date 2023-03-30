package interpreter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class myVisitor extends calcBaseVisitor<Integer>{

    Map<String, Integer> memory = new HashMap<String, Integer>();
    Map<String, List<calcParser.StatContext>> functions = new HashMap<>();

    @Override
    public Integer visitFor(calcParser.ForContext ctx) {
        Integer result = 0;
        for (int i = visit(ctx.expression(0)); i < visit(ctx.expression(1)); i++) {
            result = visit(ctx.then);
        }
        return result;
    }

    /*
    @Override
    public Integer visitFunctionDecl(calcParser.FunctionDeclContext ctx) {
        String functionName = ctx.funcName.getText();
        var body = ctx.stat();
        functions.put(functionName, body);
        return 0;
    }

    @Override
    public Integer visitFunctionCall(calcParser.FunctionCallContext ctx) {
        try {
            List<calcParser.StatContext> body = functions.get(ctx.funcName.getText());
            for (var expr:
                    body) {
                visit(expr);
            }
        } catch (NullPointerException e){
            System.out.println("Function was not defined");
        }
        return 0;
    }
    */

    @Override
    public Integer visitAssign(calcParser.AssignContext ctx) {
        //System.out.println("ID: " + ctx.VARIABLE().getText());
        String id = ctx.VARIABLE().getText();
        Integer value = visit(ctx.expression());

        memory.put(id, value);
        return value;
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

    /*
    @Override
    public Integer visitFile_(calcParser.File_Context ctx) {
        return Integer.parseInt(String.valueOf(visit(ctx.stat(0))));
    }
    */

    @Override
    public Integer visitIf(calcParser.IfContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)!=0) {
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
    public Integer visitPrintExpr(calcParser.PrintExprContext ctx) {
        Integer val = visit(ctx.expression());
        System.out.println(val);
        return 0;
    }

    @Override
    public Integer visitWhile(calcParser.WhileContext ctx) {
        Integer result = 0;
        Integer status = visit(ctx.cond);
        while(status==1) {
            result = visit(ctx.then);
        }
        return result;
    }

    @Override
    public Integer visitExpression_stat(calcParser.Expression_statContext ctx) {
        Integer value = visit(ctx.expression());
        System.out.println("Wynik: " + value);
        return value;
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
        Integer result = 0;
        if (memory.keySet().contains(ctx.atom().getText())) {
            result = memory.get(ctx.atom().getText());
        } else
            result = Integer.parseInt(ctx.atom().getText());
        return result;
    }

    @Override
    public Integer visitAtom(calcParser.AtomContext ctx) {
        return super.visitAtom(ctx);
    }

    @Override
    public Integer visitScientific(calcParser.ScientificContext ctx) {
        return Integer.parseInt(ctx.SCIENTIFIC_NUMBER().getText());
    }

    // Math expressions
    @Override
    public Integer visitPow(calcParser.PowContext ctx) {
        Integer result = 1;
        for (int i = 0; i < visit(ctx.expression(1)); i++) {
            result = result * visit(ctx.expression(0));

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
    public Integer visitPlus(calcParser.PlusContext ctx) {
        Integer result = 0;
        switch (ctx.op.getType()){
            case calcLexer.PLUS -> {
//                System.out.println(visit(ctx.expression(0)));
                result = visit(ctx.expression(0))+visit(ctx.expression(1));
            }
            case calcLexer.MINUS -> {
                result = visit(ctx.expression(0))-visit(ctx.expression(1));
            }
        }
        return result;
    }

    @Override
    public Integer visitFunctionDecl(calcParser.FunctionDeclContext ctx) {
        String functionName = ctx.funcName.getText();
        var body = ctx.stat();
        functions.put(functionName, body);
        return 0;
    }

    @Override
    public Integer visitFunctionCall(calcParser.FunctionCallContext ctx) {
        try {
            List<calcParser.StatContext> body = functions.get(ctx.funcName.getText());
            for (var expression:
                    body) {
                visit(expression);
            }
        } catch (NullPointerException e){
            System.out.println("Nie ma takiej funkcji");
        }
        return 0;
    }
}
