import java.util.Scanner;

public class Fibonachi {


    public int fibo(int x) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < x; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args) {
        Fibonachi obj = new Fibonachi();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(obj.fibo(n));
    }
}
