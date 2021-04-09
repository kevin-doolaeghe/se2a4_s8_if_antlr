grammar abc_equal;

// Règles de substitution
initial : s EOF ;
s : A s B s | B s A s | C s | s C | ;

// Alphabet
A: 'a' ;
B: 'b' ;
C: 'c' ;

