package FILE_IO;

import java.io.File;

public class Test {

    public static void main(String[] args) throws Exception {

        File file=new File("abc.txt");
        System.out.println(file.exists());

        file.createNewFile();
        System.out.println(file.exists());


    }
}
