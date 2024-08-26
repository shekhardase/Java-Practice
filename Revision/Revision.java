package Revision;

import java.util.*;

public class Revision {

    /*
     * public static void main(String[] args) {
     * System.out.
     * println("This is java revision , My name is shekhar and this is just temp files nothing serious"
     * );
     * }
     */

    public static void main(String[] args) {
        // Primitive data types
        Scanner scanner = new Scanner(System.in);
        int number = 42;
        char letter = 'A';
        boolean isJavaEasy = true;
        double temperature = 36.6;

        String name = scanner.next();
        System.out.println(name + "THIS IS MY NAME");

        // Reference data type
        String greeting = "Hello, Java!";
        int arr[] = { 1, 2, 34, 4 };
        // Print values
        System.out.println(arr[0]);
        System.out.println("Number: " + number);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java Easy? " + isJavaEasy);
        System.out.println("Temperature: " + temperature);
        System.out.println("Greeting: " + greeting);
        scanner.close();
    }
}