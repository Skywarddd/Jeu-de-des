package diceGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Partie {
    //attributs
    private Joueur[] joueurs;
    private int nbTours;
    private Gobelet gobelet;

    //constructeur
    public Partie (int nbTours, int nbDes) {
        this.nbTours = nbTours;
        this.gobelet = new Gobelet(nbDes);
    }

    //méthodes

    /** Inscrit les joueurs dans une partie, demande le nombre de joueurs,
     * créé un tableau de joueurs ayant ce nombre,
     * demande le nom de chaque joueur,
     * et initialise chaque joueur dans le tableau de joueurs
     *
     */
    public void initialiser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de joueurs ?");
        this.joueurs = new Joueur[scanner.nextInt()];
        for (int i = 0; i < this.joueurs.length; ++i) {
            System.out.println("Joueur " + (i + 1) + ", entrez un nom");
            this.joueurs[i] = new Joueur(scanner.next());
        }
    }

    /**Méthode pour lancer une partie
     * A chaque tour, fait jouer le joueur de chaque case du tableau joueurs
     * Si le score qu'un joueur fait est supérieur au meilleur score qui a été réalisé (bestScore) depuis le début de la partie, celui-ci est mis à jour
     *Affiche les résultats avec la méthode afficherGagnant
     */
    public void lancer() {
        int bestScore = 0;
        for (int i = 0; i < this.nbTours; ++i) {
            System.out.println("---Tour " + (i+1) + " ---");
            for (Joueur joueur : this.joueurs) {
                joueur.jouer(this.gobelet);
                System.out.println("Le joueur " + joueur.getNom() + " lance les des !");
                this.gobelet.afficherScore();
                if (joueur.getScore() > bestScore) {
                    bestScore = joueur.getScore();
                }
            }
        }
        System.out.println("---Resultats---");
        afficherGagnant(bestScore);
    }

    /** Affiche le ou les gagnants ayany obtenu le meilleur score
     * Compare chaque case du tableau au score et ajoute le nom du joueur dans une liste si les scores sont égaux
     * @param score Meilleur score de la méthode lancer()
     */
    public void afficherGagnant (int score) {
        ArrayList<String> winningPlayers = new ArrayList<>();
        for (Joueur joueur : this.joueurs) {
            System.out.print(joueur.getNom() + ", ");
            joueur.afficherScore();
            if (joueur.getScore() == score) {
                winningPlayers.add(joueur.getNom());
            }
        }
        System.out.println("---Partie terminee !---" + '\n' + "La victoire revient a " + winningPlayers.toString().replace("[", "").replace("]", ""));
    }
}
