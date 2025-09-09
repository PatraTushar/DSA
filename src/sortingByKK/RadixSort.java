package sortingByKK;

import java.util.Arrays;

public class RadixSort {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {

                max = ele;
            }
        }

        return max;


    }


    static void countSort(int[] arr, int pos) {

        // Time Complexity : O(n) + O(m) + O(n) + o(n) => 3O(n)+O(m) => O(n) + O(m) => O(m + n)
        // Space Complexity : O(n + 10) = O(n)




        int[] freq = new int[10];
        int n = arr.length;
        int m = freq.length;

        for (int i = 0; i < n; i++) {

            int digit = (arr[i] / pos) % 10;
            freq[digit]++;
        }


        for (int i = 1; i < m; i++) {

            freq[i] = freq[i] + freq[i - 1];
        }


        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            int digit = (arr[i] / pos) % 10;
            result[freq[digit] - 1] = arr[i];
            freq[digit]--;


        }


        for (int i = 0; i < n; i++) {

            arr[i] = result[i];
        }


    }


    static void radixSort(int[] arr) {

        // Time Complexity :O( d * (m + n))  => O(d * (10 + n)) => O(d * n)
        // Space Complexity : O(n)


        int maxVal = findMax(arr);


        for (int pos = 1; maxVal / pos > 0; pos *= 10) {


            countSort(arr, pos);

        }


        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {

        int[] arr = {170, 45, 75, 90, 802, 2};
        radixSort(arr);
    }
}
