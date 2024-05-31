//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class min_of_two_numbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("greater among two is ...");

        int ans = a > b ? a : b;
        System.out.println(ans);
        int ans2 = 0;
        System.out.println("Smaller among two is ...");
        ans2 = a < b ? a : b;
        System.out.println(ans2);


    }


}
