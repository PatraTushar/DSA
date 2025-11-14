package Greedy;

import java.util.Arrays;

public class Q34 {

    static int minIncrementForUnique(int[] nums) {


        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)


        int n = nums.length;

        Arrays.sort(nums);
        int totalMoves = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {

                nums[i] += 1;
                totalMoves++;
            } else if (nums[i] < nums[i - 1]) {

                int movesToBecomePrevNumber = nums[i - 1] - nums[i];
                int forUnique = movesToBecomePrevNumber + 1;
                nums[i] += forUnique;
                totalMoves += forUnique;
            }


        }

        return totalMoves;


    }

    public static void main(String[] args) {

        // leeTCode->945

        int[] arr = {3, 2, 1, 2, 1, 7};
        System.out.println(minIncrementForUnique(arr));


    }
}
