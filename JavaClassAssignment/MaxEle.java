import java.util.Scanner;
import java.util.Vector;

public class MaxEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the 2D matrix
        int[][] matrix = new int[rows][columns];

        // Take input for each element of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rest of your code...
        int var = 0;

        Vector<Integer> v = new Vector<Integer>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                var = Math.max(var, matrix[i][j]);

            }
            v.add(var);

        }

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        scanner.close();
    }
}
