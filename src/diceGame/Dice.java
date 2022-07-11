package diceGame;

public class Dice {
    //attribut valeur du dé
    private int value;

    //constructeur
    public Dice () {
        this.value = 0;
    }

    //méthodes

    /** Getter pour avoir la valeur du dé
     *
     * @return la valeur du dé
     */
    public int get_valeur() {
        return this.value;
    }

    /** Setter de la valeur du dé
     *
     */
    public void lancer() {
        this.value = (int) Math.ceil(Math.random()*6);
    }
}
