package ArraysbyStriver.strivers;

import java.util.Arrays;

public class Q23 {

    static void swap(int[] arr1, int[] arr2, int i, int j) {

        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }



    static void mergeArrays(int[] a,int[] b){

        //  Time Complexity: O(min(m,n)) + O(m log m ) + O(n log n)
        //  Space Complexity: O(1)

        // sort 2 arrays individually

        // ip -> arr1=[2,4,7,10]  arr2=[2,3]            op->  arr1=[2 2 3 4]   arr2=[7,10]

        int m = a.length;
        int n = b.length;

        int i = m - 1;
        int j = 0;


        while (i >= 0 && j < n) {

            if (a[i] > b[j]) {

                swap(a, b, i, j);
                i--;
                j++;
            } else break;


        }


        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));




    }


    static void swapI(int[] arr1, int[] arr2, int left, int right) {

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


        while (gap >0) {

            int left = 0;
            int right = gap;


            while (right < length) {

                // one pointer is in arr1 and one pointer is in arr2

                if (left < m && right < m) {

                    swapI(a, a, left, right);


                } else if (left < m && right >= m) {

                    swap(a, b, left, right - m);


                } else {

                    swapI(b, b, left - m, right - m);


                }

                left++;
                right++;


            }

            if (gap==1 ) break;
            gap = gap / 2 + gap % 2;

        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }




    public static void main(String[] args) {

        int[] arr1 = {2, 4, 7, 10};
        int[] arr2 = {2, 3};
        merge(arr1,arr2);


    }
}
