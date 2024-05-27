import java.util.Scanner;

public class Sum_Of_Digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int ans = 0;

        while (a != 0) {
            ans = ans + a % 10;
            a = a / 10;
        }
        System.out.println(ans);
    }
}
