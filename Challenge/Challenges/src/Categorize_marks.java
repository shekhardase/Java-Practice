import java.util.Scanner;

public class Categorize_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String ans = (a > 80) ? "High" : (a >= 50) ? "Moderate" : "Low";
        System.out.println(ans);
    }
}
