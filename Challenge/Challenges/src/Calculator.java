import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        String sign = input.next();

        switch (sign) {
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "/": {
                System.out.println(a / b);
                break;
            }
            case "% ": {
                System.out.println(a % b);
                break;
            }
        }
    }
}
