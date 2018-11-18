
// Generated from FabLexer.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"




class  FabLexer : public antlr4::Lexer {
public:
  enum {
    Comment = 1, WS = 2, Action = 3, FileListStart = 4, Foreach = 5, Function = 6, 
    Else = 7, If = 8, Record = 9, Type = 10, BoolLiteral = 11, IntLiteral = 12, 
    StringLiteral = 13, And = 14, Cons = 15, Divide = 16, Equals = 17, Minus = 18, 
    Multiply = 19, Not = 20, NotEquals = 21, Or = 22, Plus = 23, Xor = 24, 
    ArgSep = 25, Assign = 26, BraceOpen = 27, BraceClose = 28, BracketOpen = 29, 
    BracketClose = 30, End = 31, FieldSep = 32, Input = 33, ParenOpen = 34, 
    ParenClose = 35, Produces = 36, Query = 37, TypeSep = 38, Identifier = 39, 
    ErrorChar = 40, FileListArgs = 41, FileListEnd = 42, FilenameLiteral = 43, 
    FileListWS = 44, FileListError = 45
  };

  enum {
    FileList = 1
  };

  FabLexer(antlr4::CharStream *input);
  ~FabLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

