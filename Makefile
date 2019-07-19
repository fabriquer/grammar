.POSIX:
.SUFFIXES: .adoc .html .pdf

ADOC			= asciidoctor
ADOCFLAGS		= -r ./system_pygments.rb
ANTLR			= java -cp $(CLASSPATH) org.antlr.v4.Tool
ANTLR_VERSION		= 4.7.1
ANTLRFLAGS		= -no-listener -visitor
CLASSPATH		= ./antlr/antlr-$(ANTLR_VERSION)-complete.jar
RM			= rm -rf

GENERATED_SRC_DIR	= generated
GENERATED_CXX_DIR	= $(GENERATED_SRC_DIR)/cxx
GENERATED_JAVA_DIR	= $(GENERATED_SRC_DIR)/java

GRAMMARS		= FabLexer.g4 FabParser.g4

PARSER_CXX_SOURCE	= $(GENERATED_CXX_DIR)/FabParser.cpp
PARSER_JAVA_SOURCE	= $(GENERATED_JAVA_DIR)/FabParser.java
PARSER_JAVA_CLASS	= $(GENERATED_JAVA_DIR)/FabParser.class

all: cxx java

check: java
	lit -sv tests

clean:
	$(RM) $(GENERATED_SRC_DIR) *.html

doc: Fabrique.html Fabrique.pdf

test: check

cxx: $(PARSER_CXX_SOURCE)
java: $(PARSER_JAVA_CLASS)

$(PARSER_CXX_SOURCE): $(GRAMMARS)
	$(ANTLR) $(ANTLRFLAGS) -Dlanguage=Cpp -o $(GENERATED_CXX_DIR) $(GRAMMARS)

$(PARSER_JAVA_SOURCE): $(GRAMMARS)
	$(ANTLR) $(ANTLFLAGS) -o $(GENERATED_JAVA_DIR) $(GRAMMARS)

$(PARSER_JAVA_CLASS): $(PARSER_JAVA_SOURCE)
	javac -cp $(CLASSPATH) $(GENERATED_JAVA_DIR)/*.java

.adoc.html:
	$(ADOC) $(ADOCFLAGS) $<

.adoc.pdf:
	asciidoctor-pdf $(ADOCFLAGS) $<
