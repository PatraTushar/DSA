package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q16 {

    static long countSubArrays(int[] nums, int k) {

        // Time Complexity (TC): O(n) + O(n) = O(n)
        //Space Complexity (SC): O(1)

        int maxElement = Arrays.stream(nums).max().getAsInt();

        int n = nums.length;
        int countMax = 0;
        long result = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] == maxElement) countMax++;

            while (countMax >= k) {

                result += n - right;

                if (nums[left] == maxElement) countMax--;

                left++;


            }


        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->2962

        int[] num = {1, 3, 2, 3, 3};
        int k = 2;
        System.out.println(countSubArrays(num,k));
    }
}
