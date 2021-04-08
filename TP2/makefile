%:%.java
	javac $@*.java

%.java:%.g4
	java -Xmx500M -cp "/home/k/d/kdoolaeg/antlr-4.9.2-complete.jar:$(CLASSPATH)" org.antlr.v4.Tool $<
