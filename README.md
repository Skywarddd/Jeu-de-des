# Jeu-de-des
Créer un jeu de dés classique dans lequel des joueurs joueront à tour de rôle en lançant un gobelet, qui contiendra des dés. Au bout d'un certain nombre de tour, on désigne le gagnant.

## Contenu des classes dans diceGame 

### Dice
La classe Dice est celle qui représente un dé du gobelet. Celle-ci a:
- Un attribut :
  - **valeur**: un nombre représentant la valeur d'un lancer de dé
- Un constructeur:
  - **Sans arguments, Dice()**
  - Qui initialise la valeur du dé à **0**
- Ainsi que 2 méthodes : 
  - **getValeur()** : renvoie la valeur du dé
  - **lancer()** : change la valeur du dé -> cette valeur doit être un nombre généré aléatoirement entre 1 et 6

### Gobelet
La classe Gobelet représente le gobelet utilisé dans la partie. Celui-ci a: 
- Deux attributs :
  - **valeur**: nombre représentant la valeur d'un lancer du gobelet
  - **des**: tableau de dés (Dice[]) qui contient un certain nombre de dés
- Un constructeur 
  - Avec un argument 
    - **Gobelet(nb_des)** : initialise la valeur du gobelet à 0, génère le nombre de dés nécessaires à lapartie et les ajoute au tableau **des**
- Ainsi que 3 méthodes :
  - **getValeur()** : renvoie la valeur du gobelet
  - **lancer()** : change la valeur des dés du gobelet ; met à jour la valeur du gobelet
  - **afficherScore()** : affiche en console le score du dernier lancé de gobelet

### Joueur ###
La classe Joueur représente une personne participant à la partie. Celui-ci à:
- Deux attributs : 
  - **nom** : chaîne de caractères représentant le nom du joueur
  - **score** : nombre représentant le score du joueur (à un instant t)
- Un constructeur:
  - Avec un argument
    - **Joueur(nom)** : initialise la valeur du nom du joueur à partir du paramètre nom, initialise le score du joueur à 0
- Ainsi que 4 méthodes :
  - **getNom()** : renvoie le nom du joueur
  - **getScore()** : renvoie le score du joueur
  - **jouer(gobelet)** : prend en paramètre le gobelet de la partie, lance le gobelet, met à jour le score du joueur en fonction du résultat du lancé
  - **afficherScore()** : affiche en console le score du joueur

### Partie ###
La classe Partie représente une partie de dés. Celui-ci à:
- Trois attributs :
  - **joueurs** : tableau de joueurs
  - **nbTours** : entier représentant le nombre de tours à jouer
  - **gobelet** : gobelet de dés
- Un constructeur:
  - Avec deux arguments 
    - **Partie(nbTours, nbDes)** : crée l'objet Partie en récupérant le nombre de tours et nombre de dés
- Ainsi que 3 méthodes :
  - **initialiser()** : permet d'inscrire des joueurs dans la partie
  - **lancer()** : lance la partie : chaque joueur joue à tour de rôle pendant les n tours. Une fois la partie terminée, affiche le gagnant.
  - **afficherGagnant()** : compare les scores des joueurs et affiche le gagnant.

On peut changer le nombre de tours et de dés dans le gobelet dans la classe Main.