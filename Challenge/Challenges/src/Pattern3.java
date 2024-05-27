import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int i = height;  // Start with the maximum height

        while (i > 0) {
            int j = 1;  // Initialize the counter for each row

            while (j <= height) {
                if (j >= i) {
                    System.out.print("*");  // Print stars for the right half pyramid
                } else {
                    System.out.print(" ");  // Print spaces for alignment
                }
                j++;  // Move to the next position
            }

            System.out.println();  // Move to the next line
            i--;  // Move to the next row}
        }
    }
}
