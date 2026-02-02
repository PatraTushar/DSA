package ArraysbyStriver.Basics;

import java.util.Arrays;

public class A5 {


    static int[] smallestAndLargest(int[] arr) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min) min = arr[i];

            if (arr[i] >= max) max = arr[i];


        }

        return new int[]{min, max};


    }

    public static void main(String[] args) {

        // Q: return the smallest and largest element in the form of array

        int[] arr = {5, 8, 1, 3, 6, 2};
        int[] ans = smallestAndLargest(arr);
        System.out.println(Arrays.toString(ans));
    }
}
