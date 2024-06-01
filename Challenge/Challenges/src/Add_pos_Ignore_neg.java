import java.util.Scanner;

public class Add_pos_Ignore_neg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to sum (enter 0 to end):");

        do {
            number = scanner.nextInt();

            if (number < 0) {
                continue;  // Skip negative numbers
            }

            sum += number;  // Add positive numbers to sum
        } while (number != 0);

        System.out.println("The sum of all positive numbers is: " + sum);
    }
}
