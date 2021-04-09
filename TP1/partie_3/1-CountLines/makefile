ANTLR_PWD=.

classpath='.:$(ANTLR_PWD)/antlr-4.9.2-complete.jar:'
antlr4=java -Xmx500M -cp "$(ANTLR_PWD)/antlr-4.9.2-complete.jar:$(classpath)" org.antlr.v4.Tool
grun=java -Xmx500M -cp "$(ANTLR_PWD)/antlr-4.9.2-complete.jar:$(classpath)" org.antlr.v4.gui.TestRig

all:
	$(antlr4) *.g4
	javac *.java

clean:
	rm *.class *.tokens *.java *.interp
