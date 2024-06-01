import java.util.Random;
import java.util.Scanner;

public class Number_Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int n = rand.nextInt(100);
        int guess = input.nextInt();

        do {
            guess = input.nextInt();
            System.out.println("your number is away from " + (n - guess));
        }
        while (n != guess);
        System.out.println("if u see this fuck off your guess is correct");
    }
}
