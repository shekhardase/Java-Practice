import java.util.Scanner;

public class Password_checker_do_while {
    public static void main(String[] args) {
//        int n = input.Scanner().(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter password");
        int n = input.nextInt();

        System.out.println("Enter your guess");
        int p;
        do {

            p = input.nextInt();
//            System.out.println("your password is ");
            if (p > n) {
                System.out.println("Your guess is greater than pass");
            } else if (p < n) {
                System.out.println("Your guess is smaller than pass");
            }

        }
        while (p != n);

        System.out.println("Fuck off");


    }
}
