package FILE_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");
        fw.write(100);
        fw.write("urga\nSofwareSolution");
        fw.write("\n");
        char[] ch = {'a', 'b', 'c'};
        fw.write(ch);
        fw.flush();
        fw.close();

    }
}
