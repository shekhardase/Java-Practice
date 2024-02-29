import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose Matrix:");
        int[][] transpose = transposeMatrix(matrix);
        printMatrix(transpose);

        System.out.println("Sum of each row:");
        int[] rowSums = calculateRowSums(matrix);
        System.out.println(Arrays.toString(rowSums));

        System.out.println("Sum of each column:");
        int[] columnSums = calculateColumnSums(matrix);
        System.out.println(Arrays.toString(columnSums));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static int[] calculateRowSums(int[][] matrix) {
        int rows = matrix.length;
        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int num : matrix[i]) {
                sum += num;
            }
            rowSums[i] = sum;
        }

        return rowSums;
    }

    public static int[] calculateColumnSums(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] columnSums = new int[columns];

        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }
}
