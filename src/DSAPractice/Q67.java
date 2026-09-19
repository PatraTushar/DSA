package DSAPractice;

import java.util.Arrays;

public class Q67 {


    static int merge(int[] arr, int low, int mid, int high) {


        int[] res = new int[high - low + 1];
        int count = 0;

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {

                res[k++] = arr[i++];
            } else {

                count += mid - i + 1;
                res[k++] = arr[j++];
            }

        }


        while (i <= mid) {

            res[k++] = arr[i++];
        }


        while (j <= high) {
            res[k++] = arr[j++];
        }


        for (int l = 0; l < res.length; l++) {

            arr[low++] = res[l];
        }

        return count;

    }

    static int mergeSort(int[] arr, int low, int high) {

        if (low == high) return 0;

        int count = 0;

        int mid = low + (high - low) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;


    }


    static int countInversion(int[] arr) {

        int n = arr.length;
        return mergeSort(arr, 0, n - 1);


    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversion(arr));


    }
}
