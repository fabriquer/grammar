//! @file Fabrique.g4   ANTLRv4 description of Fabrique parser grammar

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

parser grammar FabParser;

options { tokenVocab = FabLexer; }

//
// The top-level construct in a Fabrique file is an ordered list of values
//
file		: (values+=value)* EOF;

// A value (optionally) binds a name to an expression
value		: (name=Identifier (TypeSep type)? Assign)? expression End;

//
// Almost everything in Fabrique is an expression that can be evaluated
//
expression
	: expression multOp expression
	| expression addOp expression
	| expression compareOp expression
	| expression logicOp expression
	| <assoc=right> expression cons=Cons expression
	| call
	| conditional
	| fieldQuery
	| fieldReference
	| foreach
	| function
	| unaryOperation
	| term
	;

addOp	: Minus | Plus ;
compareOp : Equals | NotEquals ;
logicOp	: And | Or | Xor ;
multOp	: Multiply | Divide ;

// Anything with a function type can be called
call	: target=term ParenOpen arguments? ParenClose ;

// Evaluates to one of two possibilities based on a condition
conditional
	: If
	  condition=expression
	  thenClause=expression
	  Else
	  elseClause=expression
	;

// Extracts a field's value if the field exists, or else a default value
fieldQuery
	: base=term FieldSep field=Identifier Query defaultValue=expression
	;

// Access a field within a record
fieldReference
	: term FieldSep Identifier
	| fieldReference FieldSep Identifier     // explicitly left-recursive
	;

// Transforms one sequence into another
foreach
	: Foreach Identifier (TypeSep type)? Input src=expression
	  body=expression
	;

// Transforms parameters into a result
function
	: Function ParenOpen parameters ParenClose (TypeSep type)?
	  body=expression
	;

// Transform an expression with a single operator (e.g., logical `not`)
unaryOperation	: unaryOperator expression ;
unaryOperator	: Not | Minus | Plus ;


//
// A term is a simple expression that represents one "thing" with no operations
//
term
	: buildAction
	| compoundExpr
	| fileList
	| list
	| literal
	| nameReference
	| parentheticalExpression
	| record
	| typeDeclaration
	;

buildAction
	: Action ParenOpen arguments
		(Input parameters)?
		ParenClose
	;

// Zero or more value definitions and a result
compoundExpr	: BraceOpen (values+=value)* result=expression BraceClose ;

// Some number of files with common properties
fileList
	: FileListStart FilenameLiteral*
	  (FileListEnd | (FileListArgs keywordArguments ParenClose))
	;

// Zero or more expressions of (some) like type
list		: BracketOpen (values+=expression)* BracketClose ;

// We support boolean, numeric and string literals
literal
	: BoolLiteral
	| IntLiteral
	| StringLiteral
	;

nameReference	: Identifier ;

parentheticalExpression	: ParenOpen expression ParenClose ;

record		: Record BraceOpen (fields+=value)* BraceClose ;

typeDeclaration	: Type type ;


//
// Arguments and parameters (used in quite a few places):
//
arguments
	: positionalArguments ArgSep keywordArguments
	| positionalArguments
	| keywordArguments
	;

keywordArgument	: Identifier Assign expression ;
keywordArguments: (args+=keywordArgument (ArgSep args+=keywordArgument)* ArgSep?) ;

positionalArguments	: expression (ArgSep expression)* ArgSep? ;

parameters	: (parameter (ArgSep parameter)*)? ;
parameter	: Identifier TypeSep type (Assign defaultArgument=expression)? ;


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

functionType	: ParenOpen params=typeList? ParenClose Produces result=type ;
recordType	: Record BracketOpen (fieldType (ArgSep fieldType)*)? ArgSep? BracketClose ;
fieldType	: Identifier TypeSep type ;
parametricType	: base=simpleType BracketOpen params=typeList BracketClose ;
simpleType	: Identifier ;

typeList	: type (ArgSep type)* ArgSep? ;
