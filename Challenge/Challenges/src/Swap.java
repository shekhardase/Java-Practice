import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        System.out.println("Welcome to swap");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}
