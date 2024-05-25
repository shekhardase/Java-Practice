import java.util.Scanner;

public class SimpleInterest
{

    public static void main(String[] args) {
        System.out.println("Enter value of p ");

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        System.out.println("Enter value of n");
        int n = input.nextInt();
        System.out.println("Enter value of r");
        int r = input.nextInt();

        int si = (p*n*r)/100;
        System.out.println("Simple Interest is " + si);
        System.out.println();


    }
}
