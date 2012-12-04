// COMS22201: IR tree construction

tree grammar Irt;

options {
  tokenVocab = Sem;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {   // Need to declare the symbols used in the IR tree but not earlier
  NOOP = 'NOOP';
  CONST = 'CONST';
  SEQ = 'SEQ';
  WRS = 'WRS';
  WRC = 'WRC';
  WRR = 'WRR';
  MEM = 'MEM';
  ADDI = 'ADDI';
  SUBI = 'SUBI';
  ADD = 'ADD';
  SUB = 'SUB';
  MUL = 'MUL';
  DIV = 'DIV';
  ADDR = 'ADDR';
  SUBR = 'SUBR';
  MULR = 'MULR';
  DIVR = 'DIVR';
  RTOI = 'RTOI';
  ITOR = 'ITOR';
  MOVIR = 'MOVIR';
  REGISTERLOC = 'REGISTERLOC';
  CONSTANT = 'CONSTANT';
  TEMPV = 'TEMPV';
  RD = 'RD';
  RDR = 'RDR';

  BNEZ ='BNEZ';
  BLTZ ='BLTZ';
  BGEZ ='BGEZ';
  BEQZ = 'BEQZ';
  BNEZR = 'BNEZR';
  BLTZR = 'BLTZR';
  BGEZR = 'BGEZR';
  BEQZR = 'BEQZR';
  
  BNEZL ='BNEZL';
  BLTZL ='BLTZL';
  BGEZL ='BGEZL';
  BEQZL = 'BEQZL';
  BNEZRL = 'BNEZRL';
  BLTZRL = 'BLTZRL';
  BGEZRL = 'BGEZRL';
  BEQZRL = 'BEQZRL';
  
  
  RBNEZ ='RBNEZ';
  RBLTZ ='RBLTZ';
  RBGEZ ='RBGEZ';
  RBEQZ = 'RBEQZ';
  RBNEZR = 'RBNEZR';
  RBLTZR = 'RBLTZR';
  RBGEZR = 'RBGEZR';
  RBEQZR = 'RBEQZR';
  
  LABEL = 'LABEL';
  JUMP = 'JUMP';
  
  EMPTY = 'EMPTY';
  
  INTNUM;  // INTNUM would normally be introduced in the lex phase, not here
  REALNUM;
}

// Include hash table to hold identifiers register
@header {
  import java.util.Hashtable;
}

@members {
  private Hashtable<String, String> ht = new Hashtable<String, String>();
  
  private void addIdentifier(String id, String reg){
    ht.put(id, reg);
  }
  
  private String getIdentifierReg(String id){
    return ht.get(id);
  }
}

// Ignore the program name when constructing the IR tree
program : 
    ^( PROGRAM programname b=block ) -> ^( $b );
  
programname :
    IDENTIFIER
  ;

block :
   declaration? c = compoundstatement -> ^($c)
  ;

declaration :	
    ^(VAR declaration2+)
    ;

declaration2 :
    ^(REAL ids)
    | ^(INTEGER ids)
    ;
    
ids 
    scope{ String regLocation}
    :
    r = IDENTIFIER ids {int a2 = Memory.addRegister(1); $ids::regLocation=String.valueOf(a2); addIdentifier(r.getText().toLowerCase(), $ids::regLocation);}
    | r = IDENTIFIER {int a2 = Memory.addRegister(1); $ids::regLocation=String.valueOf(a2); addIdentifier(r.getText().toLowerCase(), $ids::regLocation);}
    ;  	

// Ignore the BEGIN abstract syntax in the IR tree
compoundstatement :
    ^( BEGIN ss=statements ) -> ^($ss)
   | BEGIN -> TEMPV
  ;
  
statements 
	scope {boolean start; } 
	@init{ $statements::start=true; }
	:  
	(		//gated symantic predicate
		(	{$statements::start==true}?  => 
			ss=statement { $statements::start=false; } ->  ^(SEQ NOOP $ss)
		) 
		|
		( {$statements::start==false}? => 
			ss=statement -> ^(SEQ $statements $ss)	
		)
	)*
		;

statement
	scope { String st1; String st2; String st3; String type; String label; String label2}
	:
		^( WRITE a=arg ) ->  ^(WRS ^($a))
		
		| WRITELN { int a1 = Memory.allocateString("\n"); $statement::st1=String.valueOf(a1); } 
		-> ^(WRS ^(MEM ^(CONST ^(INTNUM[$statement::st1]))))
		
		| ^(WRITE e=expression) {$statement::type=$e.ctype; $statement::st1=$e.expression_res; Memory.dumpRegister($statement::st1);} 
		-> {$statement::type.equals("real")}? ^(WRR ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^($e ) )
		-> ^(WRC ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^($e) )
		
		| ^(READ ^(REAL i=IDENTIFIER)) { $statement::st1 = getIdentifierReg(i.getText().toLowerCase()); }
		-> ^(RDR ^(REGISTERLOC ^(INTNUM[$statement::st1])))
		
		| ^(READ ^(INTEGER i=IDENTIFIER)) { $statement::st1 = getIdentifierReg(i.getText().toLowerCase()); }
		-> ^(RD ^(REGISTERLOC ^(INTNUM[$statement::st1])))
		
		| ^(DEFINE ^(INTEGER i=IDENTIFIER) e=expression) {$statement::st1 = getIdentifierReg(i.getText().toLowerCase()); $statement::st2 = ($e.expression_res); $statement::st3=$e.ctype;  Memory.dumpRegister($statement::st1); Memory.dumpRegister($statement::st2);}
		-> {$statement::st3.equals("real")}? ^(RTOI ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^($e))
		-> ^(ADDI ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(CONSTANT ^(INTNUM["0"])) ^($e))
	
		| ^(DEFINE ^(REAL r=IDENTIFIER) e=expression) {$statement::st1 = getIdentifierReg(r.getText().toLowerCase()); $statement::st2 = ($e.expression_res); $statement::st3=$e.ctype; Memory.dumpRegister($statement::st1); Memory.dumpRegister($statement::st2); }
		-> {$statement::st3.equals("int")}? ^(ITOR ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^($e))
		-> ^(ADDR ^(REGISTERLOC ^(INTNUM[$statement::st1])) ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(REGISTERLOC ^(INTNUM["0"])) ^($e))

		| ^(IF c=conditions) -> ^($c)
		
		| ^(REPEAT c1=compoundstatement q=evalcondit) {$statement::st2 = $q.eval_res; $statement::label = String.valueOf(Memory.addLabel()); Memory.dumpRegister($statement::st2); }
		-> {$q.type.equals("=") && $q.reg_type.equals("int")}? ^(RBNEZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q))
		-> {$q.type.equals("!=") && $q.reg_type.equals("int")}? ^(RBEQZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals(">=") && $q.reg_type.equals("int")}? ^(RBLTZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals("<=") && $q.reg_type.equals("int")}? ^(RBLTZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals(">") && $q.reg_type.equals("int")}? ^(RBGEZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals("<") && $q.reg_type.equals("int")}? ^(RBGEZ ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) ) // Less than
		
		-> {$q.type.equals("=") && $q.reg_type.equals("real")}? ^(RBNEZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals("!=") && $q.reg_type.equals("real")}? ^(RBEQZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals(">=") && $q.reg_type.equals("real")}? ^(RBLTZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals("<=") && $q.reg_type.equals("real")}? ^(RBLTZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) )
		-> {$q.type.equals(">") && $q.reg_type.equals("real")}? ^(RBGEZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1) ^($q) ) 
		-> ^(RBGEZR ^(REGISTERLOC ^(INTNUM[$statement::st2])) ^(LABEL ^(INTNUM[$statement::label])) ^($c1)  ^($q)) //Less than
		;
	
