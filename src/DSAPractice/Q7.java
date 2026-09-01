package DSAPractice;

import java.util.Arrays;

public class Q7 {

    static void swap(int[] arr, int p, int q) {


        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;


    }


    static void reverse(int[] arr) {

        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {


        int[] arr = {45, 87, 93, 12, 100};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
