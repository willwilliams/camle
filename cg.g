// COMS22201: Code generation

tree grammar Cg;

options {
  tokenVocab = Irt;
	ASTLabelType = CommonTree;
}


@header {
  import java.io.*;
}


@members {
  void emit(PrintStream o, String s)
  {
    o.println(s);
  }
}

program [PrintStream o] : 
  { emit(o, "XOR R0,R0,R0"); }  // Initialize R0 to 0
    irtree[$o]
  { emit(o, "HALT");            // Program must end with HALT
    Memory.dumpData(o); }       // Dump DATA lines: initial memory contents
  ;

// Walk over IR tree (bottom up, in SEQ order), 
// converting each node to assembly code
irtree [PrintStream o] :
    ^(SEQ irtree[$o] irtree[$o])
  | NOOP
  | ^(WRS ^(MEM ^(CONST a=INTNUM)))  { emit(o, "WRS "+ $a); }
  | ^(WRC ^(REGISTERLOC b=INTNUM) integerop[$o]) {emit (o, "WR R" + $b);}
  | ^(WRR ^(REGISTERLOC c=INTNUM) realop[$o]) {emit (o, "WRR R" + $c);}
  | ^(ADDI ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(CONSTANT ival = INTNUM) integerop[$o]) {emit(o, "ADDI R" + $ri + ",R" + $rj + "," + $ival);}
  | ^(ADDR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) realop[$o]){emit(o, "ADDR R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(RTOI ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj=INTNUM) realop[$o]) {emit (o, "RTOI R" + $ri + ",R" + $rj);}
  | ^(ITOR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj=INTNUM) integerop[$o]) {emit (o, "ITOR R" + $ri + ",R" + $rj);}
  | ^(RDR ^(REGISTERLOC ri=INTNUM)) {emit (o, "RDR R" + $ri);}
  | ^(RD ^(REGISTERLOC ri=INTNUM)) {emit (o, "RD R" + $ri);}
  
  // CONDITIONAL STATEMENTS

  | ^(BNEZL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  integerop[$o] {emit (o, "BNEZ R" + $ri + ", L" + $l2);}irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BEQZL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  integerop[$o] {emit (o, "BEQZ R" + $ri + ", L" + $l2);}irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BLTZL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  integerop[$o]{emit (o, "BLTZ R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BGEZL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  integerop[$o] {emit (o, "BGEZ R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BNEZRL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  realop[$o] {emit (o, "BNEZR R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BEQZRL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  realop[$o] {emit (o, "BEQZR R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BLTZRL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  realop[$o] {emit (o, "BLTZR R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  | ^(BGEZRL ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) realop[$o]  {emit (o, "BGEZR R" + $ri + ", L" + $l2);} irtree[$o] jump[$o] label[$o] irtree[$o] label[$o])
  
  | ^(BNEZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) integerop[$o] {emit (o, "BNEZ R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BEQZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) integerop[$o] {emit (o, "BEQZ R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BLTZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) integerop[$o]  {emit (o, "BLTZ R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BGEZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) integerop[$o] {emit (o, "BGEZ R" + $ri + ", L" + $l2);} irtree[$o] label[$o]) 
  | ^(BNEZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) realop[$o] {emit (o, "BNEZR R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BEQZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) realop[$o] {emit (o, "BEQZR R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BLTZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) realop[$o] {emit (o, "BLTZR R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  | ^(BGEZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) realop[$o] {emit (o, "BGEZR R" + $ri + ", L" + $l2);} irtree[$o] label[$o])
  
  // REPEAT STATEMENTS
  
  | ^(RBNEZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) {emit (o, "L" + $l2 + ":");} irtree[$o] integerop[$o]) {emit (o, "BNEZ R" + $ri + ", L" + $l2);}
  | ^(RBEQZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) {emit (o, "L" + $l2 + ":");} irtree[$o] integerop[$o]) {emit (o, "BEQZ R" + $ri + ", L" + $l2);}
  | ^(RBLTZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  {emit (o, "L" + $l2 + ":");} irtree[$o] integerop[$o])  {emit (o, "BLTZ R" + $ri + ", L" + $l2);}
  | ^(RBGEZ ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) {emit (o, "L" + $l2 + ":");} irtree[$o] integerop[$o]) {emit (o, "BGEZ R" + $ri + ", L" + $l2);}
  | ^(RBNEZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  {emit (o, "L" + $l2 + ":");} irtree[$o] realop[$o]) {emit (o, "BNEZR R" + $ri + ", L" + $l2);}
  | ^(RBEQZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  {emit (o, "L" + $l2 + ":");} irtree[$o] realop[$o]) {emit (o, "BEQZR R" + $ri + ", L" + $l2);}
  | ^(RBLTZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM)  {emit (o, "L" + $l2 + ":");} irtree[$o] realop[$o]) {emit (o, "BLTZR R" + $ri + ", L" + $l2);}
  | ^(RBGEZR ^(REGISTERLOC ri=INTNUM) ^(LABEL l2=INTNUM) {emit (o, "L" + $l2 + ":");} irtree[$o] realop[$o]) {emit (o, "BGEZR R" + $ri + ", L" + $l2);}
  
  
  | TEMPV
	;


label [PrintStream o] :
  ^(LABEL l2=INTNUM) {emit (o, "L" + $l2 + ":");}
  ;
  
jump [PrintStream o] :
  ^(JUMP l1=INTNUM) {emit (o, "JMP L" + $l1);}
  ;
	
integerop [PrintStream o] :
  ^(ADDI ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(CONSTANT ival = INTNUM)) {emit(o, "ADDI R" + $ri + ",R" + $rj + "," + $ival);}
  | ^(SUBI ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(CONSTANT ival = INTNUM)) {emit(o, "SUBI R" + $ri + ",R" + $rj + "," + $ival);}  
  
  | ^(ADD ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) integerop[$o] integerop[$o]) {emit(o, "ADD R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(SUB ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) integerop[$o] integerop[$o]) {emit(o, "SUB R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(MUL ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) integerop[$o] integerop[$o]) {emit(o, "MUL R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(DIV ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) integerop[$o] integerop[$o]) {emit(o, "DIV R" + $ri + ",R" + $rj + ",R" + $rk);}
  | TEMPV
	;
	
realop [PrintStream o] :
  ^(MOVIR ^(REGISTERLOC ri=INTNUM) ^(CONSTANT f = REALNUM)) { emit(o, "MOVIR R" + $ri + "," + $f);}

  | ^(ADDR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) realop[$o] realop[$o]) {emit(o, "ADDR R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(SUBR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) realop[$o] realop[$o]) {emit(o, "SUBR R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(MULR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) realop[$o] realop[$o]) {emit(o, "MULR R" + $ri + ",R" + $rj + ",R" + $rk);}
  | ^(DIVR ^(REGISTERLOC ri=INTNUM) ^(REGISTERLOC rj = INTNUM) ^(REGISTERLOC rk = INTNUM) realop[$o] realop[$o]) {emit(o, "DIVR R" + $ri + ",R" + $rj + ",R" + $rk);}
  | TEMPV
	  ;
