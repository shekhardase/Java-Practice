import java.util.Scanner;

public class Max_min_in_array {
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


        System.out.println("max element in array is ");

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = Math.max(arr[i], maxi);
            }
        }

        System.out.print(maxi);
        System.out.println();

        System.out.println("The smallest Element is ..");
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = Math.min(arr[i], mini);

            }
        }
        System.out.println(mini);
    }
}
