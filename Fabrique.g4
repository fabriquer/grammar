//! @file Fabrique.g4   ANTLRv4 description of Fabrique grammar

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

grammar Fabrique;

//
// The top-level construct in a Fabrique file is an ordered list of values
//
file		: (values+=value)* EOF;

// A value (optionally) binds a name to an expression
value		: (name=Identifier (':' type)* '=')? expression ';';

//
// Almost everything in Fabrique is an expression that can be evaluated
//
expression
	: call
	| compoundExpr
	| conditional
	| fieldQuery
	| foreach
	| function
	| unaryOperator
	| term
	;

// Anything with a function type can be called
call	: term '(' arguments? ')' ;

// Evaluates to one of two possibilities based on a condition
conditional
	: 'if'
	  condition=expression
	  thenClause=expression
	  'else'
	  elseClause=expression
	;

// Extracts a field's value if the field exists, or else a default value
fieldQuery
	: base=term '.' field=Identifier '?' defaultValue=expression
	;

// Transforms one sequence into another
foreach
	: 'foreach' Identifier (':' type)? '<-' src=expression body=expression
	;

// Transforms parameters into a result
function
	: 'function' '(' parameters ')' (':' type)? body=expression
	;

unaryOperator	: ('not' | '-' | '+') expression ;


//
// A term is a simple expression that represents one "thing" with no operations
//
term
	: buildAction
	| compoundExpr
	| list
	| literal
	| nameReference
	| parentheticalExpression
	;

buildAction
	: 'action' '(' command=expression
		(',' keywordArguments)?
		('<-' parameters)?
		')'
	;

literal
	: BoolLiteral
	| IntLiteral
	| StringLiteral
	;

BoolLiteral	: 'true' | 'false' ;
IntLiteral	: [0-9]+ ;
StringLiteral	: ('\'' .*? '\'') | ('"' .*? '"');


// Zero or more value definitions and a result
compoundExpr	: '{' (values+=value)* result=expression '}' ;

// Zero or more expressions of (usually) like type
list		: '[' (values+=expression)* ']' ;

nameReference	: Identifier ;

parentheticalExpression	: '(' expression ')' ;


//
// Arguments and parameters (used in quite a few places):
//
arguments
	: positionalArguments ',' keywordArguments
	| positionalArguments
	| keywordArguments
	;

keywordArgument	: Identifier '=' expression ;
keywordArguments: (args+=keywordArgument (',' args+=keywordArgument)* ','?) ;

positionalArguments	: expression (',' expression)* ','? ;

parameters	: (parameter (',' parameter)*)? ;
parameter	: Identifier ':' type ('=' expression)? ;


//
// There are four syntaxes for naming types:
//
//  - function types: `(type1, type2) => resultType`
//  - record types: `record[field1:type2, field2:type2]`
//  - parametric types: `simpleName[typeArg1, typeArg2]`
//  - simple types: `int`, `string`, `foo`, etc.
//
type
	: functionType
	| recordType
	| parametricType
	| simpleType
	;

functionType	: '(' type_list ')' '=>' type ;
recordType	: 'record' '[' (fieldType (',' fieldType)*)? ','? ']' ;
fieldType	: Identifier ':' type ;
parametricType	: simpleType '[' type_list ']' ;
simpleType	: Identifier ;

type_list	: type (',' type)* ','? ;


// An identifier starts with [A-Za-z_] and contains [A-Za-z0-9_]
Identifier	: [a-zA-Z] [a-zA-Z0-9_]*;

// We use shell/Python-style comments
Comment		: '#' ~[\r\n]* -> skip;

// Disregard common forms of whitespace
WS		: [ \t\r\n]+ -> skip;
