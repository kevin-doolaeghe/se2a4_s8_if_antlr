grammar ab_equal;

// Règles de substitution
initial : s EOF ;
s : A s B s | B s A s | ;

// Alphabet
A: 'a' ;
B: 'b' ;

