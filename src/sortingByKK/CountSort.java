package sortingByKK;

import java.util.Arrays;


public class CountSort {


    static void countSort(int[] arr) {

        // Time Complexity : O(n) + O(n) + O(m +  n)
        // Space Complexity : O(m+1) = O(m)

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) max = arr[i];

            if (arr[i] < min) min = arr[i];


        }

        int range = max - min + 1;


        int[] freq = new int[range];

        int m = freq.length;

        for (int ele : arr) {

            freq[ele - min]++;
        }


        int k = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < freq[i]; j++) {

                arr[k++] = i + min;

            }


        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {

      //  int arr[] = {5, 3, 8, 6, 2};
        int arr[] = {-1,-5,1,8,6,4,3,3};
        countSort(arr);


    }
}
