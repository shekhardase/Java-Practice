import java.util.Scanner;

public class Check_if_Sorted {

    public static boolean isSorted(int[] arr) {
        // An array with 0 or 1 element is considered sorted
        if (arr.length <= 1) {
            return true;
        }

        // Check each element to see if it is less than or equal to the next element
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an element that is greater than the next one
            }
        }
        return true; // No elements out of order
    }

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
//        System.out.println("is array sorted ? : ");
        System.out.println("Is sortedArray sorted? " + isSorted(arr));
        ;
    }


}
