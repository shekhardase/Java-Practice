import java.util.Scanner;

public class BitWise_Operations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Or operation of these numbers " + (a | b));
        System.out.println("AND operation of these numbers " + (a & b));
        System.out.println(" XOR operation of these numbers " + (a ^ b));
        System.out.println("compliment of a " + ~a);
        System.out.println("Compliemnt of b " + ~b);

        System.out.println("Left Shift of A " + (a << 2));
        System.out.println("Left shift of B " + (b << 2));
        System.out.println("Right shift of A " + (a >> 2));
        System.out.println("Right shift of B " + (b >> 2));

        //compleiment operation

        if (a & 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}
