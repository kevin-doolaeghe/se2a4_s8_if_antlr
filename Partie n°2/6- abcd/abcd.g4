grammar abcd;

// Règles de substitution
initial : s EOF ;
s : A s D | t | ;
t : B t C | ;

// Alphabet
A: 'a' ;
B: 'b' ;
C: 'c' ;
D: 'd' ;
