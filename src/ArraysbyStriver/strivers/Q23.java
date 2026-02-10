package ArraysbyStriver.strivers;

import java.util.Arrays;

public class Q23 {


    static void swap(int[] arr1, int[] arr2, int left, int right) {

        if (arr1[left] > arr2[right]) {

            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }


    }

    static void merge(int[] a, int[] b) {

        // gap method

        //  Time Complexity: O(log(m+n) * (m+n) )
        //  Space Complexity: O(1)


        int m = a.length;
        int n = b.length;


        int length = m + n;
        int gap = length / 2 + length % 2;


        while (gap > 0) {

            int left = 0;
            int right = gap;


            while (right < length) {



                if (left < m && right < m) {

                    swap(a, a, left, right);


                } else if (left < m && right >= m) {

                    swap(a, b, left, right - m);


                } else {

                    swap(b, b, left - m, right - m);


                }

                left++;
                right++;


            }

            if (gap == 1) break;
            gap = gap / 2 + gap % 2;

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }


    public static void main(String[] args) {


        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        merge(arr1, arr2);


    }
}
