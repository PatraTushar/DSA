package QUEUE.interviewQuestions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q14 {

    static int findMaxInWindow(Queue<Integer> q, int k) {

        int max = Integer.MIN_VALUE;

        while (!q.isEmpty() && k > 0) {

            int val = q.peek();

            if (val > max) max = val;

            q.add(q.poll());

            k--;


        }

        return max;


    }

    static int[] slidingWindowMaximum(int[] nums, int k) {

        // Time Complexity: O(n * k)
        //Space Complexity:  O(n-k+1)

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Queue<Integer> q = new LinkedList<>();
        int j = 0;

        for (int i = 0; i < k - 1; i++) {

            q.add(nums[i]);


        }


        for (int i = k - 1; i < n; i++) {

            q.add(nums[i]);
            int max = findMaxInWindow(q, k);
            q.poll();

            result[j++] = max;

        }

        return result;


    }


    static int[] slidingWindowMaximumI(int[] arr, int k) {

        // Time Complexity: O(n)
        //Space Complexity:  O(n-k+1) + O(k)=O(n)

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int j = 0;

        for (int i = 0; i < n; i++) {

            //  Remove elements that are out of the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the rear
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            //  Add current element’s index
            dq.addLast(i);

            //  Once we have at least k elements, record the max
            if (!dq.isEmpty() && i >= k - 1) {
                result[j++] = arr[dq.peekFirst()];
            }
        }

        return result;


    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 7, 5, 2, 3, 1, 2, 8, 7};
        int[] arr1 = {4, 3, 7, 5, 2, 3, 1, 2, 8, 7};
        int k = 4;
        int k1 = 4;
        int[] ans = slidingWindowMaximum(arr, k);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = slidingWindowMaximumI(arr1, k1);
        System.out.println(Arrays.toString(ans1));


    }
}
