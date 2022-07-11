package diceGame;

public class Joueur {
    //attributs
    private String nom;
    private int score;

    //constructeur
    public Joueur (String nom) {
        this.nom = nom;
        this.score = 0;
    }

    //getters
    public String getNom() {
        return this.nom;
    }

    public int getScore() {
        return this.score;
    }

    //méthodes
    public void jouer(Gobelet gobelet) {
        gobelet.lancer();
        if (this.score < gobelet.getValeur()) {
            this.score = gobelet.getValeur();
        }
    }

    public void afficherScore () {
        if (this.score == 0) {
            System.out.println("Vous n'avez pas fait de lances");
        }
        else {
            System.out.println("votre meilleur score est " + this.getScore());
        }
    }
}
