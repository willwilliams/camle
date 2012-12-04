import java.io.*;
import java.lang.reflect.Array;
import antlr.collections.AST;
import antlr.Token;

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
      DataInputStream input = new DataInputStream(new FileInputStream(inFile));
      Lex lexO = new Lex(input);
      if (opt.equals("-lex")) {
        Token T;
        T = lexO.nextToken();
        while (T.getText() != null) {
          System.out.println(T.getType()+" \""+T.getText()+"\"");
          T = lexO.nextToken();
        }
        System.exit(0);
      }

      Syn synO = new Syn(lexO);
      synO.program();
      AST synOut = synO.getAST();
      if (opt.equals("-syn")) {
        System.out.println(synOut.toStringList());
        System.exit(0);
      }

      Sem semO = new Sem();
      semO.program(synOut);
      AST semOut = semO.getAST();
      if (opt.equals("-sem")) {
        System.out.println(semOut.toStringList());
        System.exit(0);
      }

      Irt irtO = new Irt();
      irtO.program(semOut);
      AST irtOut = irtO.getAST();
      if (opt.equals("-irt")) {
        System.out.println(irtOut.toStringList());
        Memory.dumpData(System.out);
        System.exit(0);
      }

      Cg cgO = new Cg();
      PrintStream o = new PrintStream(new FileOutputStream(outFile));
      cgO.program(irtOut, o);
    }
    catch(Exception e) {
      System.err.println("exception: "+e);
    }
  }
}
