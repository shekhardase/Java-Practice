import java.util.Scanner;

public class AverageOfElements {

    public static void main(String[] args) {

        System.out.println("Enter elements you want to enter");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The elements are : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
//        System.out.println("Average of sum of elements of array");
        int num = 0;
        for (int j : arr) {
            num = j + num;
        }
        System.out.println("Sum of elements of array : " + num);
        System.out.println("Average of elements of array : " + num / arr.length);
    }
}
