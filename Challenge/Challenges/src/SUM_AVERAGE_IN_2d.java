import java.util.Scanner;

public class SUM_AVERAGE_IN_2d {
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

//        System.out.println("enter elemnt you want to search");

        int num = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num = num + arr[i][j];
            }
        }
        System.out.println(num);
        System.out.println((num / arr.length));
//            System.out.println();
    }
}

