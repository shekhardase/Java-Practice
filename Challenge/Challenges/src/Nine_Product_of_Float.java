import java.util.Scanner;

public class Nine_Product_of_Float {
    public static void main(String[] args) {

        System.out.println("Enter value of a ");
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        System.out.println("Enter value of b");
        float b = input.nextFloat();

        System.out.println(a * b);
    }
}
