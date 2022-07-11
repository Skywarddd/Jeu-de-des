import diceGame.Dice;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.lancer();
        System.out.println(dice1.get_valeur());
    }
}
