import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int i = a;


        while (i != 0) {
            int j = i;

            while (j != 0) {
                System.out.print('*');
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
