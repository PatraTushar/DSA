import OopsByKK.Generics.GenricClass.Pair;

import java.util.Arrays;

public class myPractice {


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void countSort(int[] arr) {

        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int range=max-min+1;

        int[] freq=new int[range];

        for (int i=0;i<n;i++){

            freq[arr[i]]++;
        }

        for (int i=0;i<freq.length;i++){

            for (int j=0;j<freq[i];j++){




            }
        }


    }


    public static void main(String[] args) {


        int arr[] = {5, 3, 8, 6, 2};
        countSort(arr);

    }

}











