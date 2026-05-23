package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q12 {

    static int maxFrequency(int[] nums, int k) {

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)


        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;

        long currSum = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            long target = nums[right];
            currSum += nums[right];
            long windowSum = (right - left + 1) * target;

            long operation = windowSum - currSum;

            while (operation > k) {

                currSum -= nums[left];
                left++;
                operation=(right-left+1)*target-currSum;
            }

            result=Math.max(result,right-left+1);
        }

        return result;

    }

    public static void main(String[] args) {

        int[] num = {1, 2, 4};
        int k = 5;
        System.out.println(maxFrequency(num, k));


    }
}
