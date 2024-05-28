import java.util.Scanner;

public class Number_Of_Occurances {
    public static void main(String[] args) {

        System.out.println("Enter elements you want to enter");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("find the elemnt you want to find ");

        int b = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                count++;
            }
        }
        System.out.println("the number: " + b + " Appeared " + count + " times ");
    }
}
