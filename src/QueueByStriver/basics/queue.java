package QueueByStriver.basics;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());  // 5
        System.out.println(q);  // 1 2 3 4 5
        q.remove();
        System.out.println(q);  // 2 3 4 5
        q.poll();
        System.out.println(q);   // 3 4 5
        System.out.println(q.peek()); // 3

        Queue<Integer> e=new LinkedList<>();
        System.out.println();

    }
}
