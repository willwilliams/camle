// COMS22201: Code generation

header {
  import java.io.*;
}

class Cg extends TreeParser;

options {
  importVocab = Irt;
}

{
  void emit(PrintStream o, String s)
  {
    o.println(s);
  }
}

program [PrintStream o] : 
  { emit(o, "XOR R0,R0,R0"); }  // Initialize R0 to 0
    irtree[o]
  { emit(o, "HALT");            // Program must end with HALT
    Memory.dumpData(o); }       // Dump DATA lines: initial memory contents
  ;

// Walk over IR tree (bottom up, in SEQ order), 
// converting each node to assembly code
irtree [PrintStream o] :
    #(SEQ irtree[o] irtree[o])
  | NOOP
  | #(WRS #(MEM #(CONST a:INTNUM)))  { emit(o, "WRS "+a); }
  ;
