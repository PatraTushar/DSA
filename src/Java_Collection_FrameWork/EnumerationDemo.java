package Java_Collection_FrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {


        Vector<Integer> v = new Vector<>();
        for (int i = 0; i <= 10; i++) {

            v.add(i);
        }

        System.out.println(v);


        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {

            Integer I =  e.nextElement();

            if (I % 2 == 0) {
                System.out.println(I);
            } else {

                System.out.println(I + " will be removed ");
                v.remove(I);
                System.out.println(v);
            }
        }

        System.out.println(v);

    }
}
