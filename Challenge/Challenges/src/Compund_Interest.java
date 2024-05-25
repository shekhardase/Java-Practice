import  java.util.Scanner;
public class Compund_Interest {

    public static void main(String[] args) {

        System.out.println("Enter value of p ");
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        System.out.println("Enter value of t ");
        int t = input.nextInt();
        System.out.println("Enter value of r ");
        int r = input.nextInt();

        int csi =p*(1+r/100)*t;
        System.out.println("Simple Interest is " + csi);

    }
}
