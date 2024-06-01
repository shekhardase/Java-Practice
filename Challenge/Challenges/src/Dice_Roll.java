import java.util.Random;

public class Dice_Roll {
    public static void main(String[] args) {

//        int n = Math.random();

        Random Rand = new Random();
        int n = Rand.nextInt(7);
        if (n == 0) {
            n = n + 1;
        }


        System.out.println("Roll a die: " + n);
    }
}
