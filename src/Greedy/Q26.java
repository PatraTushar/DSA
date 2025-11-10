package Greedy;

import java.util.Arrays;

public class Q26 {

    static long largestPerimeter(int[] arr) {

        //  Time Complexity: O(n log n)
        //  Space Complexity: O(1)

        int n = arr.length;

        Arrays.sort(arr);

        long largestPerimeter = -1;

        long sum = arr[0] + arr[1];

        for (int i = 2; i < n; i++) {

            long largest = arr[i];

            sum += arr[i];

            if (largest < sum - largest) {

                largestPerimeter = Math.max(largest, sum);
            }


        }

        return largestPerimeter;


    }

    public static void main(String[] args) {

        // leeTCode->2971

        int[] arr = {1, 12, 1, 2, 5, 50, 3};
        System.out.println(largestPerimeter(arr));


    }
}
