package Java_Collection_FrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationInJava {

    public static void main(String[] args) {


        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println(v);


        Enumeration<Integer> e=v.elements();
        while (e.hasMoreElements()){
            int ans=e.nextElement();
            System.out.println(ans);
        }

    }
}
