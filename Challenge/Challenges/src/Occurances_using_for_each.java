import java.util.Scanner;

public class Occurances_using_for_each {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }

        int b = input.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
