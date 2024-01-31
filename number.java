import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = scanner.nextInt();

        if (A > 0 && A % 2 != 0) {
            System.err.println("Odd Positive");
        }

        else if (A < 0 && A % 2 != 0) {
            System.err.println("Odd negative");
        }

        else if (A > 0 && A % 2 == 0) {
            System.err.println("Even Positive");
        }

        else if (A < 0 && A % 2 == 0) {
            System.err.println("Even negative");
        }

        scanner.close();
    }
}
