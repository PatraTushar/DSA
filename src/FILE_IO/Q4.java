package FILE_IO;

import java.io.*;

public class Q4 {

    public static void main(String[] args) throws IOException {

        // write a program to merge data from 2 files into a third file

        PrintWriter pw = new PrintWriter("File3.txt");
        BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
        String line = br.readLine();

        while (line != null) {

            pw.println(line);
            line=br.readLine();

        }

        br=new BufferedReader(new FileReader("File2.txt"));
        line= br.readLine();

        while (line != null) {

            pw.println(line);
            line=br.readLine();

        }

        pw.flush();
        br.close();
        pw.close();

    }
}
