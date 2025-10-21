package QueueByStriver.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q8 {

    static void printElement(Queue<Integer> q) {

        // Time Complexity: O(n)
        //Space Complexity: O(1)


        int size = q.size();

        while (size > 0) {

            System.out.println(q.peek());
            q.add(q.poll());
            size--;
        }

        System.out.println(q);
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(3);
        q.add(5);
        printElement(q);

    }
}
