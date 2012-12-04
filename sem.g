// COMS22201: Semantic analysis

// This version doesn't actually change the tree (AST); just copies it

tree grammar Sem;

options {
  tokenVocab = Syn;
  output = AST;
  ASTLabelType = CommonTree;
}
// Include hash tables to store a table of all the identifer type pairs
@header {
  import java.util.Hashtable;
}

@members {
  private Hashtable<String, String> ht = new Hashtable<String, String>();
  private ArrayList<String> varUse = new ArrayList<String>();
  private ArrayList<String> varTotal = new ArrayList<String>(); 
  private ArrayList<String> varUseful = new ArrayList<String>();
  
  private int errors = 0;
 
  private void addIdentifier(String id, String reg){
    ht.put(id, reg);
    varTotal.add(id);
  }
  
  private boolean checkIdentifier(String id){
    return ht.containsKey(id);
  }
  
  private String getIdentifierType(String id){
    return ht.get(id);
  }
  
  private boolean isInitialised(String id){
    return varUse.contains(id);
  }
}

@after {

}

program : 
    ^( PROGRAM programname block ) {
    
    // CHECK IF VARIABLES HAVE BEEN USED
    for (int i=0; i<varTotal.size(); i++){
        if (!varUseful.contains(varTotal.get(i))) { System.err.println("Warning: unused variable "+ varTotal.get(i)); }
    }

    if (errors>0) {System.err.println(errors + " errors"); System.exit(0);}
    
    }
  ;

programname :
    i=IDENTIFIER
  ;

block :
    declaration? compoundstatement
  ;

compoundstatement :
    ^( BEGIN (statement)* )
  ;

statement :
    ^( WRITE arg )
  | WRITELN
  | ^(WRITE expression)
  | assignment
  | ^(READ v=variable) { varUse.add(v.name);}
  | ^(IF conditional)
  | ^(REPEAT compoundstatement relationx)
  ;

arg :
    STRING
  ;
  
expression returns [String ctype]
    scope { String type; }
    :	
    i = intconst { $ctype = i.ctype; } |
    r = realconst { $ctype = r.ctype;} |
    v = variable { 
    
    	$ctype = v.ctype; 
    	// VARIABLE HAS NOW BEEN USED IN AN EXPRESSION
    	varUseful.add($v.name);
    	// INITIALISATION CHECK
	if (!isInitialised($v.name)) { System.err.println("Error on line " + $v.line +  ": variable \""+ $v.name+ "\" has not been initialised."); errors++; }
	
	
	} |
    ^(PLUS i=intconst) { $ctype = i.ctype; } |
    ^(MINUS i=intconst) { $ctype = i.ctype; } |
    ^(PLUS r=realconst) { $ctype = r.ctype; } |
    ^(MINUS r=realconst) { $ctype = r.ctype; } |
    ^(PLUS v=variable)  { $ctype = v.ctype; } |
    ^(MINUS v=variable)  { $ctype = v.ctype; } |
    ^(PLUS e1=expression e2=expression) { $ctype = e2.ctype; if (!$e1.ctype.equals($e2.ctype)) { System.err.println("Error on line " + $PLUS.getLine() +  ": " + "type mismatch, cannot add \"" + $e1.ctype + "\" to \"" + $e2.ctype + "\"."); errors++;} } |
    ^(MINUS e1=expression e2=expression) { $ctype = e2.ctype; if (!$e1.ctype.equals($e2.ctype)) { System.err.println("Error on line " + $MINUS.getLine() +  ": " + "type mismatch, cannot subtract \"" + $e1.ctype + "\" from \"" + $e2.ctype + "\"."); errors++;} } |
    ^(TIMES e1=expression e2=expression) { $ctype = e2.ctype; if (!$e1.ctype.equals($e2.ctype)) { System.err.println("Error on line " + $TIMES.getLine() +  ": " + "type mismatch, cannot multiply \"" + $e1.ctype + "\" with \"" + $e2.ctype + "\"."); errors++;} } |
    ^(DIVIDE e1=expression e2=expression){ $ctype = e2.ctype; if (!$e1.ctype.equals($e2.ctype)) { System.err.println("Error on line " + $DIVIDE.getLine() +  ": " + "type mismatch, cannot divide \"" + $e1.ctype + "\" by \"" + $e2.ctype + "\"."); errors++;} }
  ;

