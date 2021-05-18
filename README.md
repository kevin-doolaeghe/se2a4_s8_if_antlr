# SE2A4 | Semestre n°8 - TP Informatique fondamentale avec ANTLR

## Auteur

Kevin Doolaeghe

## Utilisation du dépôt

* Cloner le dépôt Git.

* Télécharger ANTLR à l'aide de la commande suivante :

```
wget https://www.antlr.org/download/antlr-4.9.2-complete.jar
```

* Ajouter les lignes ci-dessous dans le fichier `~/.bashrc` en remplaçant `<chemin_antlr>` par le chemin d'accès complet à ANTLR :

```
export CLASSPATH=".:<chemin_antlr>/antlr-4.9.2-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "<chemin_antlr>/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "<chemin_antlr>/projetIF/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

Il faut relancer le terminal pour que les changements du fichier `~/.bashrc` soient pris en compte.

Ces lignes permettent de créer la variable d'environnement `$CLASSPATH` et créer des alias pour les commandes `antlr4` et `grun` dans le cas d'une compilation manuelle.

* Vérifier le bon fonctionnement de ANTLR avec la commande suivante :

```
java org.antlr.v4.Tool
```

La commande affiche le résultat suivant si tout est fonctionnel :

```
ANTLR Parser Generator Version 4.9.2
-o ___ specify output directory where all output is generated
-lib ___ specify location of grammars, tokens files
...
```

## Compilation

Il est nécessaire de modifier la variable `ANTLR_PWD` de tous les fichiers `Makefile` pour correspondre au chemin complet de ANTLR (fichier `.jar`).

Pour compiler un exercice, il faut entrer la commande `make` qui équivaut aux commandes :

```
antlr4 *.g4
javac *.java
```

## Exécution

* Visualisation graphique

Pour exécuter un exercice, il faut entrer la commande suivante (se déplacer au préalable dans le répertoire de cet exercice) :

```
grun <nom_exercice> initial -gui
```

Pour l'exercice `abbc` par exemple, il faut donc remplacer `<nom_exercice>` par `abbc` (le nom de la grammaire créée).

Tous les noeuds initiaux sont nommés `initial`.

Le programme ANTLR affichera dans ce cas un arbre via une interface graphique.

* Visualisation sur le terminal

La commande suivante permet d'afficher le résultat à l'aide d'un arbre sur le terminal :

```
grun <nom_exercice> initial -tree
```

* Exécuter la grammaire

Au démarrage de `grun`, celui-ci attend une entrée pour la création de l'arbre.

Il faut donc entrer une chaine de caractères et valider avec `Ctrl+D`.

Pour donner une entrée issue d'un fichier, il faut utiliser la commande ci-dessous.

```
grun <nom_exercice> initial < <chemin_fichier>
```

## Nettoyage

Pour nettoyer un exercice, il faut utiliser la commande `make clean`.
