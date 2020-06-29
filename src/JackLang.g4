grammar JackLang; 
program		:	(varDeclare | function)+ 							;
// Do not support Array parameters
function	:	BASICTYPE IDENTIFIER '(' parameters? ')' block		;
parameters	:	parameter (',' parameter)* 							;
parameter	:	BASICTYPE IDENTIFIER								;
varDeclare	:	declare ';' 										;
declare		:	type IDENTIFIER 									;
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
			|	expr op=(MUL|DIV|MOD) expr							# MULDIV
			|	expr op=(ADD|SUB) expr								# ADDSUB
			|	expr op=(LT|LE|GE|GT) expr							# compareSize
			|	expr op=(EQ|NE) expr								# compareEquality
			|	expr '&&' expr										# boolAND
			|	expr '||' expr										# boolOR
			;
exprList	:	expr (',' expr)* 									;

BASICTYPE	:	'int' ;
ADD			:	'+' ;
SUB			:	'-' ;
MUL			:	'*' ;
DIV			:	'/' ;
MOD			:	'%' ;
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
