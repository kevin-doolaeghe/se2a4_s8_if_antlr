grammar AnBn;

// Parsing rules: structure tokens together
initial : s EOF ; // EOF: predefined end-of-file token
s : A s B | ;  //  nothing for empty alternative

// Lexing rules: recognize tokens
A: 'a' ;
B: 'b' ;

