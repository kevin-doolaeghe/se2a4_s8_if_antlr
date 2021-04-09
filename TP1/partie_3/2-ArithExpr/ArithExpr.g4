grammar ArithExpr ;

initial : expr EOF { System.out.println("Result: "+$expr.val); } ;

expr returns [ int val ] :                           // expr a un attribut de type integer
  LPAR e=expr RPAR      { $val=$e.val; }             // on transmet l'attribut à travers les parenthèses
| INT                   { $val=$INT.int; }           // on utilise l'attribut implicite de INT, et on utilise .int pour obtenir une valeur de type int
| e1=expr PLUS  e2=expr { $val=$e1.val+$e2.val; }
| e1=expr MINUS e2=expr { $val=$e1.val-$e2.val; }
| e1=expr TIMES e2=expr { $val=$e1.val*$e2.val; }
| e1=expr DIV   e2=expr { $val=$e1.val/$e2.val; }
;

LPAR  : '(' ;
RPAR  : ')' ;
PLUS  : '+' ;
MINUS : '-' ;
TIMES : 'x' ;
DIV   : '/' ;
INT   : [0-9]+ ;
WS    : [ \t\n]+ -> skip ; // ignoring spaces, tabulation and new lines

