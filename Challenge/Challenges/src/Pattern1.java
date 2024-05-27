import java.util.Scanner;

public class Pattern1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();


        int i = 1;

        while (i <= a) {
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
