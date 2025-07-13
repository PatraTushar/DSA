package Java_Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("jaiswal");
        list.add("virat");
        list.add("karun");
        list.add("siraj");

        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            String val=it.next();
            System.out.println(val);
        }
    }
}
