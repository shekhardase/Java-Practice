package in.coding;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {


    public static void main(String[] args) {
        String filename = "Java course";

        try (FileReader reader = new FileReader(filename)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            }
            while (read != -1);
        } catch (IOException error) {

            System.out.println(" exception " + error.getMessage());
        }
    }
}