conditions 
	scope { String st1; String st2; String st3; String type; String label; String label2}	
	:
   (q=evalcondit c1=compoundstatement c2=compoundstatement) => q=evalcondit c1=compoundstatement c2=compoundstatement {$conditions::st2 = $q.eval_res; $conditions::label = String.valueOf(Memory.addLabel()); $conditions::label2 = String.valueOf(Memory.addLabel()); Memory.dumpRegister($conditions::st2);}
	-> {$q.type.equals("=") && $q.reg_type.equals("int")}? ^(BNEZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("!=") && $q.reg_type.equals("int")}? ^(BEQZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">=") && $q.reg_type.equals("int")}? ^(BLTZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<=") && $q.reg_type.equals("int")}? ^(BLTZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">") && $q.reg_type.equals("int")}? ^(BGEZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<") && $q.reg_type.equals("int")}? ^(BGEZL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	
	-> {$q.type.equals("=") && $q.reg_type.equals("real")}? ^(BNEZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("!=") && $q.reg_type.equals("real")}? ^(BEQZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">=") && $q.reg_type.equals("real")}? ^(BLTZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<=") && $q.reg_type.equals("real")}? ^(BLTZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">") && $q.reg_type.equals("real")}? ^(BGEZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label])))
	-> ^(BGEZRL ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($q) ^($c1) ^(JUMP ^(INTNUM[$conditions::label])) ^(LABEL ^(INTNUM[$conditions::label2])) ^($c2) ^(LABEL ^(INTNUM[$conditions::label]))) // Less than	     
  
   | q=evalcondit c1=compoundstatement {$conditions::st2 = $q.eval_res; $conditions::label = String.valueOf(Memory.addLabel()); Memory.dumpRegister($conditions::st2);}
	-> {$q.type.equals("=") && $q.reg_type.equals("int")}? ^(BNEZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("!=") && $q.reg_type.equals("int")}? ^(BEQZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">=") && $q.reg_type.equals("int")}? ^(BLTZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<=") && $q.reg_type.equals("int")}? ^(BLTZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))	
	-> {$q.type.equals(">") && $q.reg_type.equals("int")}? ^(BGEZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<") && $q.reg_type.equals("int")}? ^(BGEZ ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label]))) // Less than
	
	-> {$q.type.equals("=") && $q.reg_type.equals("real")}? ^(BNEZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("!=") && $q.reg_type.equals("real")}? ^(BEQZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals(">=") && $q.reg_type.equals("real")}? ^(BLTZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> {$q.type.equals("<=") && $q.reg_type.equals("real")}? ^(BLTZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))	
	-> {$q.type.equals(">") && $q.reg_type.equals("real")}? ^(BGEZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label])))
	-> ^(BGEZR ^(REGISTERLOC ^(INTNUM[$conditions::st2])) ^(LABEL ^(INTNUM[$conditions::label])) ^($q) ^($c1) ^(LABEL ^(INTNUM[$conditions::label]))) // Less than
		;	

