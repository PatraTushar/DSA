package SlidingWindow.InterviewQuestions;

import java.util.HashSet;

public class Q24 {

    static long maximumSubArraySum(int[] num, int k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(k)


        int n = num.length;

        long result = 0;
        long sum = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {

            // Remove elements until nums[right] becomes unique

            while (set.contains(num[right])) {

                sum -= num[left];
                set.remove(num[left]);
                left++;
            }


            // Include current element

            sum += num[right];
            set.add(num[right]);


            while (right - left + 1 > k) {
                sum -= num[left];
                set.remove(num[left]);
                left++;

            }

            if (right - left + 1 == k) {
                result=Math.max(sum,result);

            }


        }

        return result;

    }


    public static void main(String[] args) {

        // leeTCode->2461

        int[] num = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubArraySum(num, k));
    }
}
