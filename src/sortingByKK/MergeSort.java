package sortingByKK;

import java.util.Arrays;

public class MergeSort {

    static int merge(int[] arr, int start, int mid, int end) {

        int count = 0;
        int left = start;
        int right = mid + 1;
        int[] mergedArray = new int[end - start + 1];
        int k = 0;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) mergedArray[k++] = arr[left++];

            else {

                mergedArray[k++] = arr[right++];
                count += mid - left + 1;


            }
        }

        while (left <= mid) {

            mergedArray[k++] = arr[left++];
        }

        while (right <= end) {

            mergedArray[k++] = arr[right++];
        }


        for (int i = 0; i < mergedArray.length; i++) {

            arr[start + i] = mergedArray[i];


        }

        return count;


    }

    static void mergeSort(int[] arr, int start, int end) {

        // Time Complexity: O(n log n)
        //  Space Complexity: O(n)

        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);


    }


    public static void main(String[] args) {
        int[] arr = {11, 1, 10, 9, 6, 8, 4, 2, 5, 3, 7};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }
}
