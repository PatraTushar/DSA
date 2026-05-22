package SlidingWindow.InterviewQuestions;

public class Q9 {

    static int findMax(int[] num, int skipIndex) {

        int n = num.length;
        int currLength = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            if (i == skipIndex) continue;


            if (num[i] == 1) {

                currLength++;
                maxLength = Math.max(currLength, maxLength);
            } else currLength = 0;


        }

        return maxLength;
    }

    static int longestSubArray(int[] num) {

        // Time Complexity: O(n²)
        // Space Complexity: O(1)

        int n = num.length;
        int result = 0;
        int countZero = 0;

        for (int i = 0; i < n; i++) {

            if (num[i] == 0) {

                countZero++;
                result = Math.max(result, findMax(num, i));

            }
        }

        if (countZero == 0) return n - 1;

        return result;
    }

    static int longestSubArrayI(int[] nums) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = nums.length;
        int zeroCount = 0;
        int result = 0;

        int left = 0;

        for (int right = 0; right < n; right++) {

            if (nums[right] == 0) zeroCount++;

            while (zeroCount > 1) {

                if (nums[left] == 0) zeroCount--;
                left++;


            }

            result = Math.max(result, right - left);
        }

        return result;


    }

    public static void main(String[] args) {

        int[] num = {1, 1, 0, 1};
        System.out.println(longestSubArray(num));
        System.out.println(longestSubArrayI(num));


    }
}