conditional :	
	(relationx  compoundstatement compoundstatement) => relationx compoundstatement compoundstatement
	| relationx compoundstatement
	;
	

relationx 
	scope { String st1; }
	:
    ^(RELATION e1=expression e2=expression) { if (!$e1.ctype.equals($e2.ctype)) { System.err.println("Error on line " + $RELATION.getLine() +  ": " + "comparison type mismatch, cannot compare \"" + $e1.ctype + "\" with \"" + $e2.ctype + "\"."); errors++;}}
  ;
  
declaration :	
    ^(VAR declaration2+)
    ;

declaration2 :
    ^(REAL ids_real)
    | ^(INTEGER ids_int)
  ;	
// Equivalent of INDENTIFIER+ but allows access of individual
// identifiers for use in the hash table    
ids_real :
    ident = IDENTIFIER ids_real { boolean r = checkIdentifier(ident.getText().toLowerCase()); 
    			if (r==true) { System.err.println("Error on line " + $IDENTIFIER.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
    			else { addIdentifier(ident.getText().toLowerCase(), "real"); }    			
    			}
    | ident = IDENTIFIER { boolean r = checkIdentifier(ident.getText().toLowerCase()); 
    			if (r==true) { System.err.println("Error on line " + $IDENTIFIER.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
    			else { addIdentifier(ident.getText().toLowerCase(), "real"); }    			
    			}
    ;
    
ids_int :
    ident = IDENTIFIER ids_int { boolean r = checkIdentifier(ident.getText().toLowerCase()); 
    			if (r==true) { System.err.println("Error on line " + $IDENTIFIER.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
    			else { addIdentifier(ident.getText().toLowerCase(), "int"); }    			
    			}
    | ident = IDENTIFIER { boolean r = checkIdentifier(ident.getText().toLowerCase()); 
    			if (r==true) { System.err.println("Error on line " + $IDENTIFIER.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
    			else { addIdentifier(ident.getText().toLowerCase(), "int"); }    			
    			}
    ;
    
assignment :	
    ^(DEFINE v=variable e=expression)
    { 
    
    varUse.add(v.name);
    // ASSIGNMENT CHECK 
    if ($e.ctype.equals("int") && $v.ctype.equals("real")) { System.err.println("Warning on line " + $DEFINE.getLine() +  ": integer has been converted to a real in assignment."); }
    if ($e.ctype.equals("real") && $v.ctype.equals("int")) { System.err.println("Warning on line " + $DEFINE.getLine() +  ": real has been truncated to an integer in assignment."); }
    
    }
  ;	
	
variable returns [String name, String ctype, int line]
        scope {String type}
	:	
	i = IDENTIFIER 
	{

	$variable::type = getIdentifierType(i.getText().toLowerCase()); $ctype = $variable::type; $line = $IDENTIFIER.getLine(); $name = i.getText().toLowerCase();
	// DECLARATION CHECK
	if ($variable::type == null) {  $ctype = "undefined type"; System.err.println("Error on line " + $IDENTIFIER.getLine() +  ": variable \""+ i.getText().toLowerCase() +"\" has not been declared."); errors++;}

	}
	
	
	-> {$ctype.equals("int")}? ^(INTEGER $i)
	-> ^(REAL $i)
  ;	
	
intconst returns[String ctype = "int"] :
    INTEGERVAL
  ;
  
realconst returns[String ctype = "real"] :	
    REALVAL
  ;
