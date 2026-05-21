package SlidingWindow.InterviewQuestions;

import java.util.Arrays;

public class Q8 {

    static int[] getAverages(int[] num, int k) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = num.length;

        if (k == 0) return num;

        int[] result = new int[n];


        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        long windowSize = 2L * k + 1;

        if (n < windowSize) return result;


        long windowSum = 0;

        int left = 0;
        int right = 0;

        while (right < n) {

            windowSum += num[right];

            if (right - left + 1 == windowSize) {

                int centeredIndex = left + k;

                result[centeredIndex] = (int) (windowSum / windowSize);

                windowSum -= num[left];
                left++;
            }

            right++;

        }

        return result;
    }

    public static void main(String[] args) {

        // leeTCode->2090

        int[] num={7,4,3,9,1,8,5,2,6};
        int k=3;
        int[] ans=getAverages(num,k);
        System.out.println(Arrays.toString(ans));
    }
}
