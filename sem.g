// COMS22201: Semantic analysis

// This version doesn't actually change the tree (AST); just copies it

class Sem extends TreeParser;

options {
  importVocab = Syn;
  buildAST = true;
}

program : 
    #( PROGRAM programname block )
  ;

programname :
    i:IDENTIFIER
  ;

block :
    compoundstatement
  ;

compoundstatement :
    #( BEGIN (statement)* )
  ;

statement :
    #( WRITE arg )
  | WRITELN
  ;

arg :
    STRING
  ;
