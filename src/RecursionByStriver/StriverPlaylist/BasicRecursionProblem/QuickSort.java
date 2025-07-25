package RecursionByStriver.StriverPlaylist.BasicRecursionProblem;

import java.util.Arrays;

public class QuickSort {

    static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;


        while (i < j) {

            while (arr[i] <= pivot && i <= high) {
                i++;
            }

            while (arr[j] > pivot && j >= low) {

                j--;

            }


            if (i < j) {
                swap(arr, i, j);
            }

        }

        swap(arr, low, j);


        return j;


    }


    static void quickSort(int[] arr, int low, int high) {


        //  Time Complexity (TC): O(n log n)
        // Space Complexity (SC): O(1)

        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);


        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }
}
