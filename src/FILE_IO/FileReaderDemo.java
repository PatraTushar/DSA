package FILE_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();

        while (i != -1) {

            System.out.print((char) i);
            i = fr.read();
        }

        System.out.println();

        System.out.println("-----------------------------------------------------");


        File f = new File("abc.txt");
        char[] ch = new char[(int) f.length()];
        FileReader fre = new FileReader(f);
        fre.read(ch);

        for (char ch1 : ch) {

            System.out.print(ch1);
        }

    }
}
