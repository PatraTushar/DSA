package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q11 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int[] arr, int start, int end) {


        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void rotateKTimes(int[] arr, int k) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {
        // Q: rotate array by k steps  (leeTCode->189)

        //Time Complexity (TC): O(n/2)+O(k/2)+O((n−k)/2)  => O(n)+O(k)+O(n−k) => O(n)
        //Space Complexity (SC): O(1)

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateKTimes(arr, k);


    }
}
