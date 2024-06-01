import java.util.Scanner;

public class palindrome_using_Recursion {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String s, int start, int end) {
        // Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }

        // Check if characters at start and end are the same
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive case: move towards the center
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for a case-insensitive comparison
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(processedInput, 0, processedInput.length() - 1);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
