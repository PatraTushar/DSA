package sortingByKK;

import java.util.Arrays;

public class InsertionSort {

    static void swap(int arr[],int start,int end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }

    static void insertionSort(int arr[]){

        // Time Complexity : O(n²)
        // Space Complexity : O(1)

        int n = arr.length;

        for (int i = 0; i < n ; i++) {

            int j=i;

            while (j>0 && arr[j]<arr[j-1]){

                swap(arr,j,j-1);
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {

        int arr[]={5,3,4,1,2};
        insertionSort(arr);
    }
}
