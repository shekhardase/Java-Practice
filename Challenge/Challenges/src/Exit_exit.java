import java.util.Scanner;

public class Exit_exit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter inputs. Type 'exit' to stop.");

        while (true) {
            System.out.print("Enter input: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the input is "exit"
            }

            // You can process the input here
            System.out.println("You entered: " + input);
        }

        System.out.println("Program terminated.");
    }
}
