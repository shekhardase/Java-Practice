import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        System.out.println(lcm);

    }
}
