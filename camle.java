import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
//import org.antlr.runtime.Token;
//import org.antlr.runtime.ANTLRFileStream;
//import org.antlr.runtime.CharStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

class camle {
  public static void main(String[] args)
  {
    System.out.println("CAMLE - Compiler to Abstract Machine for Language Engineering");
    String opt = "", inFile = "", outFile = "";
    int pos;
    if (Array.getLength(args) == 1 && args[0].charAt(0) != '-') {
      opt = "";
      inFile = args[0];
    }
    else if (Array.getLength(args) == 2 && args[0].charAt(0) == '-' &&
             args[1].charAt(0) != '-') {
      opt = args[0];
      inFile = args[1];
    }
    else {
      System.out.println("Usage: antlr Main [option] filename");
      System.out.println("");
      System.out.println("Options:");
      System.out.println("  -lex");
      System.out.println("  -syn");
      System.out.println("  -sem");
      System.out.println("  -irt");
      System.exit(1);
    }
    outFile = inFile;
    if ((pos = outFile.indexOf('.')) != -1)
      outFile = outFile.substring(0, pos);
    outFile = outFile+".ass";

    try {
			CharStream cs = new ANTLRFileStream(inFile);			
//      DataInputStream input = new DataInputStream(new FileInputStream(inFile));
      Lex lexO = new Lex(cs);
      if (opt.equals("-lex")) {
        Token T;
        T = lexO.nextToken();
        while (T.getText() != null) {
          System.out.println(T.getType()+" \""+T.getText()+"\"");
          T = lexO.nextToken();
        }
        System.exit(0);
      }
			
			CommonTokenStream tokens = new CommonTokenStream(lexO);


      Syn synO = new Syn(tokens);
			Syn.program_return parserResult = synO.program();//start rule
			CommonTree parserTree = (CommonTree) parserResult.getTree();
      if (opt.equals("-syn")) {
				System.out.println(parserTree.toStringTree());
        System.exit(0);
      }

      Sem semO = new Sem(new CommonTreeNodeStream(parserTree));
      Sem.program_return checkerResult = semO.program();
			CommonTree checkerTree = (CommonTree) checkerResult.getTree();
      if (opt.equals("-sem")) {
        System.out.println(checkerTree.toStringTree());
        System.exit(0);
      }

      Irt irtO = new Irt(new CommonTreeNodeStream(checkerTree));
      Irt.program_return builderResult = irtO.program();
			CommonTree builderTree = (CommonTree) builderResult.getTree();
      if (opt.equals("-irt")) {
        System.out.println(builderTree.toStringTree());
        Memory.dumpData(System.out);
        System.exit(0);
      }

      Cg cgO = new Cg(new CommonTreeNodeStream(builderTree));
      PrintStream o = new PrintStream(new FileOutputStream(outFile));
      cgO.program(o);
			
    }
    catch(Exception e) {
      System.err.println("exception: "+e);

    }
  }
}
