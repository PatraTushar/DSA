package DSAPractice;

import java.util.Arrays;

public class Q10 {

    static void swap(int[] arr, int p, int q) {


        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;


    }

    static int[] order(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {

                swap(arr, left, right);
                left++;
                right--;


            }

            else if (arr[left]%2==0) left++;
            else right--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = order(arr);
        System.out.println(Arrays.toString(ans));
    }
}
