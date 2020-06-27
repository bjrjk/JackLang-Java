import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String filename=args[0];
		System.out.println("Input JackLang FileName: "+ filename);
		JackLangTraversal eval = new JackLangTraversal();
		FileInputStream f=new FileInputStream(filename);
		ANTLRInputStream input = new ANTLRInputStream(f);
        JackLangLexer lexer = new JackLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JackLangParser parser = new JackLangParser(tokens);
        ParseTree tree = parser.prog();
        eval.visit(tree);
        try {
        	
        }catch(Exception e) {
        	System.err.println("An Exception occured, Program terminated.");
        }
	}
}
