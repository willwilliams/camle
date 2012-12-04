// $ANTLR 3.2 Sep 23, 2009 12:02:23 Syn.g 2010-04-30 19:44:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Syn extends Parser {
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
    public static final int INTEGER=34;
    public static final int D=7;
    public static final int E=8;
    public static final int INTEGERVAL=60;
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
    public static final int R=21;
    public static final int MINUS=53;
    public static final int WRITE=41;
    public static final int Y=28;
    public static final int X=27;
    public static final int Z=29;
    public static final int REAL=37;
    public static final int WS=58;
    public static final int REALVAL=61;
    public static final int WRITELN=42;
    public static final int READ=36;
    public static final int UNTIL=39;
    public static final int PROGRAM=35;
    public static final int REPEAT=38;
    public static final int OPENPAREN=48;
    public static final int END=32;
    public static final int TIMES=54;
    public static final int STRING=57;

    // delegates
    // delegators


        public Syn(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Syn(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Syn.tokenNames; }
    public String getGrammarFileName() { return "Syn.g"; }


     
    	private String cleanString(String s){

    		String tmp;
    		tmp = s.replaceAll("^'", "");
    		s = tmp.replaceAll("'$", "");
    		tmp = s.replaceAll("''", "'");
    		
    		return tmp;
    	}



    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Syn.g:25:1: program : PROGRAM programname SEMICOLON block FULLSTOP ;
    public final Syn.program_return program() throws RecognitionException {
        Syn.program_return retval = new Syn.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROGRAM1=null;
        Token SEMICOLON3=null;
        Token FULLSTOP5=null;
        Syn.programname_return programname2 = null;

        Syn.block_return block4 = null;


        Object PROGRAM1_tree=null;
        Object SEMICOLON3_tree=null;
        Object FULLSTOP5_tree=null;

        try {
            // Syn.g:25:9: ( PROGRAM programname SEMICOLON block FULLSTOP )
            // Syn.g:26:5: PROGRAM programname SEMICOLON block FULLSTOP
            {
            root_0 = (Object)adaptor.nil();

            PROGRAM1=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program48); 
            PROGRAM1_tree = (Object)adaptor.create(PROGRAM1);
            root_0 = (Object)adaptor.becomeRoot(PROGRAM1_tree, root_0);

            pushFollow(FOLLOW_programname_in_program51);
            programname2=programname();

            state._fsp--;

            adaptor.addChild(root_0, programname2.getTree());
            SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_program53); 
            pushFollow(FOLLOW_block_in_program56);
            block4=block();

            state._fsp--;

            adaptor.addChild(root_0, block4.getTree());
            FULLSTOP5=(Token)match(input,FULLSTOP,FOLLOW_FULLSTOP_in_program58); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class programname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programname"
    // Syn.g:29:1: programname : IDENTIFIER ;
    public final Syn.programname_return programname() throws RecognitionException {
        Syn.programname_return retval = new Syn.programname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER6=null;

        Object IDENTIFIER6_tree=null;

        try {
            // Syn.g:29:13: ( IDENTIFIER )
            // Syn.g:30:5: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_programname74); 
            IDENTIFIER6_tree = (Object)adaptor.create(IDENTIFIER6);
            adaptor.addChild(root_0, IDENTIFIER6_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "programname"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Syn.g:33:1: type : ( REAL | INTEGER );
    public final Syn.type_return type() throws RecognitionException {
        Syn.type_return retval = new Syn.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set7=null;

        Object set7_tree=null;

        try {
            // Syn.g:33:6: ( REAL | INTEGER )
            // Syn.g:
            {
            root_0 = (Object)adaptor.nil();

            set7=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==REAL ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set7));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Syn.g:37:1: block : ( declarations )? compoundstatement ;
    public final Syn.block_return block() throws RecognitionException {
        Syn.block_return retval = new Syn.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Syn.declarations_return declarations8 = null;

        Syn.compoundstatement_return compoundstatement9 = null;



        try {
            // Syn.g:37:7: ( ( declarations )? compoundstatement )
            // Syn.g:38:5: ( declarations )? compoundstatement
            {
            root_0 = (Object)adaptor.nil();

            // Syn.g:38:5: ( declarations )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==VAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Syn.g:38:6: declarations
                    {
                    pushFollow(FOLLOW_declarations_in_block111);
                    declarations8=declarations();

                    state._fsp--;

                    adaptor.addChild(root_0, declarations8.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_compoundstatement_in_block120);
            compoundstatement9=compoundstatement();

            state._fsp--;

            adaptor.addChild(root_0, compoundstatement9.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // Syn.g:42:1: declarations : VAR ( declarationsx )+ ;
    public final Syn.declarations_return declarations() throws RecognitionException {
        Syn.declarations_return retval = new Syn.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR10=null;
        Syn.declarationsx_return declarationsx11 = null;


        Object VAR10_tree=null;

        try {
            // Syn.g:42:14: ( VAR ( declarationsx )+ )
            // Syn.g:43:5: VAR ( declarationsx )+
            {
            root_0 = (Object)adaptor.nil();

            VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_declarations137); 
            VAR10_tree = (Object)adaptor.create(VAR10);
            root_0 = (Object)adaptor.becomeRoot(VAR10_tree, root_0);

            // Syn.g:43:10: ( declarationsx )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Syn.g:43:11: declarationsx
            	    {
            	    pushFollow(FOLLOW_declarationsx_in_declarations141);
            	    declarationsx11=declarationsx();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declarationsx11.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class declarationsx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationsx"
    // Syn.g:47:1: declarationsx : idlist type SEMICOLON ;
    public final Syn.declarationsx_return declarationsx() throws RecognitionException {
        Syn.declarationsx_return retval = new Syn.declarationsx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON14=null;
        Syn.idlist_return idlist12 = null;

        Syn.type_return type13 = null;


        Object SEMICOLON14_tree=null;

        try {
            // Syn.g:47:15: ( idlist type SEMICOLON )
            // Syn.g:48:5: idlist type SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_idlist_in_declarationsx160);
            idlist12=idlist();

            state._fsp--;

            adaptor.addChild(root_0, idlist12.getTree());
            pushFollow(FOLLOW_type_in_declarationsx162);
            type13=type();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(type13.getTree(), root_0);
            SEMICOLON14=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarationsx165); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarationsx"

    public static class idlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idlist"
    // Syn.g:51:1: idlist : IDENTIFIER ( COMMA IDENTIFIER )* ;
    public final Syn.idlist_return idlist() throws RecognitionException {
        Syn.idlist_return retval = new Syn.idlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER15=null;
        Token COMMA16=null;
        Token IDENTIFIER17=null;

        Object IDENTIFIER15_tree=null;
        Object COMMA16_tree=null;
        Object IDENTIFIER17_tree=null;

        try {
            // Syn.g:51:9: ( IDENTIFIER ( COMMA IDENTIFIER )* )
            // Syn.g:52:5: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_idlist184); 
            IDENTIFIER15_tree = (Object)adaptor.create(IDENTIFIER15);
            adaptor.addChild(root_0, IDENTIFIER15_tree);

            // Syn.g:52:16: ( COMMA IDENTIFIER )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Syn.g:52:18: COMMA IDENTIFIER
            	    {
            	    COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_idlist188); 
            	    IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_idlist191); 
            	    IDENTIFIER17_tree = (Object)adaptor.create(IDENTIFIER17);
            	    adaptor.addChild(root_0, IDENTIFIER17_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idlist"

    public static class compoundstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundstatement"
    // Syn.g:55:1: compoundstatement : BEGIN ( statement SEMICOLON )* END ;
    public final Syn.compoundstatement_return compoundstatement() throws RecognitionException {
        Syn.compoundstatement_return retval = new Syn.compoundstatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN18=null;
        Token SEMICOLON20=null;
        Token END21=null;
        Syn.statement_return statement19 = null;


        Object BEGIN18_tree=null;
        Object SEMICOLON20_tree=null;
        Object END21_tree=null;

        try {
            // Syn.g:55:19: ( BEGIN ( statement SEMICOLON )* END )
            // Syn.g:56:5: BEGIN ( statement SEMICOLON )* END
            {
            root_0 = (Object)adaptor.nil();

            BEGIN18=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compoundstatement209); 
            BEGIN18_tree = (Object)adaptor.create(BEGIN18);
            root_0 = (Object)adaptor.becomeRoot(BEGIN18_tree, root_0);

            // Syn.g:56:12: ( statement SEMICOLON )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IF||LA4_0==READ||LA4_0==REPEAT||(LA4_0>=WRITE && LA4_0<=WRITELN)||LA4_0==IDENTIFIER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Syn.g:56:14: statement SEMICOLON
            	    {
            	    pushFollow(FOLLOW_statement_in_compoundstatement214);
            	    statement19=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement19.getTree());
            	    SEMICOLON20=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compoundstatement216); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END21=(Token)match(input,END,FOLLOW_END_in_compoundstatement222); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundstatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Syn.g:59:1: statement : ( variable DEFINE expression | READ OPENPAREN variable CLOSEPAREN | WRITE OPENPAREN expression CLOSEPAREN | WRITE OPENPAREN string CLOSEPAREN | WRITELN | IF relationx compoundstatement ( ELSE compoundstatement )? | REPEAT compoundstatement UNTIL relationx );
    public final Syn.statement_return statement() throws RecognitionException {
        Syn.statement_return retval = new Syn.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFINE23=null;
        Token READ25=null;
        Token OPENPAREN26=null;
        Token CLOSEPAREN28=null;
        Token WRITE29=null;
        Token OPENPAREN30=null;
        Token CLOSEPAREN32=null;
        Token WRITE33=null;
        Token OPENPAREN34=null;
        Token CLOSEPAREN36=null;
        Token WRITELN37=null;
        Token IF38=null;
        Token ELSE41=null;
        Token REPEAT43=null;
        Token UNTIL45=null;
        Syn.variable_return variable22 = null;

        Syn.expression_return expression24 = null;

        Syn.variable_return variable27 = null;

        Syn.expression_return expression31 = null;

        Syn.string_return string35 = null;

        Syn.relationx_return relationx39 = null;

        Syn.compoundstatement_return compoundstatement40 = null;

        Syn.compoundstatement_return compoundstatement42 = null;

        Syn.compoundstatement_return compoundstatement44 = null;

        Syn.relationx_return relationx46 = null;


        Object DEFINE23_tree=null;
        Object READ25_tree=null;
        Object OPENPAREN26_tree=null;
        Object CLOSEPAREN28_tree=null;
        Object WRITE29_tree=null;
        Object OPENPAREN30_tree=null;
        Object CLOSEPAREN32_tree=null;
        Object WRITE33_tree=null;
        Object OPENPAREN34_tree=null;
        Object CLOSEPAREN36_tree=null;
        Object WRITELN37_tree=null;
        Object IF38_tree=null;
        Object ELSE41_tree=null;
        Object REPEAT43_tree=null;
        Object UNTIL45_tree=null;

        try {
            // Syn.g:59:11: ( variable DEFINE expression | READ OPENPAREN variable CLOSEPAREN | WRITE OPENPAREN expression CLOSEPAREN | WRITE OPENPAREN string CLOSEPAREN | WRITELN | IF relationx compoundstatement ( ELSE compoundstatement )? | REPEAT compoundstatement UNTIL relationx )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // Syn.g:60:5: variable DEFINE expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_statement238);
                    variable22=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable22.getTree());
                    DEFINE23=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_statement240); 
                    DEFINE23_tree = (Object)adaptor.create(DEFINE23);
                    root_0 = (Object)adaptor.becomeRoot(DEFINE23_tree, root_0);

                    pushFollow(FOLLOW_expression_in_statement243);
                    expression24=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression24.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:61:5: READ OPENPAREN variable CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    READ25=(Token)match(input,READ,FOLLOW_READ_in_statement251); 
                    READ25_tree = (Object)adaptor.create(READ25);
                    root_0 = (Object)adaptor.becomeRoot(READ25_tree, root_0);

                    OPENPAREN26=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement254); 
                    pushFollow(FOLLOW_variable_in_statement257);
                    variable27=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable27.getTree());
                    CLOSEPAREN28=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement259); 

                    }
                    break;
                case 3 :
                    // Syn.g:62:5: WRITE OPENPAREN expression CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE29=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement268); 
                    WRITE29_tree = (Object)adaptor.create(WRITE29);
                    root_0 = (Object)adaptor.becomeRoot(WRITE29_tree, root_0);

                    OPENPAREN30=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement271); 
                    pushFollow(FOLLOW_expression_in_statement274);
                    expression31=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression31.getTree());
                    CLOSEPAREN32=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement276); 

                    }
                    break;
                case 4 :
                    // Syn.g:63:5: WRITE OPENPAREN string CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITE33=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement285); 
                    WRITE33_tree = (Object)adaptor.create(WRITE33);
                    root_0 = (Object)adaptor.becomeRoot(WRITE33_tree, root_0);

                    OPENPAREN34=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement288); 
                    pushFollow(FOLLOW_string_in_statement291);
                    string35=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string35.getTree());
                    CLOSEPAREN36=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement293); 

                    }
                    break;
                case 5 :
                    // Syn.g:64:5: WRITELN
                    {
                    root_0 = (Object)adaptor.nil();

                    WRITELN37=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement301); 
                    WRITELN37_tree = (Object)adaptor.create(WRITELN37);
                    adaptor.addChild(root_0, WRITELN37_tree);


                    }
                    break;
                case 6 :
                    // Syn.g:65:5: IF relationx compoundstatement ( ELSE compoundstatement )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF38=(Token)match(input,IF,FOLLOW_IF_in_statement309); 
                    IF38_tree = (Object)adaptor.create(IF38);
                    root_0 = (Object)adaptor.becomeRoot(IF38_tree, root_0);

                    pushFollow(FOLLOW_relationx_in_statement312);
                    relationx39=relationx();

                    state._fsp--;

                    adaptor.addChild(root_0, relationx39.getTree());
                    pushFollow(FOLLOW_compoundstatement_in_statement314);
                    compoundstatement40=compoundstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundstatement40.getTree());
                    // Syn.g:65:37: ( ELSE compoundstatement )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ELSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Syn.g:65:39: ELSE compoundstatement
                            {
                            ELSE41=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement318); 
                            pushFollow(FOLLOW_compoundstatement_in_statement321);
                            compoundstatement42=compoundstatement();

                            state._fsp--;

                            adaptor.addChild(root_0, compoundstatement42.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Syn.g:66:5: REPEAT compoundstatement UNTIL relationx
                    {
                    root_0 = (Object)adaptor.nil();

                    REPEAT43=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_statement332); 
                    REPEAT43_tree = (Object)adaptor.create(REPEAT43);
                    root_0 = (Object)adaptor.becomeRoot(REPEAT43_tree, root_0);

                    pushFollow(FOLLOW_compoundstatement_in_statement335);
                    compoundstatement44=compoundstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundstatement44.getTree());
                    UNTIL45=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_statement337); 
                    pushFollow(FOLLOW_relationx_in_statement340);
                    relationx46=relationx();

                    state._fsp--;

                    adaptor.addChild(root_0, relationx46.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class relationx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationx"
    // Syn.g:69:1: relationx : expression RELATION expression ;
    public final Syn.relationx_return relationx() throws RecognitionException {
        Syn.relationx_return retval = new Syn.relationx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELATION48=null;
        Syn.expression_return expression47 = null;

        Syn.expression_return expression49 = null;


        Object RELATION48_tree=null;

        try {
            // Syn.g:69:11: ( expression RELATION expression )
            // Syn.g:70:5: expression RELATION expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_relationx355);
            expression47=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression47.getTree());
            RELATION48=(Token)match(input,RELATION,FOLLOW_RELATION_in_relationx357); 
            RELATION48_tree = (Object)adaptor.create(RELATION48);
            root_0 = (Object)adaptor.becomeRoot(RELATION48_tree, root_0);

            pushFollow(FOLLOW_expression_in_relationx360);
            expression49=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression49.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationx"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Syn.g:73:1: expression : unaryopx ( ( PLUS | MINUS ) term )* ;
    public final Syn.expression_return expression() throws RecognitionException {
        Syn.expression_return retval = new Syn.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;
        Syn.unaryopx_return unaryopx50 = null;

        Syn.term_return term52 = null;


        Object set51_tree=null;

        try {
            // Syn.g:73:12: ( unaryopx ( ( PLUS | MINUS ) term )* )
            // Syn.g:74:5: unaryopx ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryopx_in_expression378);
            unaryopx50=unaryopx();

            state._fsp--;

            adaptor.addChild(root_0, unaryopx50.getTree());
            // Syn.g:74:14: ( ( PLUS | MINUS ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Syn.g:74:15: ( PLUS | MINUS ) term
            	    {
            	    set51=(Token)input.LT(1);
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set51), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expression391);
            	    term52=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term52.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class unaryopx_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryopx"
    // Syn.g:77:1: unaryopx : ( PLUS | MINUS )? term ;
    public final Syn.unaryopx_return unaryopx() throws RecognitionException {
        Syn.unaryopx_return retval = new Syn.unaryopx_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS53=null;
        Token MINUS54=null;
        Syn.term_return term55 = null;


        Object PLUS53_tree=null;
        Object MINUS54_tree=null;

        try {
            // Syn.g:77:10: ( ( PLUS | MINUS )? term )
            // Syn.g:78:5: ( PLUS | MINUS )? term
            {
            root_0 = (Object)adaptor.nil();

            // Syn.g:78:5: ( PLUS | MINUS )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PLUS) ) {
                alt8=1;
            }
            else if ( (LA8_0==MINUS) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // Syn.g:78:7: PLUS
                    {
                    PLUS53=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryopx413); 
                    PLUS53_tree = (Object)adaptor.create(PLUS53);
                    root_0 = (Object)adaptor.becomeRoot(PLUS53_tree, root_0);


                    }
                    break;
                case 2 :
                    // Syn.g:78:15: MINUS
                    {
                    MINUS54=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryopx418); 
                    MINUS54_tree = (Object)adaptor.create(MINUS54);
                    root_0 = (Object)adaptor.becomeRoot(MINUS54_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_unaryopx425);
            term55=term();

            state._fsp--;

            adaptor.addChild(root_0, term55.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryopx"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // Syn.g:81:1: factor : ( variable | constant | OPENPAREN expression CLOSEPAREN );
    public final Syn.factor_return factor() throws RecognitionException {
        Syn.factor_return retval = new Syn.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPENPAREN58=null;
        Token CLOSEPAREN60=null;
        Syn.variable_return variable56 = null;

        Syn.constant_return constant57 = null;

        Syn.expression_return expression59 = null;


        Object OPENPAREN58_tree=null;
        Object CLOSEPAREN60_tree=null;

        try {
            // Syn.g:81:8: ( variable | constant | OPENPAREN expression CLOSEPAREN )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt9=1;
                }
                break;
            case INTEGERVAL:
            case REALVAL:
                {
                alt9=2;
                }
                break;
            case OPENPAREN:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Syn.g:82:6: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_factor442);
                    variable56=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable56.getTree());

                    }
                    break;
                case 2 :
                    // Syn.g:83:6: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_factor449);
                    constant57=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant57.getTree());

                    }
                    break;
                case 3 :
                    // Syn.g:84:6: OPENPAREN expression CLOSEPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    OPENPAREN58=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor456); 
                    pushFollow(FOLLOW_expression_in_factor459);
                    expression59=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression59.getTree());
                    CLOSEPAREN60=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor461); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // Syn.g:87:1: term : factor ( ( TIMES | DIVIDE ) factor )* ;
    public final Syn.term_return term() throws RecognitionException {
        Syn.term_return retval = new Syn.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set62=null;
        Syn.factor_return factor61 = null;

        Syn.factor_return factor63 = null;


        Object set62_tree=null;

        try {
            // Syn.g:87:6: ( factor ( ( TIMES | DIVIDE ) factor )* )
            // Syn.g:88:5: factor ( ( TIMES | DIVIDE ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term484);
            factor61=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor61.getTree());
            // Syn.g:88:12: ( ( TIMES | DIVIDE ) factor )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=TIMES && LA10_0<=DIVIDE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Syn.g:88:14: ( TIMES | DIVIDE ) factor
            	    {
            	    set62=(Token)input.LT(1);
            	    set62=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set62), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term499);
            	    factor63=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor63.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // Syn.g:91:1: variable : IDENTIFIER ;
    public final Syn.variable_return variable() throws RecognitionException {
        Syn.variable_return retval = new Syn.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER64=null;

        Object IDENTIFIER64_tree=null;

        try {
            // Syn.g:91:10: ( IDENTIFIER )
            // Syn.g:92:5: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER64=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable520); 
            IDENTIFIER64_tree = (Object)adaptor.create(IDENTIFIER64);
            adaptor.addChild(root_0, IDENTIFIER64_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // Syn.g:95:1: constant : ( INTEGERVAL | REALVAL );
    public final Syn.constant_return constant() throws RecognitionException {
        Syn.constant_return retval = new Syn.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // Syn.g:95:10: ( INTEGERVAL | REALVAL )
            // Syn.g:
            {
            root_0 = (Object)adaptor.nil();

            set65=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGERVAL && input.LA(1)<=REALVAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set65));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    protected static class string_scope {
        String tmp;
    }
    protected Stack string_stack = new Stack();

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // Syn.g:99:1: string : s= STRING -> STRING[$string::tmp] ;
    public final Syn.string_return string() throws RecognitionException {
        string_stack.push(new string_scope());
        Syn.string_return retval = new Syn.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token s=null;

        Object s_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Syn.g:101:2: (s= STRING -> STRING[$string::tmp] )
            // Syn.g:102:2: s= STRING
            {
            s=(Token)match(input,STRING,FOLLOW_STRING_in_string561);  
            stream_STRING.add(s);

             ((string_scope)string_stack.peek()).tmp = cleanString((s!=null?s.getText():null)); 


            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:51: -> STRING[$string::tmp]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(STRING, ((string_scope)string_stack.peek()).tmp));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            string_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "string"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\41\2\uffff\1\60\3\uffff\1\60\2\uffff";
    static final String DFA6_maxS =
        "\1\73\2\uffff\1\60\3\uffff\1\75\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\3\1\4";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\5\2\uffff\1\2\1\uffff\1\6\2\uffff\1\3\1\4\20\uffff\1\1",
            "",
            "",
            "\1\7",
            "",
            "",
            "",
            "\1\10\3\uffff\2\10\3\uffff\1\11\1\uffff\3\10",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "59:1: statement : ( variable DEFINE expression | READ OPENPAREN variable CLOSEPAREN | WRITE OPENPAREN expression CLOSEPAREN | WRITE OPENPAREN string CLOSEPAREN | WRITELN | IF relationx compoundstatement ( ELSE compoundstatement )? | REPEAT compoundstatement UNTIL relationx );";
        }
    }
 

    public static final BitSet FOLLOW_PROGRAM_in_program48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_programname_in_program51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_program53 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_block_in_program56 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_FULLSTOP_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_programname74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_block111 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_block120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_declarations137 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_declarationsx_in_declarations141 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_idlist_in_declarationsx160 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_type_in_declarationsx162 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarationsx165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_idlist184 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_COMMA_in_idlist188 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_idlist191 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundstatement209 = new BitSet(new long[]{0x0800065300000000L});
    public static final BitSet FOLLOW_statement_in_compoundstatement214 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_compoundstatement216 = new BitSet(new long[]{0x0800065300000000L});
    public static final BitSet FOLLOW_END_in_compoundstatement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_statement238 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_DEFINE_in_statement240 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_expression_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_statement251 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement254 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_variable_in_statement257 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement268 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement271 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_expression_in_statement274 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_statement285 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPENPAREN_in_statement288 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_string_in_statement291 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_statement293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITELN_in_statement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement309 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_relationx_in_statement312 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_statement314 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ELSE_in_statement318 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_statement321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_statement332 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_compoundstatement_in_statement335 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_UNTIL_in_statement337 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_relationx_in_statement340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_relationx355 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RELATION_in_relationx357 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_expression_in_relationx360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryopx_in_expression378 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_set_in_expression381 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_term_in_expression391 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryopx413 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_MINUS_in_unaryopx418 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_term_in_unaryopx425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_factor449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENPAREN_in_factor456 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_expression_in_factor459 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLOSEPAREN_in_factor461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term484 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_set_in_term488 = new BitSet(new long[]{0x3831000000000000L});
    public static final BitSet FOLLOW_factor_in_term499 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string561 = new BitSet(new long[]{0x0000000000000002L});

}