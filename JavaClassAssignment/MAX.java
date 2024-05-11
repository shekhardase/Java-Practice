import java.util.Scanner;

public class MAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = scanner.nextInt();

        System.out.print("Enter number B: ");
        int B = scanner.nextInt();

        System.out.print("Enter number C: ");
        int C = scanner.nextInt();

        int max = A;

        if (B > max) {
            max = B;
        }

        if (C > max) {
            max = C;
        }

        System.out.println("The maximum element is: " + max);

        scanner.close();
    }
}
