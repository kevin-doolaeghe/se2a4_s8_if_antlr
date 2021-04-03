grammar CountLines;

// les variables de members sont accessibles dans les règles de la grammaire
@members {int nbLignes=0;}

initial  : (NEWLINE)* ;

NEWLINE : [\r\n] {
  nbLignes++;
  System.out.println("Ligne "+nbLignes);} ; // On affiche le nombre de lignes à chaque nouvelle ligne
ANYTHINGELSE : ~[\r\n] -> skip ;            // Tout autre caractère est ignoré
