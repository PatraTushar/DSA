package QueueByStriver.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q10 {

    static int timeRequiredToBuy(int[] tickets, int k) {

        // Time Complexity: O(n * k)
        //Space Complexity: O(n)

        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            q.add(i);
        }

        int time = 0;

        while (tickets[k] != 0) {


            tickets[q.peek()]--;
            time++;


            if (tickets[q.peek()] == 0) q.poll();
            else q.add(q.poll());


        }

        return time;


    }


    public static void main(String[] args) {


        int[] arr = {1, 5, 2, 3, 7};
        int k = 2;
        System.out.println(timeRequiredToBuy(arr, k));

    }
}
