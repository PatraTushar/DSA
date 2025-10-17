package StackByStriver.interviewQuestions;

import java.util.Arrays;

public class Q17 {

    static int[] slidingWindow(int[] arr, int k) {

        // brute Force Approach

        // Time Complexity (TC): O(n * k)
        //Space Complexity (SC): O(n - k + 1)

        int n = arr.length;
        int[] sWindow = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {

            int maxInWindow = arr[i];

            for (int j = i; j < i + k; j++) {

                maxInWindow = Math.max(maxInWindow, arr[j]);

            }

            sWindow[i] = maxInWindow;
        }

        return sWindow;
    }


    static void slidingWindowI(int[] num, int k) {


    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 2, 1, 6};
        int k = 3;
        int[] ans = slidingWindow(arr, k);
        System.out.println(Arrays.toString(ans));

    }
}
