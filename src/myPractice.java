import OopsByKK.AccessModifier.Public.A;

import java.util.Arrays;

public class myPractice {

    static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void reverse(int[] arr, int i, int j) {


        while (i < j) {

            swap(arr, i, j);
            i++;
            j--;
        }


    }


    static boolean func(int[] arr) {


        int n = arr.length;
        int prefixSum = 0;
        int suffixSum = 0;

        for (int i = n - 1; i >= 0; i--) {

            suffixSum += arr[i];
        }


        for (int i = 0; i < n; i++) {

            prefixSum+=arr[i];

            if (prefixSum== (suffixSum-prefixSum)) return true;

        }

        return false;


    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 6, 3, 1};
        int[] arr1 = {1, 3, 2, 4, 5};
        System.out.println(func(arr));
        System.out.println(func(arr1));

    }

}











