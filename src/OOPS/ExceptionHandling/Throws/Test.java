package OOPS.ExceptionHandling.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {

    void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

public class Test {

    public static void main(String[] args) {

        ReadAndWrite obj = new ReadAndWrite();

        try {
            obj.readFile();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


        try {
            obj.saveFile();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }



        System.out.println(" hello ");

    }
}
