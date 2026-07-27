package SlidingWindow.InterviewQuestions;

public class Q28 {

    static boolean isNice(int[] num, int start, int end) {

        for (int i = start; i <= end; i++) {

            for (int j = i + 1; j <= end; j++) {

                if ((num[i] & num[j]) != 0) return false;


            }
        }

        return true;

    }


    // BruteForce Approach
    static int longestNiceSubArray(int[] num) {

        // Time Complexity (TC): O(n^4)
        //Space Complexity (SC): O(1)
        int n = num.length;

        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if (isNice(num, i, j)) result = Math.max(result, j - i + 1);
            }
        }

        return result;

    }


    static int longestSubArrayI(int[] nums) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = nums.length;
        int result = 0;
        int mask = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            // windows become invalid

            while ((mask & nums[right]) != 0) {

                mask^=nums[left];
                left++;
            }

            // window becomes valid
            mask|=nums[right];
            result=Math.max(result,right-left+1);
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->2401

        int[] num={1,3,4,8,10};
        System.out.println(longestSubArrayI(num));

    }
}
