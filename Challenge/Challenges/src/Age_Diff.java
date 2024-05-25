import java.util.Scanner;

public class Age_Diff {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age < 13) {
            System.out.println("The person is a Child.");
        } else if (age < 20) {
            System.out.println("The person is a Teen.");
        } else if (age < 60) {
            System.out.println("The person is an Adult.");
        } else {
            System.out.println("The person is a Senior.");
        }

    }
}
