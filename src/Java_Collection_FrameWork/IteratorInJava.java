package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInJava {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it=list.iterator();
        while (it.hasNext()){

            String language=it.next();
            System.out.println(language);
        }


    }
}
