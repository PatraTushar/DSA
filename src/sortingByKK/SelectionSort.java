package sortingByKK;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void selectionSort(int[] arr) {

        // Time Complexity : O(n²)
        // Space Complexity : O(1)

        int n = arr.length;
        int maxEleIndex;

        for (int i = 0; i < n - 1; i++) {

            maxEleIndex = 0;

            for (int j = 1; j < n-i; j++) {

                if (arr[j] > arr[maxEleIndex]) {

                    maxEleIndex = j;
                }


            }


            int last=n-i-1;
            swap(arr,maxEleIndex,last);




        }

        System.out.println(Arrays.toString(arr));


    }




    public static void main(String[] args) {

        int arr[]={29,10,14,37,13};
        selectionSort(arr);
    }
}
