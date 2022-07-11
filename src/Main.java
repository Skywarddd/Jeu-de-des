import diceGame.Dice;
import diceGame.Gobelet;
import diceGame.Partie;

public class Main {
    public static void main(String[] args) {
        Partie partie1 = new Partie(4, 3);
        partie1.initialiser();
        partie1.lancer();
    }
}

/*Dice dice1 = new Dice();
        dice1.lancer();
        System.out.println(dice1.getValeur());

        Gobelet gobelet1 = new Gobelet(5);
        for (int i = 0 ; i < 20 ; i++) {
            gobelet1.lancer();
            gobelet1.afficherScore();
        }*/