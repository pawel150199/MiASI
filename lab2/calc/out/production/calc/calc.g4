grammar calc;

file_ : stat*  EOF;

stat:  IF '(' cond=expression ')' '(' then=stat ')' ('else' else=stat+?)?  #if_statement
    | WHILE '(' cond=expression ')' '(' then=stat ')'  #while
    | expression                      # printExpr
    |   ID relop expression NEWLINE                # assign
    |   NEWLINE                                 # blank
    ;


expression
   :  expression  op=POW expression             # pow
   |  expression  op=(TIMES | DIV)  expression  # mul_div
   |  expression  op=(PLUS | MINUS) expression  # plus_min
   |  expression relop expression               # comparison
   |  INT                                       # int
   |  ID                                        # id
   |  LPAREN expression RPAREN                  # paren
   |  atom                                      # const
//   |  (PLUS | MINUS)* atom                      #plmn_atom
   ;

atom
//   : scientific
//   | variable
     : constant
//   | INT
//   | ID
     ;

constant
    : PI
    ;
//scientific
//   : SCIENTIFIC_NUMBER
//   ;
//
//variable
//   : VARIABLE
//   ;


//VARIABLE
//   : VALID_ID_START VALID_ID_CHAR*
//   ;

PI
   : 'pi'
   ;


fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
//SCIENTIFIC_NUMBER
//   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
//   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;

IF :    'if'
   ;


fragment E
   : 'E' | 'e'
   ;


fragment SIGN
   : ('+' | '-')
   ;

relop: EQ
    | GT
    | LT
    ;

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;

WHILE : 'while'
    ;

MINUS
   : '-'
   ;


TIMES
   : '*'
   ;

ID
    :   [a-zA-Z]+
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

NEWLINE:
    '\r'? '\n'
    ;     // return newlines to parser (is end-statement signal)

INT
    :
    [0-9]+
    ;

WS
   : [ \r\\t] + -> skip
   ;