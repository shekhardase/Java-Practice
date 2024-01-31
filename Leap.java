import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = scanner.nextInt();

        if (A % 4 == 0) {
            System.err.println(1);
        } else {
            System.err.println(0);
        }

        scanner.close();
    }
}
