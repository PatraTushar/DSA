package QueueByStriver.interviewQuestions;

import java.util.*;

public class Q5 {

    static int findMaxInKWindow(int[] arr, int k, int i) {

        int max = Integer.MIN_VALUE;

        for (int j = i; j < k + i; j++) {

            if (arr[j] > max) {
                max = arr[j];
            }


        }

        return max;
    }

    static int[] slidingWindow(int[] arr, int k) {

        // Bruteforce Approach

        //Time Complexity: O(n*k)
        //Time Complexity: O(n-k+1)


        int n = arr.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            result[i] = findMaxInKWindow(arr, k, i);
        }

        return result;


    }


    public static int[] maxSlidingWindow(int[] nums, int k) {

        // Time Complexity: O(n)
        //Space Complexity: O(n - k + 1) + O(k)    // Deque stores indices of current window elements, keeping them in decreasing order; max size is window size k

        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window (front of deque)
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices whose values are less than nums[i] (back of deque)
            while (!deque.isEmpty() &&   nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current element index to deque
            deque.offerLast(i);

            // If window has hit size k, record max (at front of deque)
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = slidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));

        int[] ans1=maxSlidingWindow(arr,k);
        System.out.println(Arrays.toString(ans1));


    }
}
