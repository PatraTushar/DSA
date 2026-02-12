package QUEUE.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q7 {

    static void printElement(Queue<Integer> q) {


        // Time Complexity: O(n)
        //Space Complexity: O(n)

        int[] arr = new int[q.size()];
        int i = 0;

        while (!q.isEmpty()) {

            System.out.println(q.peek());
            arr[i++] = q.poll();
        }




        int n = arr.length;

        for (int j = 0; j < n; j++) {

            q.add(arr[j]);
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
