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

    static int timeRequiredToBuyI(int[] tickets, int k) {

        // Time Complexity: O(n)
        //Space Complexity: O(1)


        int n = tickets.length;
        int time = 0;

        for (int i = 0; i < n; i++) {

            if (i <= k) {

                time += Math.min(tickets[i], tickets[k]);
            } else time += Math.min(tickets[k]-1,tickets[i]);

        }

        return time;

    }


    public static void main(String[] args) {


        // leeTCode->2073

        int[] arr1 = {1, 5, 2, 3, 7};
        int[] arr2 = {1, 5, 2, 3, 7};
        int k = 2;
        System.out.println(timeRequiredToBuy(arr1, k));
        System.out.println(timeRequiredToBuyI(arr2, k));

    }
}
