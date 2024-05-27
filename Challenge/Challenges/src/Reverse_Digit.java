import java.util.Scanner;

public class Reverse_Digit {


    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Reverse_Digit obj = new Reverse_Digit();
        System.out.println(obj.reverse(n));
    }
}
