grammar a_pair;

// Règles de substitution
initial : s EOF ;
s : A A s | ;

// Alphabet
A: 'a' ;

