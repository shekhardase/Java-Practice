package in.Coding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Number of unique characters: " + countUniqueChars(input));
    }

    public static int countUniqueChars(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}