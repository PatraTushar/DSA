package Greedy;

import java.util.Arrays;

public class Q22 {

    static int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)

        Arrays.sort(arr);

        int n = arr.length;

        arr[0] = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] - arr[i - 1] > 1) {

                arr[i] = arr[i - 1] + 1;

            }
        }


        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) max = ele;
        }

        return max;


    }

    public static void main(String[] args) {

        // leeTCode->1846

        int[] arr = {2, 2, 1, 2, 1};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));

    }
}
