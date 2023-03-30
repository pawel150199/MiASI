package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        CharStream input = null;
        // create a CharStream that reads from standard input
        try {
            input = CharStreams.fromFileName("input");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        */
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        compilerLexer lexer = new compilerLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        compilerParser parser = new compilerParser(tokens);

        // start parsing at the file_ rule
        ParseTree tree = parser.file_();

        STGroup group= new STGroupFile("src/compiler/register.stg");
        myVisitor2 em = new myVisitor2(group);
        ST res = em.visit(tree);
        System.out.println(res.render());
        // System.out.println(tree.toStringTree());

        // create a visitor to traverse the parse tree
        //myVisitor2 visitor = new myVisitor2();
        //Integer output = visitor.visit(tree);
        //System.out.println("Wynik operacji: " + output);
    }
}