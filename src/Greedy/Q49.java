package Greedy;

import java.util.Arrays;

public class Q49 {

    static int maxDistinctElements(int[] nums, int k) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)




        Arrays.sort(nums);


        int distinctCount = 0;
        int currVal = nums[0] - k;


        for (int ele : nums) {

            int lowerBound = ele - k;
            int upperBound = ele + k;


            if (currVal < lowerBound) currVal = lowerBound;

            if (currVal > upperBound) continue;

            currVal++;
            distinctCount++;


        }

        return distinctCount;


    }

    public static void main(String[] args) {

        // LeeTCode->3397

        int[] arr = {1, 2, 2, 3, 3, 4};
        int k = 2;
        System.out.println(maxDistinctElements(arr, k));
    }
}
