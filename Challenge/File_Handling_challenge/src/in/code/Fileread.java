package in.code;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) {
        String file2 = "New file";
        try (FileReader reader = new FileReader(file2)) {
            // Simulate an error

            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException er) {
            System.out.println("file not found");
        } catch (IOException error) {
            System.out.println("error occured" + error.getMessage());
        }
    }
}
