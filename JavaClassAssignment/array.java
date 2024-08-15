// import java.util.Scanner;

// public class array {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//         System.out.println("Welcome to array traversing and searching");
//         System.out.println("Enter the element you want to search among 0 to 9 ");
//         int num = input.nextInt();

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == num) {
//                 System.out.println("Element found ");
//                 System.out.println(nums[i]);
//             }

//         }

//     }
// }

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Enter the size of array you want to input");
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            arr[i] = input.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        input.close();
    }
}