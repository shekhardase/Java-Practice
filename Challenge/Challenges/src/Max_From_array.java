import java.util.Scanner;

public class Max_From_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }
//        int ans = Math.Intmax;
        int ans = 0;

        for (int i : arr) {
            ans = Math.max(i, ans);
        }
        System.out.println(ans);

    }
}
