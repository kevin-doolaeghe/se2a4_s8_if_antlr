grammar ProgrammeC ;

// On ajoute une variable d'environnement, cette variable permet de stocker le contenu des variables
@members {Env env = new Env();}

// On commence par les règles parser :
prog : expression EOF { System.out.println("Result: "+$expression.inst.execute(env)); } ;   // On appelle la méthode execute de la classe Instruction pour exécuter la suite d'instruction contenues dans l'expression

expression returns [ Instruction inst ] :          // à chaque expression on associe un objet de la classe Instruction, la classe Instruction permet de représenter des suites d'affectations de variables avec des expressions arithmétiques
  e1=expression e2=expression                                       { $inst= new Sequence( $e1.inst, $e2.inst ); }
//| IF LPAR e1=expression RPAR e2=expression                          { $inst= new If( $e1.inst, new Constante(0), $e2.inst, new Constante(0), new Constante(0)); }
//| IF LPAR e1=expression RPAR e2=expression ELSE e3=expression       { $inst= new If( $e1.inst, new Constante(0), $e2.inst, $e3.inst, new Constante(0)); }
| IF LPAR e1=expression op=variable e2=expression RPAR e3=expression ELSE e4=expression  { $inst= new If( $e1.inst, $e2.inst, $e3.inst, $e4.inst, $op.cons ); }
| VAR AFFECT e=expression SEPARATOR                                 { $inst= new Affectation( $VAR.getText(), $e.inst ); }
| LPAR e=expression RPAR                                 { $inst= $e.inst; }
| LACC e=expression RACC                                 { $inst= $e.inst; }
| INT                                                    { $inst= new Constante($INT.int); }           
| VAR                                                    { $inst= new Variable($VAR.getText()); }
| e1=expression DIV e2=expression                        { $inst= new EDiv($e1.inst,$e2.inst); }
| e1=expression TIMES e2=expression                      { $inst= new ETimes($e1.inst,$e2.inst); }
| e1=expression MINUS e2=expression                      { $inst= new EMoins($e1.inst,$e2.inst); }
| e1=expression PLUS e2=expression                       { $inst= new EPlus($e1.inst,$e2.inst); }
;

variable returns [ Constante cons ] :
  EQUAL { $cons = new Constante(0); }
| DIFF  { $cons = new Constante(1); }
| GTHAN { $cons = new Constante(2); }
| LTHAN { $cons = new Constante(3); }
;

// Règles lexer :
IF        : 'if' ;
THEN      : 'then' ;
ELSE      : 'else' ;
AFFECT    : '=' ;
SEPARATOR : ';' ;
LPAR      : '(' ;
RPAR      : ')' ;
LACC      : '{' ;
RACC      : '}' ;

DIV       : '/' ;
TIMES     : [*] ;
MINUS     : '-' ;
PLUS      : '+' ;

EQUAL     : '==' ;
DIFF      : '!=' ;
GTHAN     : '>' ;
LTHAN     : '<' ;

INT       : [0-9]+ ;
VAR       : [a-zA-Z] [a-zA-Z0-9_]* ;

WS        : [ \t\n]+ -> skip ;       // on ignore les espaces, tabulations et retours à la ligne
