package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q12 {

    static int maxFrequency(int[] nums, int k) {

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)


        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;

        long currWindowSum = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            long target = nums[right];
            currWindowSum += nums[right];
            long targetWindowSum = (right - left + 1) * target;

            long operation = targetWindowSum - currWindowSum;

            while (operation > k) {

                currWindowSum -= nums[left];
                left++;
                operation=(right-left+1)*target-currWindowSum;
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


// currentWindowSum → actual sum currently inside window
//targetWindowSum → sum if every element becomes nums[right]
//operationsNeeded → increments required to make all equal



// Algorithm:(pseudocode)
//
//Step 1: Sort the array in ascending order.
//Step 2: Initialize the following:
//        - left pointer = 0
//        - currentWindowSum = 0
//        - maximumFrequency = 0
//
//Step 3: Move the right pointer from the beginning to the end of the array.
//Step 4: Add the current element to currentWindowSum.
//Step 5: Consider the current element (largest element in the window) as the target value.
//Step 6: Calculate the size of the current window.
//Step 7: Calculate the total sum required if every element in the window becomes the target value.
//Step 8: Calculate the number of operations needed:
//        operationsNeeded = targetWindowSum − currentWindowSum
//Step 9: If operationsNeeded is greater than k:
//        - Remove the leftmost element from currentWindowSum.
//        - Move the left pointer one step to the right.
//        - Recalculate operationsNeeded.
//        - Repeat until operationsNeeded ≤ k.
//Step 10: Update maximumFrequency with the largest valid window size.
//Step 11: Repeat the above steps until the right pointer reaches the end of the array.
//Step 12: Return maximumFrequency.