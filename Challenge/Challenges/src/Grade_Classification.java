import java.util.Scanner;

public class Grade_Classification {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n > 100) {
            System.out.println("Invalid");
        }
        if (n > 90) {
            System.out.println("A grade");
        } else if (n > 75) {
            System.out.println("B grade");
        } else if (n > 60) {
            System.out.println("C grade");
        } else if (n > 30) {
            System.out.println("D grade");
        } else {
            System.out.println("Fail");
        }
    }
}