evalcondit returns[String eval_res, String type, String reg_type]
	scope {String st1; String st2; String new1}
	:	
	^(r=RELATION e1=expression e2=expression) {$evalcondit::new1 = String.valueOf(Memory.addRegister()); $eval_res=$evalcondit::new1; $evalcondit::st1 = $e1.expression_res; $evalcondit::st2 = $e2.expression_res; $type = $r.getText(); $reg_type=$e1.ctype; Memory.dumpRegister($evalcondit::st2); Memory.dumpRegister($evalcondit::st1);}
	-> {$r.getText().equals("=") && $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> {$r.getText().equals("!=") && $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> {$r.getText().equals(">=") && $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2]))^($e1) ^($e2))
	-> {$r.getText().equals("<=") && $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1]))^($e1) ^($e2))
	-> {$r.getText().equals(">") && $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> {$r.getText().equals("<")&& $e1.ctype.equals("int")}? ^(SUB ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2]))^($e1) ^($e2)) // Less than
	
	-> {$r.getText().equals("=") && $e1.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> {$r.getText().equals("!=") && $e1.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> {$r.getText().equals(">=") && $e1.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2]))^($e1) ^($e2))
	-> {$r.getText().equals("<=") && $e1.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1]))^($e1) ^($e2))
	-> {$r.getText().equals(">") && $e1.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^($e1) ^($e2))
	-> ^(SUBR ^(REGISTERLOC ^(INTNUM[$evalcondit::new1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st1])) ^(REGISTERLOC ^(INTNUM[$evalcondit::st2]))^($e1) ^($e2)) // Less than
	;

// Insert a string in memory; represent it in IR tree by its address
arg 
	scope { String st2; }
	: 
	s=STRING {int a2 = Memory.allocateString($s.getText()); $arg::st2=String.valueOf(a2);} 
	-> ^(MEM ^(CONST ^(INTNUM[$arg::st2])))
	;

// Insert arithmetic expressions into a register
expression returns [String expression_res, String ctype]
	scope {String i; String j}
	:
	ic = intconst {$expression_res = ic.expression_res; $ctype = ic.ctype;}
	
	| rc = realconst {$expression_res = rc.expression_res; $ctype = rc.ctype;}
	
	| v = intvar {$expression_res = v.expression_res; $ctype = v.ctype;}
	
	| r = realvar {$expression_res = r.expression_res; $ctype = r.ctype;}
	
	| ^(PLUS y=expression z=expression) {int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2); $expression::i = $y.expression_res; $expression::j = $z.expression_res; $ctype=$y.ctype; Memory.dumpRegister($expression::j); Memory.dumpRegister($expression::i);}
	-> {$y.ctype.equals("real")}? ^(ADDR ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	-> ^(ADD ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	
	| ^(MINUS y=expression z=expression) {int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2); $expression::i = $y.expression_res; $expression::j = $z.expression_res; $ctype=$y.ctype; Memory.dumpRegister($expression::j); Memory.dumpRegister($expression::i);}
	-> {$y.ctype.equals("real")}? ^(SUBR ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	-> ^(SUB ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	
	| ^(DIVIDE y=expression z=expression) {int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2); $expression::i = $y.expression_res; $expression::j = $z.expression_res; $ctype=$y.ctype; Memory.dumpRegister($expression::j); Memory.dumpRegister($expression::i);}
	-> {$y.ctype.equals("real")}? ^(DIVR ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	-> ^(DIV ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	
	| ^(TIMES y=expression z=expression) {int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2); $expression::i = $y.expression_res; $expression::j = $z.expression_res; $ctype=$y.ctype; Memory.dumpRegister($expression::j); Memory.dumpRegister($expression::i);}
	-> {$y.ctype.equals("real")}? ^(MULR ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	-> ^(MUL ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM[$expression::i])) ^(REGISTERLOC ^(INTNUM[$expression::j])) ^($y) ^($z))
	;

intvar returns [String expression_res, String ctype = "int"]
	scope { String regLocation; String integer}
	: 
	^(INTEGER i = IDENTIFIER) {$intvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); $expression_res=$intvar::regLocation;} 
	-> TEMPV
	| ^(PLUS ^(INTEGER i=IDENTIFIER)) {$intvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); $expression_res=$intvar::regLocation;} 
	-> TEMPV
	| ^(MINUS ^(INTEGER i=IDENTIFIER)) {$intvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2);} 
	-> ^(SUB ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM["0"])) ^(REGISTERLOC ^(INTNUM[$intvar::regLocation])) TEMPV TEMPV)
	;

