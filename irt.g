// COMS22201: IR tree construction

class Irt extends TreeParser;

options {
  importVocab = Sem;
  buildAST = true;
}

tokens {   // Need to declare the symbols used in the IR tree but not earlier
  NOOP;
  CONST;
  SEQ;
  WRS;
  MEM;
  INTNUM;  // INTNUM would normally be introduced in the lex phase, not here
}

// Ignore the program name when constructing the IR tree
program! : 
    #( PROGRAM programname b:block )  { #program = #b; }
  ;

programname :
    IDENTIFIER
  ;

block :
    compoundstatement
  ;

// Ignore the BEGIN abstract syntax in the IR tree
compoundstatement! :
    #( BEGIN ss:statements )  { #compoundstatement = #ss; }
  ;

// For simplicity, we represent a sequence of statements by a tree like
//             SEQ             instead of            SEQ
//            /   \                                 /   \
//          SEQ   s3                               s1   SEQ
//         /   \                                       /   \
//       SEQ   s2                                     s2   s3
//      /   \
//    NOOP  s1
statements! :
    { #statements = #([NOOP,"NOOP"]); }
    ( s:statement  { #statements = #([SEQ,"SEQ"], #statements, s); } )*
  ;

statement! :
    #( WRITE a:arg )  { #statement = #([WRS,"WRS"], #a); }
  | WRITELN           // Store "\n" string and represent it by its address
    { int a1 = Memory.allocateString("\n");  
      #statement = #([WRS,"WRS"],            
                     #([MEM,"MEM"],
                       #([CONST,"CONST"],
                         #([INTNUM,String.valueOf(a1)]))));
    }
  ;

// Insert a string in memory; represent it in IR tree by its address
arg! :
    s:STRING
    { int a = Memory.allocateString(s.getText());
      #arg = #([MEM,"MEM"], #([CONST,"CONST"], #([INTNUM,String.valueOf(a)]))); }
  ;
