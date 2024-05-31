import java.util.Scanner;

public class Abs_val {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int ans = a < 0 ? -(a) : (a);

        System.out.println(ans);
    }

}

