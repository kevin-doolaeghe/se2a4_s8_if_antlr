grammar ExpReg ;

prog : s EOF ;
s : A s | B s | ;

A  : [a-zA-Z0-9] ;
B  : [*] ;
WS : [ \t\n]+ -> skip ;       // on ignore les espaces, tabulations et retours à la ligne
