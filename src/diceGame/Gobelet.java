package diceGame;

public class Gobelet {
    //attributs
    private int valeur; // valeur de la somme des dés dans le gobelet
    private Dice[] des; //tableau de dés

    //constructeur
    public Gobelet(int nbDes) {
        this.valeur = 0;
        this.des = new Dice[nbDes];
    }

    //getter
    public int getValeur() {
        return this.valeur;
    }

    //methodes

    /** Cette méthode change la valeur de chaque dé dans le tableau, fait la somme de chaque valeur et met à jour la valeur du gobelet avec cette somme
     *
     */
    public void lancer() {
        int sommeDes = 0;
        for (Dice de : des) {
            de = new Dice();
            de.lancer();
            sommeDes += de.getValeur();
        }
        this.valeur = sommeDes;
    }

    public void afficherScore() {
        if (this.valeur == 0) {
            System.out.println("Vous n'avez pas fait de lancés");
        }
        else {
            System.out.println("Score du lancé : " + this.getValeur());
        }
    }
}
