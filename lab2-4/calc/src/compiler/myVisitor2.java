package compiler;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public class myVisitor2  extends compilerBaseVisitor<ST>{
    private final STGroup stGroup;
    private int counter = 0;

    public myVisitor2(STGroup group) {
        super();
        this.stGroup = group;
    }

    @Override
    public ST visitScientific(compilerParser.ScientificContext ctx) {
        ST st = stGroup.getInstanceOf("int");
        st.add("i", ctx.SCIENTIFIC_NUMBER().getText());
        return st;
    }

    @Override
    public ST visitComparision(compilerParser.ComparisionContext ctx) {
        ST st = stGroup.getInstanceOf("comparision");
        return st.add("p1", visit(ctx.expression(0))).add("p2", visit(ctx.expression(1)));
    }

    @Override
    public ST visitPlus(compilerParser.PlusContext ctx) {
        ST result = null;
        if (ctx.op.getType()  == compilerParser.PLUS) {
            ST st = stGroup.getInstanceOf("dodaj");
            result = st.add("p1", visit(ctx.expression(0))).add("p2", visit(ctx.expression(1)));
        } else {
            ST st = stGroup.getInstanceOf("odejmij");
            result = st.add("p1", visit(ctx.expression(0))).add("p2", visit(ctx.expression(1)));
        }
        return result;
    }


    @Override
    protected ST defaultResult() {
        return stGroup.getInstanceOf("deflt");
    }

    @Override
    protected ST aggregateResult(ST aggregate, ST nextResult) {
        return aggregate.add("elem", nextResult);
    }

    @Override
    public ST visitIf(compilerParser.IfContext ctx) {
        counter++;
        ST st = stGroup.getInstanceOf("pentlaif");
        if(visit(ctx.else_) != null ) {
            st.add("else_", visit(ctx.else_));
        }
        return st.add("warunek", visit(ctx.cond)).add("then", visit(ctx.then)).add("xx", counter);
    }

    @Override
    public ST visitFor(compilerParser.ForContext ctx) {
        ST st = stGroup.getInstanceOf("petlafor");
        return st.add("p1", visit(ctx.expression(0))).add("p2", visit(ctx.expression(1))).add("n", visit(ctx.then));
    }

    @Override
    public ST visitTerminal(TerminalNode node) {
        return new ST("<n>").add("n", node.getText());
    }
}
