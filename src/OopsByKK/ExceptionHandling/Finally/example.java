package OopsByKK.ExceptionHandling.Finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class example {

    public static void main(String[] args) {

        FileInputStream fis = null;


        try {
            fis = new FileInputStream("data.txt");
            // Read file...
        } catch (FileNotFoundException e) {
            System.out.println("File not found or error reading file.");

        } finally {
            if (fis != null) {
                try {
                    fis.close();  // Ensures file is always closed
                } catch (IOException e) {
                    System.out.println("Error closing file.");
                }
            }

            System.out.println(" hello ");
        }


    }
}
