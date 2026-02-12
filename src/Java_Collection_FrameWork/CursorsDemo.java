package Java_Collection_FrameWork;

import java.util.*;

public class CursorsDemo {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        Enumeration<Integer> e=v.elements();
        Iterator<Integer> itr=v.iterator();
        ListIterator<Integer> ltr=v.listIterator();

        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
