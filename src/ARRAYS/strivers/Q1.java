package ARRAYS.strivers;

import java.util.Arrays;

public class Q1 {

    // maintain relative order also
    static int[] moveZeroes(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) arr[index++] = arr[i];
        }

        while (index < n) {

            arr[index++] = 0;
        }

        return arr;


    }


    public static void main(String[] args) {

        // move all zeroes to the end of the array (leeTCode-->283)

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] Ans = moveZeroes(arr);
        System.out.println(Arrays.toString(Ans));
    }
}
