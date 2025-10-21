package QueueByStriver.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {


    static void printElement(Queue<Integer> q) {

        // Time Complexity: O(n)
        //Space Complexity: O(1)

        while (!q.isEmpty()){

            System.out.println(q.poll());
        }



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
