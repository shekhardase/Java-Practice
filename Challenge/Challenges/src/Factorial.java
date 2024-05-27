import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int ans = 1;
        if (a == 1) {
            System.out.println(1);
        }

        if (a == 0) {
            System.out.println(1);
        }
        while (a != 1) {
            ans = ans * a;
            a--;
        }

        System.out.println(ans);

    }
}


