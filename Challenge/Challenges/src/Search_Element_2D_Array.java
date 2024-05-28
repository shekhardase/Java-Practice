import java.util.Scanner;

public class Search_Element_2D_Array {

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

        System.out.println("enter elemnt you want to search");

        int num = input.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num == arr[i][j]) {
                    System.out.println("The position " + i + " " + j);
                }
            }
//            System.out.println();
        }


    }
}
