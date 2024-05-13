import AST.Program;
import antlr.ReactLexer;
import antlr.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.Visitor;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String source= "TestFiles/product.txt";
        CharStream charStream= CharStreams.fromFileName(source);
        ReactLexer reactLexer= new ReactLexer(charStream) ;
        CommonTokenStream commonTokenStream=new CommonTokenStream(reactLexer);
        ReactParser reactParser=new ReactParser(commonTokenStream);
        ParseTree parseTree=reactParser.prog();
        Visitor visitor=new Visitor();
        Program program=(Program) visitor.visit(parseTree);
        System.out.println(program);
    }
}