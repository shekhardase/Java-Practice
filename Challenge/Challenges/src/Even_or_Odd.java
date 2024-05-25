import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        if(n%2==0)
        {
            System.out.println("The give number is even");
        }
        else{
            System.out.println("The give number is odd");
        }

    }
}
