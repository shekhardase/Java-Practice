import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {

        System.out.println("Enter value of a ");
        Scanner input= new Scanner(System.in);

        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();

        System.out.println(a + b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
