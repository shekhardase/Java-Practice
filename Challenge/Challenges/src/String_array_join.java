import java.util.Scanner;

public class String_array_join {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.next();
        }

        String str = new String();

        for (int i = 0; i < n; i++) {
            str = str + arr[i];
        }
        System.out.println(str);
    }
}
