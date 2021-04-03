grammar miroir;

// Règles de substitution
initial : s EOF ;
s : A s A | B s B | A | B | ;

// Alphabet
A: 'a' ;
B: 'b' ;

