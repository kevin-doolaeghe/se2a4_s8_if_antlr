grammar ArithExprPrio ;

initial : expr EOF { System.out.println("\nResult: "+$expr.val); } ;

// Règles du parser :
expr returns [ int val ] :
  LPAR e=expr RPAR         { $val=$e.val; } 
| e1=exprP TIMES e2=exprP  { $val=$e1.val*$e2.val; }
| e1=exprP DIV e2=exprP    { $val=$e1.val/$e2.val; }
| e1=exprP MOD e2=exprP    { $val=$e1.val%$e2.val; }
| e3=expr PLUS e4=expr     { $val=$e3.val+$e4.val; }
| e3=expr MINUS e4=expr    { $val=$e3.val-$e4.val; }
| INT                      { $val=$INT.int; }
;

exprP returns [ int val ] :
  LPAR e=expr RPAR         { $val=$e.val; } 
| e1=exprP TIMES e2=exprP  { $val=$e1.val*$e2.val; }
| e1=exprP DIV e2=exprP    { $val=$e1.val/$e2.val; }
| e1=exprP MOD e2=exprP    { $val=$e1.val%$e2.val; }
| INT                      { $val=$INT.int; }
;

// Règles du lexer :
LPAR  : '(' ;
RPAR  : ')' ;
TIMES : '*' ;
MOD   : '%' ;
DIV   : '/' ;
PLUS  : '+' ;
MINUS : '-' ;
INT   : [0-9]+ ;
WS    : [ \t\n]+ -> skip ;

