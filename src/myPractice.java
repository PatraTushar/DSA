import java.util.*;

public class myPractice {


    public static void main(String[] args) {

        List<Integer> list = new Vector<>();
        list.add(100);
        list.add(2001);
        list.add(3001);
        list.add(4001);
        list.add(500);

        ListIterator<Integer> e = list.listIterator();

        while (e.hasNext()) {

            int ele=e.next();

            if (ele%2==0) e.set(404040404);

        }


        System.out.println(list);


    }


}





