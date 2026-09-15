package DSAPractice;

import java.util.Arrays;

public class Q57 {

    static void swap(int[] arr1, int[] arr2, int i, int j) {

        if (arr1[i] > arr2[j]) {

            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }

    }

    static void merge(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;
        int length = m + n;
        int gap = length / 2 + length % 2;

        while (gap > 0) {

            int left = 0;
            int right = gap;

            while (right < length) {

                if (left < m && right < m) {

                    swap(arr1, arr1, left, right);
                } else if (left < m && right >= m) {

                    swap(arr1, arr2, left, right - m);
                } else swap(arr2, arr2, left - m, right - m);

                left++;
                right++;

            }


            if (gap == 1) break;

            gap = gap / 2 + gap % 2;
        }


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

    public static void main(String[] args) {


        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2);

    }
}
