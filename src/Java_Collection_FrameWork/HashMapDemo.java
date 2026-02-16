package Java_Collection_FrameWork;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> m = new HashMap<>();

        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);

        System.out.println(m);  //  {balaiah=800, chiranjeevi=700, venkatesh=200, nagarjuna=500}

        Set s = m.keySet();
        System.out.println(s);  // [balaiah, chiranjeevi, venkatesh, nagarjuna]

        Collection c = m.values();
        System.out.println(c); // [800, 700, 200, 500]

        Set s1 = m.entrySet();
        System.out.println(s1); // [balaiah=800, chiranjeevi=700, venkatesh=200, nagarjuna=500]

        Iterator itr = s1.iterator();

        while (itr.hasNext()) {

            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey() +" : "+m1.getValue());
            if (m1.getKey().equals("nagarjuna")){

                m1.setValue(10000);
            }
        }

        System.out.println(m);


    }
}
