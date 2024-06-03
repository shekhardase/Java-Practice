package in.code;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator");

        int first = input.nextInt();

        int second = input.nextInt();

        System.out.println("Calculation is :" + first / second);

        try {
            System.out.println(first / 0);         // will call exception arithmeticException
        } catch (ArithmeticException error) {
            System.out.println("this is cause -> " + error.getCause());
            System.out.println("this is toString -> " + error.toString());
            System.out.println("this is Message -> " + error.getMessage());

            System.out.println("divide by zero is not possible");
        } catch (Throwable th) {
            System.out.println("General exception");
//            throw th;
        }


    }

}
