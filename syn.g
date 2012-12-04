// COMS22201: Syntax analyser

parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
}

@members
{
 
	private String cleanString(String s){

		String tmp;
		tmp = s.replaceAll("^'", "");
		s = tmp.replaceAll("'$", "");
		tmp = s.replaceAll("''", "'");
		
		return tmp;
	}

}

program : 
    PROGRAM^ programname SEMICOLON! block FULLSTOP!
  ;

programname :
    IDENTIFIER
  ;
  
type :
    REAL | INTEGER
  ;

block :
    (declarations) ?
    compoundstatement
  ;
  
declarations :
    VAR^ (declarationsx)+
  ;

// Correct the AST to display block contents on the same level  
declarationsx :	
    idlist type^ SEMICOLON!
  ;
  
idlist  :
    IDENTIFIER ( COMMA! IDENTIFIER )*
  ;

compoundstatement :
    BEGIN^ ( statement SEMICOLON! )* END!
  ;

statement :
    variable DEFINE^ expression |
    READ^ OPENPAREN! variable CLOSEPAREN! |
    WRITE^ OPENPAREN! expression CLOSEPAREN! |
    WRITE^ OPENPAREN! string CLOSEPAREN!|
    WRITELN |
    IF^ relationx compoundstatement ( ELSE! compoundstatement )? |
    REPEAT^ compoundstatement UNTIL! relationx
  ;

relationx :
    expression RELATION^ expression
  ;
		
expression : 
    unaryopx (( PLUS | MINUS)^ term )*
  ;

unaryopx :  
    ( PLUS^ | MINUS^ ) ? term
  ;

factor : 
     variable
   | constant
   | OPENPAREN! expression CLOSEPAREN! 
  ;  
   
term : 
    factor ( ( TIMES | DIVIDE )^ factor )*
  ;
  
variable : 
    IDENTIFIER
  ;
  
constant :
    INTEGERVAL | REALVAL
  ;

string
	scope { String tmp;}
	:
	s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
;
