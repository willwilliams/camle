all:
	antlr3 Lex.g
	antlr3 Syn.g
	antlr3 Sem.g
#	antlr3 Irt.g
#	antlr3 Cg.g
	antlr3 *.java
	antlr3 camle -syn hello.le | disptree



clean:
	mv -f camle.java camle.back
	mv -f Memory.java Memory.back
	rm -f *.class
	rm -f *.java
	rm -f *.txt
	rm -f *.tokens
	mv -f Memory.back Memory.java
	mv -f camle.back camle.java

