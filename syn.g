// COMS22201: Syntax analyser

class Syn extends Parser;

options {
  importVocab = Lex;
  buildAST = true;
}

program : 
    PROGRAM^ programname SEMICOLON! block PERIOD!
  ;

programname :
    IDENTIFIER
  ;

block :
    compoundstatement
  ;

compoundstatement :
    BEGIN^ ( statement SEMICOLON! )* END!
  ;

statement :
    WRITE^ OPENPAREN! STRING CLOSEPAREN!
  | WRITELN
  ;
