// $ANTLR 3.2 Sep 23, 2009 12:02:23 Sem.g 2010-05-01 15:29:15

  import java.util.Hashtable;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Sem extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "BEGIN", "ELSE", "END", "IF", "INTEGER", "PROGRAM", "READ", "REAL", "REPEAT", "UNTIL", "VAR", "WRITE", "WRITELN", "COMMENT", "CHAR", "DIGIT", "SEMICOLON", "FULLSTOP", "OPENPAREN", "CLOSEPAREN", "RELATION", "DEFINE", "PLUS", "MINUS", "TIMES", "DIVIDE", "COMMA", "STRING", "WS", "IDENTIFIER", "INTEGERVAL", "REALVAL"
    };
    public static final int CHAR=44;
    public static final int EOF=-1;
    public static final int DEFINE=51;
    public static final int IF=33;
    public static final int COMMA=56;
    public static final int IDENTIFIER=59;
    public static final int BEGIN=30;
    public static final int FULLSTOP=47;
    public static final int PLUS=52;
    public static final int VAR=40;
    public static final int DIGIT=45;
    public static final int COMMENT=43;
    public static final int DIVIDE=55;
    public static final int D=7;
    public static final int INTEGER=34;
    public static final int INTEGERVAL=60;
    public static final int E=8;
    public static final int CLOSEPAREN=49;
    public static final int F=9;
    public static final int G=10;
    public static final int A=4;
    public static final int B=5;
    public static final int C=6;
    public static final int L=15;
    public static final int M=16;
    public static final int N=17;
    public static final int O=18;
    public static final int H=11;
    public static final int I=12;
    public static final int J=13;
    public static final int ELSE=31;
    public static final int K=14;
    public static final int U=24;
    public static final int RELATION=50;
    public static final int T=23;
    public static final int W=26;
    public static final int V=25;
    public static final int SEMICOLON=46;
    public static final int Q=20;
    public static final int P=19;
    public static final int S=22;
    public static final int MINUS=53;
    public static final int R=21;
    public static final int WRITE=41;
    public static final int Y=28;
    public static final int X=27;
    public static final int Z=29;
    public static final int REAL=37;
    public static final int REALVAL=61;
    public static final int WS=58;
    public static final int WRITELN=42;
    public static final int READ=36;
    public static final int UNTIL=39;
    public static final int PROGRAM=35;
    public static final int REPEAT=38;
    public static final int OPENPAREN=48;
    public static final int TIMES=54;
    public static final int END=32;
    public static final int STRING=57;

    // delegates
    // delegators


        public Sem(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Sem(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Sem.tokenNames; }
    public String getGrammarFileName() { return "Sem.g"; }


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


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Sem.g:47:1: program : ^( PROGRAM programname block ) ;
    public final Sem.program_return program() throws RecognitionException {
        Sem.program_return retval = new Sem.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROGRAM1=null;
        Sem.programname_return programname2 = null;

        Sem.block_return block3 = null;


        CommonTree PROGRAM1_tree=null;

        try {
            // Sem.g:47:9: ( ^( PROGRAM programname block ) )
            // Sem.g:48:5: ^( PROGRAM programname block )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program73); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PROGRAM1_tree = (CommonTree)adaptor.dupNode(PROGRAM1);

            root_1 = (CommonTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_programname_in_program75);
            programname2=programname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, programname2.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_block_in_program77);
            block3=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, block3.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {

                  
                  // CHECK IF VARIABLES HAVE BEEN USED
                  for (int i=0; i<varTotal.size(); i++){
                      if (!varUseful.contains(varTotal.get(i))) { System.err.println("Warning: unused variable "+ varTotal.get(i)); }
                  }

                  if (errors>0) {System.err.println(errors + " errors"); System.exit(0);}
                  
                  
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class programname_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programname"
    // Sem.g:60:1: programname : i= IDENTIFIER ;
    public final Sem.programname_return programname() throws RecognitionException {
        Sem.programname_return retval = new Sem.programname_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i=null;

        CommonTree i_tree=null;

        try {
            // Sem.g:60:13: (i= IDENTIFIER )
            // Sem.g:61:5: i= IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_programname98); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            i_tree = (CommonTree)adaptor.dupNode(i);

            adaptor.addChild(root_0, i_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "programname"

    public static class block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Sem.g:64:1: block : ( declaration )? compoundstatement ;
    public final Sem.block_return block() throws RecognitionException {
        Sem.block_return retval = new Sem.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Sem.declaration_return declaration4 = null;

        Sem.compoundstatement_return compoundstatement5 = null;



        try {
            // Sem.g:64:7: ( ( declaration )? compoundstatement )
            // Sem.g:65:5: ( declaration )? compoundstatement
            {
            root_0 = (CommonTree)adaptor.nil();

            // Sem.g:65:5: ( declaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==VAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Sem.g:65:5: declaration
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_declaration_in_block113);
                    declaration4=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, declaration4.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_compoundstatement_in_block116);
            compoundstatement5=compoundstatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, compoundstatement5.getTree());

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class compoundstatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundstatement"
    // Sem.g:68:1: compoundstatement : ^( BEGIN ( statement )* ) ;
    public final Sem.compoundstatement_return compoundstatement() throws RecognitionException {
        Sem.compoundstatement_return retval = new Sem.compoundstatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BEGIN6=null;
        Sem.statement_return statement7 = null;


        CommonTree BEGIN6_tree=null;

        try {
            // Sem.g:68:19: ( ^( BEGIN ( statement )* ) )
            // Sem.g:69:5: ^( BEGIN ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BEGIN6=(CommonTree)match(input,BEGIN,FOLLOW_BEGIN_in_compoundstatement133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BEGIN6_tree = (CommonTree)adaptor.dupNode(BEGIN6);

            root_1 = (CommonTree)adaptor.becomeRoot(BEGIN6_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Sem.g:69:14: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==IF||LA2_0==READ||LA2_0==REPEAT||(LA2_0>=WRITE && LA2_0<=WRITELN)||LA2_0==DEFINE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // Sem.g:69:15: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_compoundstatement136);
                	    statement7=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, statement7.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundstatement"

    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Sem.g:72:1: statement : ( ^( WRITE arg ) | WRITELN | ^( WRITE expression ) | assignment | ^( READ v= variable ) | ^( IF conditional ) | ^( REPEAT compoundstatement relationx ) );
    public final Sem.statement_return statement() throws RecognitionException {
        Sem.statement_return retval = new Sem.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WRITE8=null;
        CommonTree WRITELN10=null;
        CommonTree WRITE11=null;
        CommonTree READ14=null;
        CommonTree IF15=null;
        CommonTree REPEAT17=null;
        Sem.variable_return v = null;

        Sem.arg_return arg9 = null;

        Sem.expression_return expression12 = null;

        Sem.assignment_return assignment13 = null;

        Sem.conditional_return conditional16 = null;

        Sem.compoundstatement_return compoundstatement18 = null;

        Sem.relationx_return relationx19 = null;


        CommonTree WRITE8_tree=null;
        CommonTree WRITELN10_tree=null;
        CommonTree WRITE11_tree=null;
        CommonTree READ14_tree=null;
        CommonTree IF15_tree=null;
        CommonTree REPEAT17_tree=null;

        try {
            // Sem.g:72:11: ( ^( WRITE arg ) | WRITELN | ^( WRITE expression ) | assignment | ^( READ v= variable ) | ^( IF conditional ) | ^( REPEAT compoundstatement relationx ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Sem.g:73:5: ^( WRITE arg )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WRITE8=(CommonTree)match(input,WRITE,FOLLOW_WRITE_in_statement157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITE8_tree = (CommonTree)adaptor.dupNode(WRITE8);

                    root_1 = (CommonTree)adaptor.becomeRoot(WRITE8_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arg_in_statement159);
                    arg9=arg();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arg9.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:74:5: WRITELN
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    WRITELN10=(CommonTree)match(input,WRITELN,FOLLOW_WRITELN_in_statement167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITELN10_tree = (CommonTree)adaptor.dupNode(WRITELN10);

                    adaptor.addChild(root_0, WRITELN10_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Sem.g:75:5: ^( WRITE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WRITE11=(CommonTree)match(input,WRITE,FOLLOW_WRITE_in_statement174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WRITE11_tree = (CommonTree)adaptor.dupNode(WRITE11);

                    root_1 = (CommonTree)adaptor.becomeRoot(WRITE11_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_statement176);
                    expression12=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression12.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Sem.g:76:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_assignment_in_statement183);
                    assignment13=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, assignment13.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Sem.g:77:5: ^( READ v= variable )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    READ14=(CommonTree)match(input,READ,FOLLOW_READ_in_statement190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    READ14_tree = (CommonTree)adaptor.dupNode(READ14);

                    root_1 = (CommonTree)adaptor.becomeRoot(READ14_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_statement194);
                    v=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       varUse.add(v.name);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Sem.g:78:5: ^( IF conditional )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IF15=(CommonTree)match(input,IF,FOLLOW_IF_in_statement204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF15_tree = (CommonTree)adaptor.dupNode(IF15);

                    root_1 = (CommonTree)adaptor.becomeRoot(IF15_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_conditional_in_statement206);
                    conditional16=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, conditional16.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Sem.g:79:5: ^( REPEAT compoundstatement relationx )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    REPEAT17=(CommonTree)match(input,REPEAT,FOLLOW_REPEAT_in_statement214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REPEAT17_tree = (CommonTree)adaptor.dupNode(REPEAT17);

                    root_1 = (CommonTree)adaptor.becomeRoot(REPEAT17_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compoundstatement_in_statement216);
                    compoundstatement18=compoundstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, compoundstatement18.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relationx_in_statement218);
                    relationx19=relationx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, relationx19.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class arg_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // Sem.g:82:1: arg : STRING ;
    public final Sem.arg_return arg() throws RecognitionException {
        Sem.arg_return retval = new Sem.arg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING20=null;

        CommonTree STRING20_tree=null;

        try {
            // Sem.g:82:5: ( STRING )
            // Sem.g:83:5: STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            STRING20=(CommonTree)match(input,STRING,FOLLOW_STRING_in_arg234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING20_tree = (CommonTree)adaptor.dupNode(STRING20);

            adaptor.addChild(root_0, STRING20_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arg"

    protected static class expression_scope {
        String type;
    }
    protected Stack expression_stack = new Stack();

    public static class expression_return extends TreeRuleReturnScope {
        public String ctype;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Sem.g:86:1: expression returns [String ctype] : (i= intconst | r= realconst | v= variable | ^( PLUS i= intconst ) | ^( MINUS i= intconst ) | ^( PLUS r= realconst ) | ^( MINUS r= realconst ) | ^( PLUS v= variable ) | ^( MINUS v= variable ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) );
    public final Sem.expression_return expression() throws RecognitionException {
        expression_stack.push(new expression_scope());
        Sem.expression_return retval = new Sem.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLUS21=null;
        CommonTree MINUS22=null;
        CommonTree PLUS23=null;
        CommonTree MINUS24=null;
        CommonTree PLUS25=null;
        CommonTree MINUS26=null;
        CommonTree PLUS27=null;
        CommonTree MINUS28=null;
        CommonTree TIMES29=null;
        CommonTree DIVIDE30=null;
        Sem.intconst_return i = null;

        Sem.realconst_return r = null;

        Sem.variable_return v = null;

        Sem.expression_return e1 = null;

        Sem.expression_return e2 = null;


        CommonTree PLUS21_tree=null;
        CommonTree MINUS22_tree=null;
        CommonTree PLUS23_tree=null;
        CommonTree MINUS24_tree=null;
        CommonTree PLUS25_tree=null;
        CommonTree MINUS26_tree=null;
        CommonTree PLUS27_tree=null;
        CommonTree MINUS28_tree=null;
        CommonTree TIMES29_tree=null;
        CommonTree DIVIDE30_tree=null;

        try {
            // Sem.g:88:5: (i= intconst | r= realconst | v= variable | ^( PLUS i= intconst ) | ^( MINUS i= intconst ) | ^( PLUS r= realconst ) | ^( MINUS r= realconst ) | ^( PLUS v= variable ) | ^( MINUS v= variable ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) )
            int alt4=13;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // Sem.g:89:5: i= intconst
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_intconst_in_expression272);
                    i=intconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, i.getTree());
                    if ( state.backtracking==0 ) {
                       retval.ctype = i.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:90:5: r= realconst
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_realconst_in_expression286);
                    r=realconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, r.getTree());
                    if ( state.backtracking==0 ) {
                       retval.ctype = r.ctype;
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Sem.g:91:5: v= variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression300);
                    v=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, v.getTree());
                    if ( state.backtracking==0 ) {
                       
                          
                          	retval.ctype = v.ctype; 
                          	// VARIABLE HAS NOW BEEN USED IN AN EXPRESSION
                          	varUseful.add((v!=null?v.name:null));
                          	// INITIALISATION CHECK
                      	if (!isInitialised((v!=null?v.name:null))) { System.err.println("Error on line " + (v!=null?v.line:0) +  ": variable \""+ (v!=null?v.name:null)+ "\" has not been initialised."); errors++; }
                      	
                      	
                      	
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Sem.g:101:5: ^( PLUS i= intconst )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS21=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS21_tree = (CommonTree)adaptor.dupNode(PLUS21);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS21_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_intconst_in_expression315);
                    i=intconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, i.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = i.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Sem.g:102:5: ^( MINUS i= intconst )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS22=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS22_tree = (CommonTree)adaptor.dupNode(MINUS22);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS22_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_intconst_in_expression331);
                    i=intconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, i.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = i.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Sem.g:103:5: ^( PLUS r= realconst )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS23=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS23_tree = (CommonTree)adaptor.dupNode(PLUS23);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS23_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_realconst_in_expression347);
                    r=realconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, r.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = r.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Sem.g:104:5: ^( MINUS r= realconst )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS24=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS24_tree = (CommonTree)adaptor.dupNode(MINUS24);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS24_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_realconst_in_expression363);
                    r=realconst();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, r.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = r.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // Sem.g:105:5: ^( PLUS v= variable )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS25=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS25_tree = (CommonTree)adaptor.dupNode(PLUS25);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS25_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression379);
                    v=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = v.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // Sem.g:106:5: ^( MINUS v= variable )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS26=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS26_tree = (CommonTree)adaptor.dupNode(MINUS26);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS26_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression396);
                    v=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, v.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = v.ctype; 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // Sem.g:107:5: ^( PLUS e1= expression e2= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS27=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS27_tree = (CommonTree)adaptor.dupNode(PLUS27);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS27_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression413);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression417);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = e2.ctype; if (!(e1!=null?e1.ctype:null).equals((e2!=null?e2.ctype:null))) { System.err.println("Error on line " + PLUS27.getLine() +  ": " + "type mismatch, cannot add \"" + (e1!=null?e1.ctype:null) + "\" to \"" + (e2!=null?e2.ctype:null) + "\"."); errors++;} 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // Sem.g:108:5: ^( MINUS e1= expression e2= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS28=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS28_tree = (CommonTree)adaptor.dupNode(MINUS28);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS28_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression433);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression437);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = e2.ctype; if (!(e1!=null?e1.ctype:null).equals((e2!=null?e2.ctype:null))) { System.err.println("Error on line " + MINUS28.getLine() +  ": " + "type mismatch, cannot subtract \"" + (e1!=null?e1.ctype:null) + "\" from \"" + (e2!=null?e2.ctype:null) + "\"."); errors++;} 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // Sem.g:109:5: ^( TIMES e1= expression e2= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TIMES29=(CommonTree)match(input,TIMES,FOLLOW_TIMES_in_expression449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMES29_tree = (CommonTree)adaptor.dupNode(TIMES29);

                    root_1 = (CommonTree)adaptor.becomeRoot(TIMES29_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression453);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression457);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = e2.ctype; if (!(e1!=null?e1.ctype:null).equals((e2!=null?e2.ctype:null))) { System.err.println("Error on line " + TIMES29.getLine() +  ": " + "type mismatch, cannot multiply \"" + (e1!=null?e1.ctype:null) + "\" with \"" + (e2!=null?e2.ctype:null) + "\"."); errors++;} 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // Sem.g:110:5: ^( DIVIDE e1= expression e2= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIVIDE30=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIVIDE30_tree = (CommonTree)adaptor.dupNode(DIVIDE30);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE30_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression473);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e1.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression477);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       retval.ctype = e2.ctype; if (!(e1!=null?e1.ctype:null).equals((e2!=null?e2.ctype:null))) { System.err.println("Error on line " + DIVIDE30.getLine() +  ": " + "type mismatch, cannot divide \"" + (e1!=null?e1.ctype:null) + "\" by \"" + (e2!=null?e2.ctype:null) + "\"."); errors++;} 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            expression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class conditional_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional"
    // Sem.g:113:1: conditional : ( ( relationx compoundstatement compoundstatement )=> relationx compoundstatement compoundstatement | relationx compoundstatement );
    public final Sem.conditional_return conditional() throws RecognitionException {
        Sem.conditional_return retval = new Sem.conditional_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Sem.relationx_return relationx31 = null;

        Sem.compoundstatement_return compoundstatement32 = null;

        Sem.compoundstatement_return compoundstatement33 = null;

        Sem.relationx_return relationx34 = null;

        Sem.compoundstatement_return compoundstatement35 = null;



        try {
            // Sem.g:113:13: ( ( relationx compoundstatement compoundstatement )=> relationx compoundstatement compoundstatement | relationx compoundstatement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RELATION) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred1_Sem()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Sem.g:114:2: ( relationx compoundstatement compoundstatement )=> relationx compoundstatement compoundstatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relationx_in_conditional503);
                    relationx31=relationx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, relationx31.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compoundstatement_in_conditional505);
                    compoundstatement32=compoundstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, compoundstatement32.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compoundstatement_in_conditional507);
                    compoundstatement33=compoundstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, compoundstatement33.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:115:4: relationx compoundstatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_relationx_in_conditional512);
                    relationx34=relationx();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, relationx34.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_compoundstatement_in_conditional514);
                    compoundstatement35=compoundstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, compoundstatement35.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional"

    protected static class relationx_scope {
        String st1;
    }
    protected Stack relationx_stack = new Stack();

    public static class relationx_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationx"
    // Sem.g:119:1: relationx : ^( RELATION e1= expression e2= expression ) ;
    public final Sem.relationx_return relationx() throws RecognitionException {
        relationx_stack.push(new relationx_scope());
        Sem.relationx_return retval = new Sem.relationx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RELATION36=null;
        Sem.expression_return e1 = null;

        Sem.expression_return e2 = null;


        CommonTree RELATION36_tree=null;

        try {
            // Sem.g:121:2: ( ^( RELATION e1= expression e2= expression ) )
            // Sem.g:122:5: ^( RELATION e1= expression e2= expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            RELATION36=(CommonTree)match(input,RELATION,FOLLOW_RELATION_in_relationx538); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RELATION36_tree = (CommonTree)adaptor.dupNode(RELATION36);

            root_1 = (CommonTree)adaptor.becomeRoot(RELATION36_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_relationx542);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, e1.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_relationx546);
            e2=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, e2.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               if (!(e1!=null?e1.ctype:null).equals((e2!=null?e2.ctype:null))) { System.err.println("Error on line " + RELATION36.getLine() +  ": " + "comparison type mismatch, cannot compare \"" + (e1!=null?e1.ctype:null) + "\" with \"" + (e2!=null?e2.ctype:null) + "\"."); errors++;}
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            relationx_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "relationx"

    public static class declaration_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // Sem.g:125:1: declaration : ^( VAR ( declaration2 )+ ) ;
    public final Sem.declaration_return declaration() throws RecognitionException {
        Sem.declaration_return retval = new Sem.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR37=null;
        Sem.declaration2_return declaration238 = null;


        CommonTree VAR37_tree=null;

        try {
            // Sem.g:125:13: ( ^( VAR ( declaration2 )+ ) )
            // Sem.g:126:5: ^( VAR ( declaration2 )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            VAR37=(CommonTree)match(input,VAR,FOLLOW_VAR_in_declaration568); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR37_tree = (CommonTree)adaptor.dupNode(VAR37);

            root_1 = (CommonTree)adaptor.becomeRoot(VAR37_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Sem.g:126:11: ( declaration2 )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==INTEGER||LA6_0==REAL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Sem.g:126:11: declaration2
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_declaration2_in_declaration570);
            	    declaration238=declaration2();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, declaration238.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class declaration2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration2"
    // Sem.g:129:1: declaration2 : ( ^( REAL ids_real ) | ^( INTEGER ids_int ) );
    public final Sem.declaration2_return declaration2() throws RecognitionException {
        Sem.declaration2_return retval = new Sem.declaration2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REAL39=null;
        CommonTree INTEGER41=null;
        Sem.ids_real_return ids_real40 = null;

        Sem.ids_int_return ids_int42 = null;


        CommonTree REAL39_tree=null;
        CommonTree INTEGER41_tree=null;

        try {
            // Sem.g:129:14: ( ^( REAL ids_real ) | ^( INTEGER ids_int ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==REAL) ) {
                alt7=1;
            }
            else if ( (LA7_0==INTEGER) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Sem.g:130:5: ^( REAL ids_real )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    REAL39=(CommonTree)match(input,REAL,FOLLOW_REAL_in_declaration2590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL39_tree = (CommonTree)adaptor.dupNode(REAL39);

                    root_1 = (CommonTree)adaptor.becomeRoot(REAL39_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ids_real_in_declaration2592);
                    ids_real40=ids_real();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ids_real40.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:131:7: ^( INTEGER ids_int )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INTEGER41=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_declaration2602); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER41_tree = (CommonTree)adaptor.dupNode(INTEGER41);

                    root_1 = (CommonTree)adaptor.becomeRoot(INTEGER41_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ids_int_in_declaration2604);
                    ids_int42=ids_int();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, ids_int42.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration2"

    public static class ids_real_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ids_real"
    // Sem.g:135:1: ids_real : (ident= IDENTIFIER ids_real | ident= IDENTIFIER );
    public final Sem.ids_real_return ids_real() throws RecognitionException {
        Sem.ids_real_return retval = new Sem.ids_real_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ident=null;
        Sem.ids_real_return ids_real43 = null;


        CommonTree ident_tree=null;

        try {
            // Sem.g:135:10: (ident= IDENTIFIER ids_real | ident= IDENTIFIER )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==UP) ) {
                    alt8=2;
                }
                else if ( (LA8_1==IDENTIFIER) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Sem.g:136:5: ident= IDENTIFIER ids_real
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ids_real626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ident_tree = (CommonTree)adaptor.dupNode(ident);

                    adaptor.addChild(root_0, ident_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ids_real_in_ids_real628);
                    ids_real43=ids_real();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ids_real43.getTree());
                    if ( state.backtracking==0 ) {
                       boolean r = checkIdentifier(ident.getText().toLowerCase()); 
                          			if (r==true) { System.err.println("Error on line " + ident.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
                          			else { addIdentifier(ident.getText().toLowerCase(), "real"); }    			
                          			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:140:7: ident= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ids_real642); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ident_tree = (CommonTree)adaptor.dupNode(ident);

                    adaptor.addChild(root_0, ident_tree);
                    }
                    if ( state.backtracking==0 ) {
                       boolean r = checkIdentifier(ident.getText().toLowerCase()); 
                          			if (r==true) { System.err.println("Error on line " + ident.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
                          			else { addIdentifier(ident.getText().toLowerCase(), "real"); }    			
                          			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ids_real"

    public static class ids_int_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ids_int"
    // Sem.g:146:1: ids_int : (ident= IDENTIFIER ids_int | ident= IDENTIFIER );
    public final Sem.ids_int_return ids_int() throws RecognitionException {
        Sem.ids_int_return retval = new Sem.ids_int_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ident=null;
        Sem.ids_int_return ids_int44 = null;


        CommonTree ident_tree=null;

        try {
            // Sem.g:146:9: (ident= IDENTIFIER ids_int | ident= IDENTIFIER )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==UP) ) {
                    alt9=2;
                }
                else if ( (LA9_1==IDENTIFIER) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Sem.g:147:5: ident= IDENTIFIER ids_int
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ids_int669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ident_tree = (CommonTree)adaptor.dupNode(ident);

                    adaptor.addChild(root_0, ident_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ids_int_in_ids_int671);
                    ids_int44=ids_int();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ids_int44.getTree());
                    if ( state.backtracking==0 ) {
                       boolean r = checkIdentifier(ident.getText().toLowerCase()); 
                          			if (r==true) { System.err.println("Error on line " + ident.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
                          			else { addIdentifier(ident.getText().toLowerCase(), "int"); }    			
                          			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Sem.g:151:7: ident= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ids_int685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ident_tree = (CommonTree)adaptor.dupNode(ident);

                    adaptor.addChild(root_0, ident_tree);
                    }
                    if ( state.backtracking==0 ) {
                       boolean r = checkIdentifier(ident.getText().toLowerCase()); 
                          			if (r==true) { System.err.println("Error on line " + ident.getLine() +  ": variable \"" + ident.getText().toLowerCase() + "\" already assigned, remove duplicate assignment."); errors++;}
                          			else { addIdentifier(ident.getText().toLowerCase(), "int"); }    			
                          			
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ids_int"

    public static class assignment_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // Sem.g:157:1: assignment : ^( DEFINE v= variable e= expression ) ;
    public final Sem.assignment_return assignment() throws RecognitionException {
        Sem.assignment_return retval = new Sem.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFINE45=null;
        Sem.variable_return v = null;

        Sem.expression_return e = null;


        CommonTree DEFINE45_tree=null;

        try {
            // Sem.g:157:12: ( ^( DEFINE v= variable e= expression ) )
            // Sem.g:158:5: ^( DEFINE v= variable e= expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DEFINE45=(CommonTree)match(input,DEFINE,FOLLOW_DEFINE_in_assignment710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFINE45_tree = (CommonTree)adaptor.dupNode(DEFINE45);

            root_1 = (CommonTree)adaptor.becomeRoot(DEFINE45_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_assignment714);
            v=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, v.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_assignment718);
            e=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, e.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               
                  
                  varUse.add(v.name);
                  // ASSIGNMENT CHECK 
                  if ((e!=null?e.ctype:null).equals("int") && (v!=null?v.ctype:null).equals("real")) { System.err.println("Warning on line " + DEFINE45.getLine() +  ": integer has been converted to a real in assignment."); }
                  if ((e!=null?e.ctype:null).equals("real") && (v!=null?v.ctype:null).equals("int")) { System.err.println("Warning on line " + DEFINE45.getLine() +  ": real has been truncated to an integer in assignment."); }
                  
                  
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    protected static class variable_scope {
        String type;
    }
    protected Stack variable_stack = new Stack();

    public static class variable_return extends TreeRuleReturnScope {
        public String name;
        public String ctype;
        public int line;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // Sem.g:169:1: variable returns [String name, String ctype, int line] : i= IDENTIFIER -> {$ctype.equals(\"int\")}? ^( INTEGER $i) -> ^( REAL $i) ;
    public final Sem.variable_return variable() throws RecognitionException {
        variable_stack.push(new variable_scope());
        Sem.variable_return retval = new Sem.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i=null;

        CommonTree i_tree=null;
        RewriteRuleNodeStream stream_IDENTIFIER=new RewriteRuleNodeStream(adaptor,"token IDENTIFIER");

        try {
            // Sem.g:171:2: (i= IDENTIFIER -> {$ctype.equals(\"int\")}? ^( INTEGER $i) -> ^( REAL $i) )
            // Sem.g:172:2: i= IDENTIFIER
            {
            _last = (CommonTree)input.LT(1);
            i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(i);

            if ( state.backtracking==0 ) {


              	((variable_scope)variable_stack.peek()).type = getIdentifierType(i.getText().toLowerCase()); retval.ctype = ((variable_scope)variable_stack.peek()).type; retval.line = i.getLine(); retval.name = i.getText().toLowerCase();
              	// DECLARATION CHECK
              	if (((variable_scope)variable_stack.peek()).type == null) {  retval.ctype = "undefined type"; System.err.println("Error on line " + i.getLine() +  ": variable \""+ i.getText().toLowerCase() +"\" has not been declared."); errors++;}

              	
            }


            // AST REWRITE
            // elements: i, i
            // token labels: i
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleNodeStream stream_i=new RewriteRuleNodeStream(adaptor,"token i",i);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 182:2: -> {$ctype.equals(\"int\")}? ^( INTEGER $i)
            if (retval.ctype.equals("int")) {
                // Sem.g:182:29: ^( INTEGER $i)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTEGER, "INTEGER"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 183:2: -> ^( REAL $i)
            {
                // Sem.g:183:5: ^( REAL $i)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REAL, "REAL"), root_1);

                adaptor.addChild(root_1, stream_i.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variable_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class intconst_return extends TreeRuleReturnScope {
        public String ctype = "int";
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "intconst"
    // Sem.g:186:1: intconst returns [String ctype = \"int\"] : INTEGERVAL ;
    public final Sem.intconst_return intconst() throws RecognitionException {
        Sem.intconst_return retval = new Sem.intconst_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTEGERVAL46=null;

        CommonTree INTEGERVAL46_tree=null;

        try {
            // Sem.g:186:40: ( INTEGERVAL )
            // Sem.g:187:5: INTEGERVAL
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            INTEGERVAL46=(CommonTree)match(input,INTEGERVAL,FOLLOW_INTEGERVAL_in_intconst811); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGERVAL46_tree = (CommonTree)adaptor.dupNode(INTEGERVAL46);

            adaptor.addChild(root_0, INTEGERVAL46_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "intconst"

    public static class realconst_return extends TreeRuleReturnScope {
        public String ctype = "real";
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "realconst"
    // Sem.g:190:1: realconst returns [String ctype = \"real\"] : REALVAL ;
    public final Sem.realconst_return realconst() throws RecognitionException {
        Sem.realconst_return retval = new Sem.realconst_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REALVAL47=null;

        CommonTree REALVAL47_tree=null;

        try {
            // Sem.g:190:42: ( REALVAL )
            // Sem.g:191:5: REALVAL
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            REALVAL47=(CommonTree)match(input,REALVAL,FOLLOW_REALVAL_in_realconst832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REALVAL47_tree = (CommonTree)adaptor.dupNode(REALVAL47);

            adaptor.addChild(root_0, REALVAL47_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "realconst"

    // $ANTLR start synpred1_Sem
    public final void synpred1_Sem_fragment() throws RecognitionException {   
        // Sem.g:114:2: ( relationx compoundstatement compoundstatement )
        // Sem.g:114:3: relationx compoundstatement compoundstatement
        {
        pushFollow(FOLLOW_relationx_in_synpred1_Sem493);
        relationx();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_compoundstatement_in_synpred1_Sem496);
        compoundstatement();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_compoundstatement_in_synpred1_Sem498);
        compoundstatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Sem

    // Delegated rules

    public final boolean synpred1_Sem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Sem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\41\1\2\5\uffff\1\64\2\uffff";
    static final String DFA3_maxS =
        "\1\63\1\2\5\uffff\1\75\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\uffff\1\1\1\3";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\2\uffff\1\4\1\uffff\1\6\2\uffff\1\1\1\2\10\uffff\1\3",
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "\4\11\1\uffff\1\10\1\uffff\3\11",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "72:1: statement : ( ^( WRITE arg ) | WRITELN | ^( WRITE expression ) | assignment | ^( READ v= variable ) | ^( IF conditional ) | ^( REPEAT compoundstatement relationx ) );";
        }
    }
    static final String DFA4_eotS =
        "\30\uffff";
    static final String DFA4_eofS =
        "\30\uffff";
    static final String DFA4_minS =
        "\1\64\3\uffff\2\2\2\uffff\2\64\3\3\1\uffff\3\3\7\uffff";
    static final String DFA4_maxS =
        "\1\75\3\uffff\2\2\2\uffff\5\75\1\uffff\3\75\7\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\14\1\15\5\uffff\1\12\3\uffff\1\13"+
        "\1\4\1\10\1\6\1\7\1\11\1\5";
    static final String DFA4_specialS =
        "\30\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\5\1\6\1\7\3\uffff\1\3\1\1\1\2",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            "",
            "\4\15\3\uffff\1\13\1\12\1\14",
            "\4\21\3\uffff\1\17\1\20\1\16",
            "\1\22\60\uffff\4\15\3\uffff\3\15",
            "\1\23\60\uffff\4\15\3\uffff\3\15",
            "\1\24\60\uffff\4\15\3\uffff\3\15",
            "",
            "\1\25\60\uffff\4\21\3\uffff\3\21",
            "\1\26\60\uffff\4\21\3\uffff\3\21",
            "\1\27\60\uffff\4\21\3\uffff\3\21",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "86:1: expression returns [String ctype] : (i= intconst | r= realconst | v= variable | ^( PLUS i= intconst ) | ^( MINUS i= intconst ) | ^( PLUS r= realconst ) | ^( MINUS r= realconst ) | ^( PLUS v= variable ) | ^( MINUS v= variable ) | ^( PLUS e1= expression e2= expression ) | ^( MINUS e1= expression e2= expression ) | ^( TIMES e1= expression e2= expression ) | ^( DIVIDE e1= expression e2= expression ) );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_programname_in_program75 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_block_in_program77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_programname98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block113 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_block116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundstatement133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_compoundstatement136 = new BitSet(new long[]{0x0008065200000008L});
    public static final BitSet FOLLOW_WRITE_in_statement157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_in_statement159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WRITELN_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_statement194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditional_in_statement206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_in_statement214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_compoundstatement_in_statement216 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_relationx_in_statement218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_arg234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intconst_in_expression272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_realconst_in_expression286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_expression300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_expression311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_intconst_in_expression315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_intconst_in_expression331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_realconst_in_expression347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_realconst_in_expression363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_expression379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_expression396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression413 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_expression417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression433 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_expression437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression453 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_expression457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expression469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression473 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_expression477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationx_in_conditional503 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_conditional505 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_conditional507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationx_in_conditional512 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_conditional514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATION_in_relationx538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_relationx542 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_relationx546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_declaration568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration2_in_declaration570 = new BitSet(new long[]{0x0000002400000008L});
    public static final BitSet FOLLOW_REAL_in_declaration2590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ids_real_in_declaration2592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_in_declaration2602 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ids_int_in_declaration2604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ids_real626 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ids_real_in_ids_real628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ids_real642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ids_int669 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ids_int_in_ids_int671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ids_int685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_assignment710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_assignment714 = new BitSet(new long[]{0x38F0000000000000L});
    public static final BitSet FOLLOW_expression_in_assignment718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGERVAL_in_intconst811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALVAL_in_realconst832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationx_in_synpred1_Sem493 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_synpred1_Sem496 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_synpred1_Sem498 = new BitSet(new long[]{0x0000000000000002L});

}