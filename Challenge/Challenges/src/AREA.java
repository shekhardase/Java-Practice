import java.util.Scanner;

public class AREA {


    public static void main(String[] args) {

        System.out.println("Enter value of a ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();
        System.out.println("Enter value of c");
        int c = input.nextInt();

        int area = (a * b) / 2;
        System.out.println("Area of triangle is " + area);
//        int perimeter = a + b + c;
//        System.out.println("Perimeter of triangle is " + perimeter);
    }
}