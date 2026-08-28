package FILE_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch = {'a', 'b', 'c', 'd'};
        bw.write(ch);
        bw.newLine();
        bw.write("durga");
        bw.newLine();
        bw.write("software solution");
        bw.flush();
        bw.close();

    }
}
