package compiler;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public class myVisitor2  extends compilerBaseVisitor<ST>{
    private final STGroup stGroup;

    public myVisitor2(STGroup group) {
        super();
        this.stGroup = group;
    }

    @Override
    public ST visitInt(compilerParser.IntContext ctx) {
        ST st = stGroup.getInstanceOf("int");
        st.add("i", ctx.INT().getText());
        return st;
    }

    @Override
    public ST visitPlus(compilerParser.PlusContext ctx) {
        ST st = stGroup.getInstanceOf("dodaj");
        return st.add("p1", visit(ctx.expression(0))).add("p2", visit(ctx.expression(1)));
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
    public ST visitTerminal(TerminalNode node) {
        return new ST("Terminal node:<n>").add("n", node.getText());
    }
}
