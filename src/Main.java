import diceGame.Dice;
import diceGame.Gobelet;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.lancer();
        System.out.println(dice1.get_valeur());

        Gobelet gobelet1 = new Gobelet(5);
        for (int i = 0 ; i < 20 ; i++) {
            gobelet1.lancer();
            gobelet1.afficher_score();
        }
    }
}
