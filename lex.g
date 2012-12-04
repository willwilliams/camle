// COMS22201: Lexical analyser

class Lex extends Lexer;

options {
  exportVocab = Lex;
  charVocabulary = '\0'..'\377';
  k = 2;           // Lookahead = 2 needed to handle strings
  caseSensitive = false;
  caseSensitiveLiterals = false;
  defaultErrorHandler = false;
}

//---------------------------------------------------------------------------
// KEYWORDS
//---------------------------------------------------------------------------
tokens {
  BEGIN      = "begin"  ;
  END        = "end"    ;
  PROGRAM    = "program";
  WRITE      = "write"  ;
  WRITELN    = "writeln";
}

//---------------------------------------------------------------------------
// OPERATORS
//---------------------------------------------------------------------------
SEMICOLON    : ';' ;
PERIOD       : '.' ;
OPENPAREN    : '(' ;
CLOSEPAREN   : ')' ;

STRING       : '\''! ('\''! '\'' | ~'\'')* '\''! ;

WS           : (' ' | '\t' | '\r' | '\n' )+ {$setType(Token.SKIP);} ;

IDENTIFIER   : ('a'..'z')+ ;
