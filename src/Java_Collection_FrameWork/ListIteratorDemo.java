package Java_Collection_FrameWork;

import java.util.*;

public class ListIteratorDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Rahul");
        list.add("Raj");
        list.add("Mohan");
        list.add("Aman");

        System.out.println(list);

        ListIterator<String> ltr = list.listIterator();

        while (ltr.hasNext()) {

            String str = ltr.next();

            if (str.equals("Rahul")) ltr.remove();
            else if (str.equals("Raj")) ltr.add("Gill");
            else if (str.equals("Mohan")) ltr.set("Sachin");

        }

        System.out.println(list);


    }
}
