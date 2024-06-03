package in.code;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileChallenge {
    public static void main(String[] args) throws IOException {
        String file = "New file";

        try (FileWriter writer = new FileWriter(file)) {
            Scanner input = new Scanner(System.in);
//            writer.write("123313");
            writer.write(input.next());
        } catch (IOException error) {
            System.out.println("error occured" + error.getMessage());
        }
    }

}
