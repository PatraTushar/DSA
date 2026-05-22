package SlidingWindow.InterviewQuestions;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Q11 {

    static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int left = 0;
        int ptr = 0;
        int[] result = new int[n - k + 1];


        for (int right = 0; right < n; right++) {

            while (!dq.isEmpty() && nums[right] > dq.peekLast()) {

                dq.pollLast();
            }

            dq.offerLast(nums[right]);


             if (right - left + 1 == k) {

                result[ptr++]=dq.peekFirst();

                if (nums[left]==dq.peekFirst()){
                    dq.pollFirst();
                }
                left++;


            }
        }

        return result;
    }

    public static void main(String[] args) {

        // leeTCode->239

        int[] num = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxSlidingWindow(num, k);
        System.out.println(Arrays.toString(ans));
    }
}
