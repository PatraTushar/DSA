package FILE_IO;

import java.io.*;

public class removeDuplicates {

    public static void main(String[] args) throws IOException {

        FileWriter f = new FileWriter("input1.txt");
        f.write("222");
        f.write("\n");
        f.write("333");
        f.write("\n");
        f.write("222");
        f.write("\n");
        f.write("333");
        f.write("\n");
        f.write("444");
        f.write("\n");
        f.write("222");
        f.write("\n");
        f.write("444");
        f.write("\n");
        f.write("333");
        f.write("\n");
        f.write("555");
        f.write("\n");
        f.write("222");
        f.write("\n");
        f.write("444");
        f.write("\n");
        f.write("555");
        f.write("\n");
        f.write("333");
        f.write("\n");
        f.write("222");
        f.write("\n");
        f.write("666");
        f.flush();
        f.close();


        // Write a program to remove duplicates from the given input file

        PrintWriter pw = new PrintWriter("output1.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
        String line = br1.readLine();

        while (line != null) {

            boolean available = false;
            BufferedReader br2 = new BufferedReader(new FileReader("output1.txt"));
            String target = br2.readLine();

            while (target != null) {

                if (line.equals(target)) {
                    available = true;
                    break;
                }

                target = br2.readLine();
            }

            if (!available) {

                pw.println(line);
                pw.flush();
            }

            line = br1.readLine();
        }


    }
}
