import java.util.Scanner;

public class PalindromeNumber {


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
        int a = input.nextInt();


        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.reverse(a));
        if (a == obj.reverse(a)) {
            System.out.println("Palindrome numbers");
        } else {
            System.out.println("Fk u ");
        }


    }

}

