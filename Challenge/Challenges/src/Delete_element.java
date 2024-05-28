import java.util.Scanner;

public class Delete_element {

    public static int[] remove_element(int[] arr, int num) {
        // Create a new array with one less element
        int[] newarr = new int[arr.length - 1];
        boolean found = false;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!found && arr[i] == num) {
                found = true; // Skip this element
                continue;
            }
            if (j < newarr.length) {
                newarr[j++] = arr[i];
            }
        }

        // If the element to remove is not found, return the original array
        if (!found) {
            return arr;
        }

        return newarr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to enter:");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element you want to remove:");
        int num = input.nextInt();

        int[] newarr = remove_element(arr, num);
        System.out.println("Elements after removing " + num + ":");
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }
}
