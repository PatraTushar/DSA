package Java_Collection_FrameWorkk;

import java.util.*;

public class QueueInterface {

    public static void main(String[] args) {

        // LinkedList

        Queue<String> q = new LinkedList<>();
        q.offer("A");  // add
        q.offer("B");

        System.out.println(q.poll()); // A — removed from front
        System.out.println(q);        // [B]
    }
}
