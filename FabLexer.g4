//! @file lexer.g4   ANTLRv4 description of Fabrique lexer tokens

/*
 * Copyright 2018 Jonathan Anderson
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

lexer grammar FabLexer;

// We use shell/Python-style comments
Comment		: '#' ~[\r\n]* -> skip ;

// Disregard common forms of whitespace
WS		: [ \t\r\n]+ -> skip ;

// Keywords:
Action		: 'action' ;
FileListStart	: 'files(' -> pushMode(FileList) ;   // enter "file list" mode
Foreach		: 'foreach' ;
Function	: 'function' ;
Else		: 'else' ;
If		: 'if' ;
Not		: 'not' ;
Record		: 'record' ;
Type		: 'type' ;

// An identifier starts with [A-Za-z_] and contains [A-Za-z0-9_]
Identifier	: [a-zA-Z] [a-zA-Z0-9_]* ;

// Literals:
BoolLiteral	: 'true' | 'false' ;
IntLiteral	: [0-9]+ ;
StringLiteral	: ('\'' .*? '\'') | ('"' .*? '"') ;

// Symbols:
ArgSep		: ',' ;
Assign		: '=' ;
BraceOpen	: '{' ;
BraceClose	: '}' ;
BracketOpen	: '[' ;
BracketClose	: ']' ;
End		: ';' ;
FieldSep	: '.' ;
Input		: '<-' ;
Minus		: '-' ;
ParenOpen	: '(' ;
ParenClose	: ')' ;
Plus		: '+' ;
Produces	: '->' ;
Query		: '?' ;
TypeSep		: ':' ;


// The syntax of file lists is different from that of everything else.
mode FileList ;

FileListArgs	: ',' -> popMode ;
FileListEnd	: ')' -> popMode ;

FilenameLiteral	: [A-Za-z0-9_./]+ ;

FileListWS	: [ \t\r\n]+ -> skip ;
