package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int ele : arr) {

            if (ele > max) {

                max = ele;
            }
        }

        return max;


    }

    static void bucketSort(int[] arr) {

        // Time Complexity :O(n + k)         k = number of buckets
        // Space Complexity : O(n)


        int n = arr.length;
        ArrayList<Integer>[] buckets = new ArrayList[n];
        int m = buckets.length;

        int max = findMax(arr);


        // create empty buckets

        for (int i = 0; i < n; i++) {

            buckets[i] = new ArrayList<>();


        }


        // Add elements into bucket

        for (int i = 0; i < n; i++) {

            int bucketIndex = (arr[i] * n) / (max + 1);
            buckets[bucketIndex].add(arr[i]);

        }


        // sort each bucket individually


        for (int i = 0; i < m; i++) {

            Collections.sort(buckets[i]);
        }


        // merge all buckets to get final sorted array

        int index = 0;

        for (int i = 0; i < m; i++) {

            ArrayList<Integer> current = buckets[i];

            for (int j = 0; j < current.size(); j++) {

                arr[index++] = current.get(j);
            }
        }


        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {

        int[] arr = {42, 32, 33, 52, 37, 47, 51};
        bucketSort(arr);


    }
}
