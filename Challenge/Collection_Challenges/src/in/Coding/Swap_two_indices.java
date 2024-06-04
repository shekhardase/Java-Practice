package in.Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swap_two_indices {

    public static void swap(ArrayList<Integer> nums, int index1, int index2) {
        Collections.swap(nums, index1, index2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(input.nextInt());
        }
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        swap(nums, index1, index2);
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}
