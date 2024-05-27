import java.util.Scanner;

public class Prime_Number {

    //    int a = Scanner.input.
    public static void main(String[] args) {
        // take input in single line

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

