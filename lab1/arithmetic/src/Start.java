import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import arithmetic.arithmeticLexer;
import arithmetic.arithmeticParser;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Start {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);
        arithmeticLexer lexer = new arithmeticLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        arithmeticParser parser = new arithmeticParser(tokens);
        ParseTree tree = parser.input();

        myVisitor calcVisitor = new myVisitor();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);
    }
}