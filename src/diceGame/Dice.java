package diceGame;

public class Dice {
    //attribut valeur du dé
    private int valeur;

    //constructeur
    public Dice () {
        this.valeur = 0;
    }

    //méthodes

    /** Getter pour avoir la valeur du dé
     *
     * @return la valeur du dé
     */
    public int getValeur() {
        return this.valeur;
    }

    /** Setter de la valeur du dé
     *
     */
    public void lancer() {
        this.valeur = (int) (Math.random() * 6) + 1;
    }
}
