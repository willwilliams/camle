lexer grammar Lex;

@rulecatch { }

//------------------
// CASE INSENSITIVE
//------------------
fragment A 
	:	('A' | 'a')	;
fragment B 
	:	('B' | 'b')	;
fragment C 
	:	('C' | 'c')	;
fragment D 
	:	('D' | 'd')	;	
fragment E 
	:	('E' | 'e')	;
fragment F 
	:	('F' | 'f')	;
fragment G 
	:	('G' | 'g')	;
fragment H 
	:	('H' | 'h')	;
fragment I 
	:	('I' | 'i')	;
fragment J 
	:	('J' | 'j')	;	
fragment K 
	:	('K' | 'k')	;
fragment L 
	:	('L' | 'l')	;
fragment M 
	:	('M' | 'm')	;
fragment N 
	:	('N' | 'n')	;
fragment O 
	:	('O' | 'o')	;
fragment P 
	:	('P' | 'p')	;	
fragment Q 
	:	('Q' | 'q')	;
fragment R 
	:	('R' | 'r')	;
fragment S 
	:	('S' | 's')	;
fragment T 
	:	('T' | 't')	;
fragment U 
	:	('U' | 'u')	;
fragment V 
	:	('V' | 'v')	;	
fragment W 
	:	('W' | 'w')	;
fragment X 
	:	('X' | 'x')	;
fragment Y 
	:	('Y' | 'y')	;
fragment Z 
	:	('Z' | 'z')	;

//------------------
// KEYWORDS
//------------------
BEGIN 	:	B E G I N 	;
ELSE	:	E L S E		;
END	:	E N D		;
IF	:	I F		;
INTEGER	:	I N T E G E R	;
PROGRAM	:	P R O G R A M	;
READ	:	R E A D		;
REAL	:	R E A L		;
REPEAT	:	R E P E A T	;
UNTIL	:	U N T I L	;
VAR	:	V A R		;
WRITE	:	W R I T E	;
WRITELN	:	W R I T E L N	;

//------------------
// COMMENTS
//------------------

COMMENT :	'{' ~('{' | '}')* '}' {skip();};

//------------------
// Data Types
//------------------

fragment CHAR 	:	'a'..'z' | 'A'..'Z'	;
fragment DIGIT	:	'0'..'9'		;

//------------------
// OPERATORS
//------------------

SEMICOLON    	: ';' ;
FULLSTOP    	: '.' ;
OPENPAREN   	: '(' ;
CLOSEPAREN	: ')' ;
RELATION	: '>' | '>=' | '=' | '!=' | '<=' | '<' ;
DEFINE		: ':=';
PLUS		: '+';
MINUS		: '-';
TIMES		: '*';
DIVIDE		: '/';
COMMA 		: ',';

//------------------
// VALUES
//------------------

STRING       : '\'' ('\'' '\'' | ~'\'')* '\'' 		;
WS           : (' ' | '\t' | '\r' | '\n' )+ {skip();} 	;
IDENTIFIER   : CHAR ((CHAR | DIGIT) ((CHAR | DIGIT) ((CHAR | DIGIT) ((CHAR | DIGIT) ((CHAR | DIGIT) ((CHAR | DIGIT) ((CHAR | DIGIT) (CHAR | DIGIT)?)?)?)?)?)?)?)?	;
INTEGERVAL   : DIGIT+					;	
REALVAL	     : INTEGERVAL FULLSTOP INTEGERVAL ( E MINUS? INTEGERVAL )? ;