realvar returns [String expression_res, String ctype = "real"]
	scope { String regLocation; String integer}
	: 
	^(REAL i=IDENTIFIER) {$realvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); $expression_res=$realvar::regLocation;} 
	-> TEMPV
	| ^(PLUS ^(REAL i=IDENTIFIER)) {$realvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); $expression_res=$realvar::regLocation;} 
	-> TEMPV
	| ^(MINUS ^(REAL i=IDENTIFIER)) {$realvar::regLocation=getIdentifierReg($i.getText().toLowerCase()); int a2 = Memory.addRegister(); $expression_res=String.valueOf(a2);} 
	-> ^(SUBR ^(REGISTERLOC ^(INTNUM[$expression_res])) ^(REGISTERLOC ^(INTNUM["0"])) ^(REGISTERLOC ^(INTNUM[$realvar::regLocation])) TEMPV TEMPV)
	;
	
// Insert an integer into a register. Deals with leading unary op.
intconst returns [String expression_res, String ctype = "int"]
	scope { String regLocation; String integer}
	: 
	i=INTEGERVAL {int a2 = Memory.addRegister(); $intconst::regLocation=String.valueOf(a2); $intconst::integer = $i.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(ADDI ^(REGISTERLOC ^(INTNUM[$intconst::regLocation])) ^(REGISTERLOC ^(INTNUM["0"])) ^(CONSTANT ^(INTNUM[$intconst::integer])))
	| ^(PLUS i=INTEGERVAL) {int a2 = Memory.addRegister(); $intconst::regLocation=String.valueOf(a2); $intconst::integer = $i.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(ADDI ^(REGISTERLOC ^(INTNUM[$intconst::regLocation])) ^(REGISTERLOC ^(INTNUM["0"])) ^(CONSTANT ^(INTNUM[$intconst::integer])))
	| ^(MINUS i=INTEGERVAL) {int a2 = Memory.addRegister(); $intconst::regLocation=String.valueOf(a2); $intconst::integer = $i.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(SUBI ^(REGISTERLOC ^(INTNUM[$intconst::regLocation])) ^(REGISTERLOC ^(INTNUM["0"])) ^(CONSTANT ^(INTNUM[$intconst::integer])))
	;
	
// Insert a real number into a register
realconst returns [String expression_res, String ctype = "real"]
	scope { String regLocation; String real}
	: 
	r=REALVAL {int a2 = Memory.addRegister(); $realconst::regLocation=String.valueOf(a2); $realconst::real = $r.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(MOVIR ^(REGISTERLOC ^(INTNUM[$realconst::regLocation])) ^(CONSTANT ^(REALNUM[$realconst::real])))
	| ^(PLUS r=REALVAL) {int a2 = Memory.addRegister(); $realconst::regLocation=String.valueOf(a2); $realconst::real = $r.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(MOVIR ^(REGISTERLOC ^(INTNUM[$realconst::regLocation])) ^(CONSTANT ^(REALNUM[$realconst::real])))
	| ^(MINUS r=REALVAL) {int a2 = Memory.addRegister(); $realconst::regLocation=String.valueOf(a2); $realconst::real = $r.getText(); $expression_res=String.valueOf(a2);} 
	-> ^(MOVIR ^(REGISTERLOC ^(INTNUM[$realconst::regLocation])) ^(CONSTANT ^(REALNUM['-' + $realconst::real])))
	; 