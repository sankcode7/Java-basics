import java.util.Random;


public class rpsgame {
    public static void main(String [] args) {
        Random rd = new Random();
        int diceRoll = rd.nextInt(6) + 1;
        System.out.println("You rolled a: " + diceRoll);
    }
}
