grammar calculator;

file_
    :   setVar* EOF
    ;


expression
   :  <assoc=left> expression  POW expression                #pow
   |  expression  op=(TIMES | DIV)  expression               #muldiv
   |  expression  op=(PLUS | MINUS) expression               #plusmin
   |  VARIABLE                                               #var
   |  ID                                                     #idd
   |  LPAREN expression RPAREN                               #paren
   |  op=(PLUS | MINUS)* atom                                #atommul
   ;

setVar
    : expression NL                                         #printExpr
    | ID EQ expression                                  #assign
    | NL                                                    #null
    ;

atom
   : scientific
   | variable
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

variable
   : VARIABLE
   ;


VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
SCIENTIFIC_NUMBER
   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;


fragment E
   : 'E' | 'e'
   ;

fragment SIGN
   : ('+' | '-')
   ;


LPAREN
   : '('
   ;


NL : '\n'
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


POINT
   : '.'
   ;


POW
   : '^'
   ;


ID
   : [a-zA-Z]+
   ;



WS
   : [\n\r\t] + -> skip
   ;