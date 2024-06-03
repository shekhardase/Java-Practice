package in.Exception1;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = input.nextInt();
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();

        try {
            System.out.println("Division is " + a / b);
        } catch (ArithmeticException error) {
            System.out.println("Cannot use zero to divide");
        } finally {
            input.close(); // Closing the Scanner object
        }
    }
}
