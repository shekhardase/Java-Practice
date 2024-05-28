import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {

        System.out.println("Enter elements you want to enter");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Reversed array : ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
