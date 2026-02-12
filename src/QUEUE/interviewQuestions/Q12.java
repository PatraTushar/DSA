package QUEUE.interviewQuestions;

import java.util.*;

public class Q12 {

    static int firstNegative(Queue<Integer> q, int k) {


        int val = 0;

        while (k > 0) {

            if (!q.isEmpty() && q.peek() < 0) {

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


    static List<Integer> firstNegativeInWindowKI(int[] arr, int k) {

        // Time Complexity: O(n)
        //Space Complexity: O(k) + O(n - k + 1) ≈ O(n)


        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k - 1; i++) {

            if (arr[i] < 0) q.add(i);


        }


        for (int i = k - 1; i < n; i++) {

            if (arr[i] < 0) q.add(i);


            while (!q.isEmpty() && q.peek() <= i - k) q.poll();


            if (q.isEmpty()) result.add(0);
            else result.add(arr[q.peek()]);


        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, -3, -4, -2, 7, 8, 9, -10};
        int[] arr1 = {2, -3, -4, -2, 7, 8, 9, -10};
        int k = 3;
        int k1 = 3;
        List<Integer> ans = firstNegativeInWindowK(arr, k);
        System.out.println(ans);
        List<Integer> ans1 = firstNegativeInWindowKI(arr1, k1);
        System.out.println(ans1);

    }
}
