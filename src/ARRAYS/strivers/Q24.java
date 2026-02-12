package ARRAYS.strivers;

import java.util.Arrays;

public class Q24 {

    static void mergeI(int[] arr1, int m, int[] arr2, int n) {   // brute force approach

        //  Time Complexity: O(m + n)
        //  Space Complexity: O(m + n)

        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {

                result[k] = arr1[i];
                i++;

            } else {
                result[k] = arr2[j];
                j++;

            }

            k++;
        }


        while (i < m) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        for (int index = 0; index < m + n; index++) {
            arr1[index] = result[index];
        }

        System.out.println(Arrays.toString(arr1));


    }

    static void mergeII(int[] arr1, int m, int[] arr2, int n) {

        // Optimal solution of leeTCode 88

        //Time Complexity: O(m + n)
        //Space Complexity: O(1)

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {

                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        System.out.println(Arrays.toString(arr1));
    }


    public static void main(String[] args) {

        // merge sorted array (leeTCode->88)
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;
        // mergeI(arr1,m,arr2,n);
        mergeII(arr1, m, arr2, n);


    }
}
