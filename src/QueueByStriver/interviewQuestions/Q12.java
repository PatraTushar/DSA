package QueueByStriver.interviewQuestions;

import java.util.*;

public class Q12 {

    static int firstNegative(Queue<Integer> q, int k) {




        int val = 0;

        while (k > 0) {

            if ( !q.isEmpty() && q.peek() < 0) {

                val = q.peek();
                break;

            } else {

                q.add(q.poll());
                k--;
            }
        }


        if (k > 0) {

            while (k > 0) {

                q.add(q.poll());
                k--;
            }
        }

        return val;


    }

    static List<Integer> firstNegativeInWindowK(int[] arr, int k) {

        // Time Complexity: O(n * k)
        //Space Complexity: O(n-k+1)

        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k - 1; i++) {

            q.add(arr[i]);


        }

        for (int j = k - 1; j < n; j++) {

            q.add(arr[j]);

            int negative = firstNegative(q, k);

            q.remove();

            result.add(negative);


        }

        return result;


    }

    public static void main(String[] args) {

        int[] arr = {2, -3, -4, -2, 7, 8, 9, -10};
        int k = 3;
        List<Integer> ans=firstNegativeInWindowK(arr,k);
        System.out.println(ans);

    }
}
