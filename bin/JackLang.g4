grammar JackLang; 
prog		:	(varDeclare | func)+ 								# program
			;
// Do not support Array parameters
func		:	BASICTYPE IDENTIFIER '(' parameters? ')' block		# function
			;
parameters	:	declare (',' declare)* 								# paras
			;
varDeclare	:	declare ';' 										# varDecl
			;
declare		:	type IDENTIFIER 									# decl
			;
type		:	BASICTYPE '[' INT ']'								# arrayType
			|	BASICTYPE											# intType
			;
block		:	'{' statement* '}' ;
statement	:	block												# blk
			|	varDeclare											# varDeclStat
			|	'if' '(' expr ')' statement ('else' statement) ?	# if
			|	'while' '(' expr ')' statement						# while
			|	'do' statement 'while' '(' expr ')' ';'				# doWhile
			|	'return' expr ';'									# return
			|	expr '=' expr ';'									# assign
			|	expr ';'											# funcStat
			;
expr		:	'(' expr ')'										# parenExpr
			|	INT													# intLiteral
			|	IDENTIFIER '(' exprList? ')'						# functionCall
			|	IDENTIFIER '[' expr ']'								# arrayVisit
			|	IDENTIFIER											# identifier
			|	'-' expr											# unaryMinus
			|	'!' expr											# boolNOT
			|	expr op=(MUL|DIV) expr								# MULDIV
			|	expr op=(ADD|SUB) expr								# ADDSUB
			|	expr op=(LT|LE|GE|GT) expr							# compareSize
			|	expr op=(EQ|NE) expr								# compareEquality
			|	expr '&&' expr										# boolAND
			|	expr '||' expr										# boolOR
			;
exprList	:	expr (',' expr)* ;

BASICTYPE	:	'int' ;
ADD			:	'+' ;
SUB			:	'-' ;
MUL			:	'*' ;
DIV			:	'/' ;
EQ			:	'==' ;
NE			:	'!=' ;
LT			:	'<' ;
LE			:	'<=' ;
GE			:	'>=' ;
GT			:	'>' ;
IDENTIFIER	:	[a-zA-Z] ([a-zA-Z] | [0-9])* ;
INT			:	[0-9]+ ;
WS			:	[ \t\n\r]+ -> skip ;
COMMENT		:	'//' .*? '\n' -> skip ;
