package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q22 {

    static int[] resultsArray(int[] nums, int k) {

         // Time Complexity: O(n)
        //Auxiliary Space Complexity: O(1) (excluding the output array)
        //Total Space Complexity: O(n) (including the output array)


        int n = nums.length;

        int[] result = new int[n - k + 1];

        Arrays.fill(result,-1);

        if (k == 1) return nums;

        int left = 0;
        int streakLength = 1;

        for (int right = 1; right < n; right++) {

            if (nums[right] == nums[right - 1] + 1) streakLength++;
            else streakLength = 1;


            if (right - left + 1 == k) {

                if (streakLength >= k) result[left] = nums[right];

                left++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->3254

        int[] num = {1, 2, 3, 4, 3, 2, 5,6,7};
        int k = 3;
        int[] result = resultsArray(num, k);
        System.out.println(Arrays.toString(result));


    }
}
