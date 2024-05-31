import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        // Start the recursive guessing process
        guessNumber(scanner, numberToGuess);
    }

    // Recursive method to handle the guessing process
    public static void guessNumber(Scanner scanner, int numberToGuess) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();

        if (userGuess > numberToGuess) {
            System.out.println("Too high! Try again.");
            guessNumber(scanner, numberToGuess); // Recursive call
        } else if (userGuess < numberToGuess) {
            System.out.println("Too low! Try again.");
            guessNumber(scanner, numberToGuess); // Recursive call
        } else {
            System.out.println("Congratulations! You've guessed the number!");
        }
    }
}
