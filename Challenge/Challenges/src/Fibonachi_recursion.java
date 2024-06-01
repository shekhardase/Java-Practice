import java.util.Scanner;

public class Fibonachi_recursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(fibonacci(a));
    }
}
