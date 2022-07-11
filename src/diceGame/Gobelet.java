package diceGame;

public class Gobelet {
    //attributs
    private int valeur; // valeur de la somme des dés dans le gobelet
    private Dice[] des; //tableau de dés

    //constructeur
    public Gobelet(int nb_des) {
        this.valeur = 0;
        this.des = new Dice[nb_des];
    }

    //getter
    public int get_valeur() {
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
            sommeDes += de.get_valeur();
        }
        this.valeur = sommeDes;
    }

    public void afficher_score() {
        if (this.valeur == 0) {
            System.out.println("Vous n'avez pas fait de lancés");
        }
        else {
            System.out.println("Votre score est " + this.get_valeur());
        }
    }
}
