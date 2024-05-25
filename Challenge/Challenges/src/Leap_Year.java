import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }

    }
}
