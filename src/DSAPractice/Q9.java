package DSAPractice;

import java.util.Arrays;

public class Q9 {

    static void swap(int[] arr, int p, int q) {


        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;


    }


    static void sort0sAnd1s(int[] arr) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

           else if (arr[left]==0) left++;
            else right--;
        }


    }


    public static void main(String[] args) {


        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        sort0sAnd1s(arr);
        System.out.println(Arrays.toString(arr));
    }
}
