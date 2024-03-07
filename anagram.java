import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Rest of your code...

        // Sort the strings
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted strings
        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        // Print the result
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
            System.out.println("Result: 1");
        } else {
            System.out.println("The strings are not anagrams.");
            System.out.println("Result: 0");
        }

        scanner.close();
    }
} // Add this closing brace to complete the class body
