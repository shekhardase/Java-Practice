package in.Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Frequency_count_with_collections {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        Scanner input = new Scanner(System.in);


        System.out.println("enter the number ");
        int n = input.nextInt();
        int p = input.nextInt();

        for (int i = 0; i < p; i++) {
            numList.add(input.nextInt());
        }

// with loop traversing
        int count = 0;
        for (int i = 0; i < p; i++) {
            if (numList.get(i) == n) {
                count++;
            }
        }

        System.out.println(count);


        // with collections classes
        int count2 = Collections.frequency(numList, n);
        System.out.println(count2);


    }
}
