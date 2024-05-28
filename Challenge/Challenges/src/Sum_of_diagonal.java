import java.util.Scanner;

public class Sum_of_diagonal {
    public static void main(String[] args) {
        int row;
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        int col;
        col = input.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Sum of diagonal : ");
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.print(sum);

    }
}
