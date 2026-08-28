package FILE_IO;

import java.io.File;

public class Q1 {

    public static void main(String[] args) throws Exception {

        // write a program to display the names of all files and directories present is C://

        int count = 0;

        File f = new File("C:\\");
        String[] s = f.list();

        for (String s1 : s) {
            count++;
            System.out.println(s1);
        }

        System.out.println("The total number"+count);
    }
}
