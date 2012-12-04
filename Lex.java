// $ANTLR 3.2 Sep 23, 2009 12:02:23 Lex.g 2010-04-30 19:44:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Lex extends Lexer {
    public static final int CHAR=44;
    public static final int DEFINE=51;
    public static final int EOF=-1;
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

    public Lex() {;} 
    public Lex(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lex(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Lex.g"; }

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // Lex.g:9:2: ( ( 'A' | 'a' ) )
            // Lex.g:9:4: ( 'A' | 'a' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // Lex.g:11:2: ( ( 'B' | 'b' ) )
            // Lex.g:11:4: ( 'B' | 'b' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // Lex.g:13:2: ( ( 'C' | 'c' ) )
            // Lex.g:13:4: ( 'C' | 'c' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // Lex.g:15:2: ( ( 'D' | 'd' ) )
            // Lex.g:15:4: ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // Lex.g:17:2: ( ( 'E' | 'e' ) )
            // Lex.g:17:4: ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // Lex.g:19:2: ( ( 'F' | 'f' ) )
            // Lex.g:19:4: ( 'F' | 'f' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // Lex.g:21:2: ( ( 'G' | 'g' ) )
            // Lex.g:21:4: ( 'G' | 'g' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // Lex.g:23:2: ( ( 'H' | 'h' ) )
            // Lex.g:23:4: ( 'H' | 'h' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // Lex.g:25:2: ( ( 'I' | 'i' ) )
            // Lex.g:25:4: ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // Lex.g:27:2: ( ( 'J' | 'j' ) )
            // Lex.g:27:4: ( 'J' | 'j' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // Lex.g:29:2: ( ( 'K' | 'k' ) )
            // Lex.g:29:4: ( 'K' | 'k' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // Lex.g:31:2: ( ( 'L' | 'l' ) )
            // Lex.g:31:4: ( 'L' | 'l' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // Lex.g:33:2: ( ( 'M' | 'm' ) )
            // Lex.g:33:4: ( 'M' | 'm' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // Lex.g:35:2: ( ( 'N' | 'n' ) )
            // Lex.g:35:4: ( 'N' | 'n' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // Lex.g:37:2: ( ( 'O' | 'o' ) )
            // Lex.g:37:4: ( 'O' | 'o' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // Lex.g:39:2: ( ( 'P' | 'p' ) )
            // Lex.g:39:4: ( 'P' | 'p' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // Lex.g:41:2: ( ( 'Q' | 'q' ) )
            // Lex.g:41:4: ( 'Q' | 'q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // Lex.g:43:2: ( ( 'R' | 'r' ) )
            // Lex.g:43:4: ( 'R' | 'r' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // Lex.g:45:2: ( ( 'S' | 's' ) )
            // Lex.g:45:4: ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // Lex.g:47:2: ( ( 'T' | 't' ) )
            // Lex.g:47:4: ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // Lex.g:49:2: ( ( 'U' | 'u' ) )
            // Lex.g:49:4: ( 'U' | 'u' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // Lex.g:51:2: ( ( 'V' | 'v' ) )
            // Lex.g:51:4: ( 'V' | 'v' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // Lex.g:53:2: ( ( 'W' | 'w' ) )
            // Lex.g:53:4: ( 'W' | 'w' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // Lex.g:55:2: ( ( 'X' | 'x' ) )
            // Lex.g:55:4: ( 'X' | 'x' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // Lex.g:57:2: ( ( 'Y' | 'y' ) )
            // Lex.g:57:4: ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // Lex.g:59:2: ( ( 'Z' | 'z' ) )
            // Lex.g:59:4: ( 'Z' | 'z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:64:8: ( B E G I N )
            // Lex.g:64:10: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:65:6: ( E L S E )
            // Lex.g:65:8: E L S E
            {
            mE(); 
            mL(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:66:5: ( E N D )
            // Lex.g:66:7: E N D
            {
            mE(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:67:4: ( I F )
            // Lex.g:67:6: I F
            {
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:68:9: ( I N T E G E R )
            // Lex.g:68:11: I N T E G E R
            {
            mI(); 
            mN(); 
            mT(); 
            mE(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:69:9: ( P R O G R A M )
            // Lex.g:69:11: P R O G R A M
            {
            mP(); 
            mR(); 
            mO(); 
            mG(); 
            mR(); 
            mA(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:70:6: ( R E A D )
            // Lex.g:70:8: R E A D
            {
            mR(); 
            mE(); 
            mA(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:71:6: ( R E A L )
            // Lex.g:71:8: R E A L
            {
            mR(); 
            mE(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:72:8: ( R E P E A T )
            // Lex.g:72:10: R E P E A T
            {
            mR(); 
            mE(); 
            mP(); 
            mE(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:73:7: ( U N T I L )
            // Lex.g:73:9: U N T I L
            {
            mU(); 
            mN(); 
            mT(); 
            mI(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:74:5: ( V A R )
            // Lex.g:74:7: V A R
            {
            mV(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:75:7: ( W R I T E )
            // Lex.g:75:9: W R I T E
            {
            mW(); 
            mR(); 
            mI(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "WRITELN"
    public final void mWRITELN() throws RecognitionException {
        try {
            int _type = WRITELN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:76:9: ( W R I T E L N )
            // Lex.g:76:11: W R I T E L N
            {
            mW(); 
            mR(); 
            mI(); 
            mT(); 
            mE(); 
            mL(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITELN"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:82:9: ( '{' (~ ( '{' | '}' ) )* '}' )
            // Lex.g:82:11: '{' (~ ( '{' | '}' ) )* '}'
            {
            match('{'); 
            // Lex.g:82:15: (~ ( '{' | '}' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Lex.g:82:15: ~ ( '{' | '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('}'); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // Lex.g:88:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // Lex.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Lex.g:89:16: ( '0' .. '9' )
            // Lex.g:89:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:95:15: ( ';' )
            // Lex.g:95:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "FULLSTOP"
    public final void mFULLSTOP() throws RecognitionException {
        try {
            int _type = FULLSTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:96:14: ( '.' )
            // Lex.g:96:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULLSTOP"

    // $ANTLR start "OPENPAREN"
    public final void mOPENPAREN() throws RecognitionException {
        try {
            int _type = OPENPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:97:14: ( '(' )
            // Lex.g:97:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENPAREN"

    // $ANTLR start "CLOSEPAREN"
    public final void mCLOSEPAREN() throws RecognitionException {
        try {
            int _type = CLOSEPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:98:12: ( ')' )
            // Lex.g:98:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEPAREN"

    // $ANTLR start "RELATION"
    public final void mRELATION() throws RecognitionException {
        try {
            int _type = RELATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:99:10: ( '>' | '>=' | '=' | '!=' | '<=' | '<' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
                }
                break;
            case '=':
                {
                alt2=3;
                }
                break;
            case '!':
                {
                alt2=4;
                }
                break;
            case '<':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='=') ) {
                    alt2=5;
                }
                else {
                    alt2=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Lex.g:99:12: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Lex.g:99:18: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // Lex.g:99:25: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // Lex.g:99:31: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 5 :
                    // Lex.g:99:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 6 :
                    // Lex.g:99:45: '<'
                    {
                    match('<'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATION"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:100:9: ( ':=' )
            // Lex.g:100:11: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:101:7: ( '+' )
            // Lex.g:101:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:102:8: ( '-' )
            // Lex.g:102:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:103:8: ( '*' )
            // Lex.g:103:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:104:9: ( '/' )
            // Lex.g:104:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:105:9: ( ',' )
            // Lex.g:105:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:111:14: ( '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\'' )
            // Lex.g:111:16: '\\'' ( '\\'' '\\'' | ~ '\\'' )* '\\''
            {
            match('\''); 
            // Lex.g:111:21: ( '\\'' '\\'' | ~ '\\'' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\'') ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // Lex.g:111:22: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // Lex.g:111:34: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:112:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // Lex.g:112:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // Lex.g:112:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Lex.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:113:14: ( CHAR ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )? )? )? )
            // Lex.g:113:16: CHAR ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )? )? )?
            {
            mCHAR(); 
            // Lex.g:113:21: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )? )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Lex.g:113:22: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )? )?
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // Lex.g:113:37: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )? )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Lex.g:113:38: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )?
                            {
                            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // Lex.g:113:53: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )? )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||(LA10_0>='a' && LA10_0<='z')) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // Lex.g:113:54: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )?
                                    {
                                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // Lex.g:113:69: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )? )?
                                    int alt9=2;
                                    int LA9_0 = input.LA(1);

                                    if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                                        alt9=1;
                                    }
                                    switch (alt9) {
                                        case 1 :
                                            // Lex.g:113:70: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )?
                                            {
                                            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                                input.consume();

                                            }
                                            else {
                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                recover(mse);
                                                throw mse;}

                                            // Lex.g:113:85: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )? )?
                                            int alt8=2;
                                            int LA8_0 = input.LA(1);

                                            if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
                                                alt8=1;
                                            }
                                            switch (alt8) {
                                                case 1 :
                                                    // Lex.g:113:86: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )?
                                                    {
                                                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                                        input.consume();

                                                    }
                                                    else {
                                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                                        recover(mse);
                                                        throw mse;}

                                                    // Lex.g:113:101: ( ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )? )?
                                                    int alt7=2;
                                                    int LA7_0 = input.LA(1);

                                                    if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
                                                        alt7=1;
                                                    }
                                                    switch (alt7) {
                                                        case 1 :
                                                            // Lex.g:113:102: ( CHAR | DIGIT ) ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )?
                                                            {
                                                            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                                                input.consume();

                                                            }
                                                            else {
                                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                recover(mse);
                                                                throw mse;}

                                                            // Lex.g:113:117: ( ( CHAR | DIGIT ) ( CHAR | DIGIT )? )?
                                                            int alt6=2;
                                                            int LA6_0 = input.LA(1);

                                                            if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                                                                alt6=1;
                                                            }
                                                            switch (alt6) {
                                                                case 1 :
                                                                    // Lex.g:113:118: ( CHAR | DIGIT ) ( CHAR | DIGIT )?
                                                                    {
                                                                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                                                        input.consume();

                                                                    }
                                                                    else {
                                                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                        recover(mse);
                                                                        throw mse;}

                                                                    // Lex.g:113:133: ( CHAR | DIGIT )?
                                                                    int alt5=2;
                                                                    int LA5_0 = input.LA(1);

                                                                    if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                                                                        alt5=1;
                                                                    }
                                                                    switch (alt5) {
                                                                        case 1 :
                                                                            // Lex.g:
                                                                            {
                                                                            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                                                                                input.consume();

                                                                            }
                                                                            else {
                                                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                                                recover(mse);
                                                                                throw mse;}


                                                                            }
                                                                            break;

                                                                    }


                                                                    }
                                                                    break;

                                                            }


                                                            }
                                                            break;

                                                    }


                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTEGERVAL"
    public final void mINTEGERVAL() throws RecognitionException {
        try {
            int _type = INTEGERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:114:14: ( ( DIGIT )+ )
            // Lex.g:114:16: ( DIGIT )+
            {
            // Lex.g:114:16: ( DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Lex.g:114:16: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGERVAL"

    // $ANTLR start "REALVAL"
    public final void mREALVAL() throws RecognitionException {
        try {
            int _type = REALVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Lex.g:115:14: ( INTEGERVAL FULLSTOP INTEGERVAL ( E ( MINUS )? INTEGERVAL )? )
            // Lex.g:115:16: INTEGERVAL FULLSTOP INTEGERVAL ( E ( MINUS )? INTEGERVAL )?
            {
            mINTEGERVAL(); 
            mFULLSTOP(); 
            mINTEGERVAL(); 
            // Lex.g:115:47: ( E ( MINUS )? INTEGERVAL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='E'||LA15_0=='e') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Lex.g:115:49: E ( MINUS )? INTEGERVAL
                    {
                    mE(); 
                    // Lex.g:115:51: ( MINUS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='-') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Lex.g:115:51: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    mINTEGERVAL(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REALVAL"

    public void mTokens() throws RecognitionException {
        // Lex.g:1:8: ( BEGIN | ELSE | END | IF | INTEGER | PROGRAM | READ | REAL | REPEAT | UNTIL | VAR | WRITE | WRITELN | COMMENT | SEMICOLON | FULLSTOP | OPENPAREN | CLOSEPAREN | RELATION | DEFINE | PLUS | MINUS | TIMES | DIVIDE | COMMA | STRING | WS | IDENTIFIER | INTEGERVAL | REALVAL )
        int alt16=30;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // Lex.g:1:10: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 2 :
                // Lex.g:1:16: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // Lex.g:1:21: END
                {
                mEND(); 

                }
                break;
            case 4 :
                // Lex.g:1:25: IF
                {
                mIF(); 

                }
                break;
            case 5 :
                // Lex.g:1:28: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 6 :
                // Lex.g:1:36: PROGRAM
                {
                mPROGRAM(); 

                }
                break;
            case 7 :
                // Lex.g:1:44: READ
                {
                mREAD(); 

                }
                break;
            case 8 :
                // Lex.g:1:49: REAL
                {
                mREAL(); 

                }
                break;
            case 9 :
                // Lex.g:1:54: REPEAT
                {
                mREPEAT(); 

                }
                break;
            case 10 :
                // Lex.g:1:61: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 11 :
                // Lex.g:1:67: VAR
                {
                mVAR(); 

                }
                break;
            case 12 :
                // Lex.g:1:71: WRITE
                {
                mWRITE(); 

                }
                break;
            case 13 :
                // Lex.g:1:77: WRITELN
                {
                mWRITELN(); 

                }
                break;
            case 14 :
                // Lex.g:1:85: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 15 :
                // Lex.g:1:93: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 16 :
                // Lex.g:1:103: FULLSTOP
                {
                mFULLSTOP(); 

                }
                break;
            case 17 :
                // Lex.g:1:112: OPENPAREN
                {
                mOPENPAREN(); 

                }
                break;
            case 18 :
                // Lex.g:1:122: CLOSEPAREN
                {
                mCLOSEPAREN(); 

                }
                break;
            case 19 :
                // Lex.g:1:133: RELATION
                {
                mRELATION(); 

                }
                break;
            case 20 :
                // Lex.g:1:142: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 21 :
                // Lex.g:1:149: PLUS
                {
                mPLUS(); 

                }
                break;
            case 22 :
                // Lex.g:1:154: MINUS
                {
                mMINUS(); 

                }
                break;
            case 23 :
                // Lex.g:1:160: TIMES
                {
                mTIMES(); 

                }
                break;
            case 24 :
                // Lex.g:1:166: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 25 :
                // Lex.g:1:173: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 26 :
                // Lex.g:1:179: STRING
                {
                mSTRING(); 

                }
                break;
            case 27 :
                // Lex.g:1:186: WS
                {
                mWS(); 

                }
                break;
            case 28 :
                // Lex.g:1:189: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 29 :
                // Lex.g:1:200: INTEGERVAL
                {
                mINTEGERVAL(); 

                }
                break;
            case 30 :
                // Lex.g:1:211: REALVAL
                {
                mREALVAL(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\10\27\17\uffff\1\43\4\27\1\51\5\27\2\uffff\1\27\1\61\2"+
        "\27\1\uffff\4\27\1\71\2\27\1\uffff\1\74\2\27\1\77\1\100\2\27\1\uffff"+
        "\1\27\1\104\1\uffff\2\27\2\uffff\1\27\1\110\1\112\1\uffff\2\27\1"+
        "\115\1\uffff\1\27\1\uffff\1\117\1\120\1\uffff\1\121\3\uffff";
    static final String DFA16_eofS =
        "\122\uffff";
    static final String DFA16_minS =
        "\1\11\1\105\1\114\1\106\1\122\1\105\1\116\1\101\1\122\17\uffff\1"+
        "\56\1\107\1\104\1\123\1\124\1\60\1\117\1\101\1\124\1\122\1\111\2"+
        "\uffff\1\111\1\60\2\105\1\uffff\1\107\1\104\1\105\1\111\1\60\1\124"+
        "\1\116\1\uffff\1\60\1\107\1\122\2\60\1\101\1\114\1\uffff\1\105\1"+
        "\60\1\uffff\1\105\1\101\2\uffff\1\124\2\60\1\uffff\1\122\1\115\1"+
        "\60\1\uffff\1\116\1\uffff\2\60\1\uffff\1\60\3\uffff";
    static final String DFA16_maxS =
        "\1\173\1\145\2\156\1\162\1\145\1\156\1\141\1\162\17\uffff\1\71\1"+
        "\147\1\144\1\163\1\164\1\172\1\157\1\160\1\164\1\162\1\151\2\uffff"+
        "\1\151\1\172\2\145\1\uffff\1\147\1\154\1\145\1\151\1\172\1\164\1"+
        "\156\1\uffff\1\172\1\147\1\162\2\172\1\141\1\154\1\uffff\1\145\1"+
        "\172\1\uffff\1\145\1\141\2\uffff\1\164\2\172\1\uffff\1\162\1\155"+
        "\1\172\1\uffff\1\156\1\uffff\2\172\1\uffff\1\172\3\uffff";
    static final String DFA16_acceptS =
        "\11\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\13\uffff\1\35\1\36\4\uffff\1\4\7\uffff\1\3"+
        "\7\uffff\1\13\2\uffff\1\2\2\uffff\1\10\1\7\3\uffff\1\1\3\uffff\1"+
        "\12\1\uffff\1\14\2\uffff\1\11\1\uffff\1\5\1\6\1\15";
    static final String DFA16_specialS =
        "\122\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\1\16\5\uffff\1\25\1\14\1\15"+
            "\1\22\1\20\1\24\1\21\1\13\1\23\12\30\1\17\1\12\3\16\2\uffff"+
            "\1\27\1\1\2\27\1\2\3\27\1\3\6\27\1\4\1\27\1\5\2\27\1\6\1\7\1"+
            "\10\3\27\6\uffff\1\27\1\1\2\27\1\2\3\27\1\3\6\27\1\4\1\27\1"+
            "\5\2\27\1\6\1\7\1\10\3\27\1\11",
            "\1\31\37\uffff\1\31",
            "\1\33\1\uffff\1\32\35\uffff\1\33\1\uffff\1\32",
            "\1\35\7\uffff\1\34\27\uffff\1\35\7\uffff\1\34",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\30",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\52\37\uffff\1\52",
            "\1\53\16\uffff\1\54\20\uffff\1\53\16\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "",
            "",
            "\1\60\37\uffff\1\60",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "",
            "\1\64\37\uffff\1\64",
            "\1\66\7\uffff\1\65\27\uffff\1\66\7\uffff\1\65",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "",
            "\1\103\37\uffff\1\103",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "",
            "",
            "\1\107\37\uffff\1\107",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\12\27\7\uffff\13\27\1\111\16\27\6\uffff\13\27\1\111\16\27",
            "",
            "\1\113\37\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\1\116\37\uffff\1\116",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\6\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BEGIN | ELSE | END | IF | INTEGER | PROGRAM | READ | REAL | REPEAT | UNTIL | VAR | WRITE | WRITELN | COMMENT | SEMICOLON | FULLSTOP | OPENPAREN | CLOSEPAREN | RELATION | DEFINE | PLUS | MINUS | TIMES | DIVIDE | COMMA | STRING | WS | IDENTIFIER | INTEGERVAL | REALVAL );";
        }
    }
 

}