import java.util.Scanner;

public class checkarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // for (int i = 1; i < size -1 ; i++) {

        // if (array[i] > array[i + 1]) {
        // System.err.println(0);
        // break;
        // } else {
        // System.out.println(1);
        // }
        // }

        boolean isSorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        scanner.close();
    }
}
