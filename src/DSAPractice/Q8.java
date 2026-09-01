package DSAPractice;

import java.util.Arrays;

public class Q8 {


    static void swap(int[] arr, int p, int q) {


        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;


    }

    static void reverse(int[] arr, int i, int j) {


        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateKTimes(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateKTimes(arr, k);
    }
}
