import java.util.Scanner;

public class ODD_EVEN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();


        // storing variable = condition if true(Statement) if false(Statement)

        String ans = a % 2 == 0 ? " Number is even " : "Number is odd";
        System.out.println(ans);

    }
}
