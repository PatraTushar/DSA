package QUEUE;

import java.util.*;

public class deque {

    public static void main(String[] args) {

        Deque<Integer> dq=new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());

//        dq.remove();   // remove first element
//        System.out.println(dq);

//        dq.removeAll(dq);  // remove everything
//        System.out.println(dq);

//        dq.removeFirstOccurrence(1);
//        System.out.println(dq);

        dq.removeLastOccurrence(1);
        System.out.println(dq);





    }


}
