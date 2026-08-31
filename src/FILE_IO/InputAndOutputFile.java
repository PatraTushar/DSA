package FILE_IO;

import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutputFile {

    public static void main(String[] args) throws IOException {

        // input file
        FileWriter file1 = new FileWriter("input.txt");
        file1.write("222");
        file1.write("\n");
        file1.write("333");
        file1.write("\n");
        file1.write("444");
        file1.write("\n");
        file1.write("555");
        file1.write("\n");
        file1.write("666");
        file1.write("\n");
        file1.write("777");
        file1.write("\n");
        file1.write("888");
        file1.write("\n");
        file1.write("999");
        file1.flush();
        file1.close();


        // delete file
        FileWriter file2 = new FileWriter("delete.txt");
        file2.write("555");
        file2.write("\n");
        file2.write("888");
        file2.write("\n");
        file2.write("222");
        file2.flush();
        file2.close();

    }
}
