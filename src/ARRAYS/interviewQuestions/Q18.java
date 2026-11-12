package ARRAYS.interviewQuestions;

public class Q18 {

    static boolean subArrayWithEqualSum(int[] nums) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = nums.length;
        int totalSum = 0;

        for (int ele : nums) {

            totalSum += ele;
        }

        int prefixSum = 0;

        for (int i = 0; i < n - 1; i++) {

            prefixSum += nums[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) return true;

        }

        return false;

    }

    public static void main(String[] args) {

        // Q: check if we partition the array into 2 subArrays with equal sum

        int[] arr = {5, 3, 2, 6, 3, 1};
        System.out.println(subArrayWithEqualSum(arr));

    }
}
