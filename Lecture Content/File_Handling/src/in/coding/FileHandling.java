package in.coding;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {


    public static void main(String[] args) throws IOException {
        String FileName = "Java course";

        try (FileWriter writer = new FileWriter(FileName);) {

            writer.write("q3232 , this is write");
            writer.flush();


            for(int i = 0 ; i < 100000 ; i++)
            {
                writer.write("*");
            }


            System.out.println("written done");
            writer.write(3);
//            System.out.println(writer.write(12));
        } catch (IOException error) {
            System.out.println("error -->" + error.getMessage());
        }
    }
}
