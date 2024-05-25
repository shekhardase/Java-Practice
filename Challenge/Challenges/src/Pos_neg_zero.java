import java.util.Scanner;

public class Pos_neg_zero {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n == 0) {
            System.out.println("The number is zero");
        } else if (n > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
