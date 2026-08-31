package FILE_IO;

import java.io.FileWriter;
import java.io.IOException;

public class File1AndFile2 {

    public static void main(String[] args) throws IOException {

        // File1
        FileWriter file1 = new FileWriter("File1.txt");
        file1.write("AAA");
        file1.write("\n");
        file1.write("BBB");
        file1.write("\n");
        file1.write("CCC");
        file1.flush();
        file1.close();


        // File 2
        FileWriter file2 = new FileWriter("File2.txt");
        file2.write("222");
        file2.write("\n");
        file2.write("333");
        file2.write("\n");
        file2.write("444");
        file2.write("\n");
        file2.write("555");
        file2.flush();
        file2.close();


    }
}
