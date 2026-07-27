package SlidingWindow.InterviewQuestions;

public class Q31 {

    static long countSubArrays(int[] num, long k) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = num.length;

        long sum = 0;
        long result = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            // Expand the window

            sum += num[right];


            // shrink the window
            while (left <= right && sum * (right - left + 1) >= k) {

                sum -= num[left];
                left++;
            }

            // count all valid subarray ending at right

            result += (right - left + 1);
        }

        return result;


    }


    public static void main(String[] args) {

        // leeTCode->2302

        int[] num = {2, 1, 4, 3, 5};
        int k = 10;
        System.out.println(countSubArrays(num, k));

    }
}
