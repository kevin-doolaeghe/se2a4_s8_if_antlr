grammar abbc;

// Règles de substitution
initial : s EOF ;
s : A s | B a ;
a : B a | C ;

// Alphabet
A: 'a' ;
B: 'b' ;
C: 'c' ;

