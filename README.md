# TP Informatique fondamentale - ANTLR

## Auteur

Kevin Doolaeghe

## Compilation

Ajouter les lignes ci-dessous dans le fichier `~/.bashrc` pour créer la variable d'environnement `$CLASSPATH` et créer des alias pour les commandes `antlr4` et `grun` :

```
export CLASSPATH=".:~/projetIF/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "~/projetIF/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "~/projetIF/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

Il faut relancer le terminal pour que les changements du fichier `~/.bashrc` soient pris en compte.

Chaque exercice peut être compilé à l'aide de la commande `make` ce qui équivaut aux commandes :

```
antlr4 *.g4
javac *.java
```

Dans le fichier `Makefile`, il est nécessaire de modifier le tield `~` de la variable `$CLASSPATH` pour correspondre au chemin d'accès à la bibliothèque ANTLR (fichier `.jar`)

## Exécution

Pour exécuter un exercice, entrer la commande suivante :

```
grun <nom_exercice> initial -gui
```

Pour l'exercice `abbc` par exemple, il faut donc remplacer `<Exercice>` par `abbc`.

Tous les noeuds initiaux sont nommés `initial`.

Le programme ANTLR affichera dans ce cas un arbre via une interface graphique.

La commande suivante permet d'afficher le résultat à l'aide d'un arbre sur le terminal :

```
grun <nom_exercice> initial -tree
```

Au démarrage de `grun`, celui-ci attend une entrée pour la création de l'arbre.

Il faut donc entrer une chaine de caractères et valider avec `Ctrl+D`.

Pour donner une entrée issue d'un fichier, il faut utiliser la commande ci-dessous.

```
grun <nom_exercice> initial < <chemin_fichier>
```

## Nettoyage

Pour nettoyer un exercice, il faut utiliser la commande `make clean`