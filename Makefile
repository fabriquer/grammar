.POSIX:
.SUFFIXES: .adoc .html

ANTLR			= java -cp $(CLASSPATH) org.antlr.v4.Tool
ANTLRFLAGS		= -no-listener -visitor
CLASSPATH		= ./antlr/antlr-4.7.1-complete.jar
RM			= rm -rf

GENERATED_SRC_DIR	= generated
GENERATED_CXX_DIR	= $(GENERATED_SRC_DIR)/cxx
GENERATED_JAVA_DIR	= $(GENERATED_SRC_DIR)/java

GRAMMAR			= Fabrique.g4

PARSER_CXX_SOURCE	= $(GENERATED_CXX_DIR)/fabriqueParser.cpp
PARSER_JAVA_SOURCE	= $(GENERATED_JAVA_DIR)/fabriqueParser.java
PARSER_JAVA_CLASS	= $(GENERATED_JAVA_DIR)/fabriqueParser.class

all: cxx java

check: java
	lit -sv tests

clean:
	$(RM) $(GENERATED_SRC_DIR) *.html

doc: Fabrique.html

test: check

cxx: $(PARSER_CXX_SOURCE)
java: $(PARSER_JAVA_CLASS)

$(PARSER_CXX_SOURCE): $(GRAMMAR)
	$(ANTLR) $(ANTLRFLAGS) -Dlanguage=Cpp -o $(GENERATED_CXX_DIR) $(GRAMMAR)

$(PARSER_JAVA_SOURCE): $(GRAMMAR)
	$(ANTLR) $(ANTLFLAGS) -o $(GENERATED_JAVA_DIR) $(GRAMMAR)

$(PARSER_JAVA_CLASS): $(PARSER_JAVA_SOURCE)
	javac -cp $(CLASSPATH) $(GENERATED_JAVA_DIR)/*.java

.adoc.html:
	asciidoctor $<
