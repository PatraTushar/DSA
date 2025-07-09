package Java_Collection_FrameWork;

import java.util.*;

public class QueueInterface {

    public static void main(String[] args) {

        // LinkedList

        Queue<String> q = new LinkedList<>();
        q.offer("A");  // add
        q.offer("B");

        System.out.println(q.poll()); // A — removed from front
        System.out.println(q);        // [B]

        // ArrayDeque

        Deque<String> dq = new ArrayDeque<>();
        dq.offer("A");
        dq.offer("B");

        System.out.println(dq.poll());   // A
        dq.offerFirst("X");              // Add to front
        dq.offerLast("Y");               // Add to rear

        System.out.println(dq);         // [X, B, Y]


        // PriorityQueue

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll()); // 10 — smallest first
        System.out.println(pq);        // Not necessarily sorted when printed


    }
}
