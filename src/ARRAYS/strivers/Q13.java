package ARRAYS.strivers;

import java.util.Arrays;

public class Q13 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int[] rearrangeElementsBySign(int[] arr) {

        //// condition -> Equal number of positives and negatives bt the relative order are  same

        // Time Complexity: O(n)
        //  Space Complexity: O(n)


        int[] result = new int[arr.length];
        int positiveIndex = 0;
        int negativeIndex = 1;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                result[positiveIndex] = arr[i];
                positiveIndex += 2;

            } else {

                result[negativeIndex] = arr[i];
                negativeIndex += 2;


            }
        }

        return result;


    }

    static int[] rearrangeElementsBySignI(int[] arr) {

        // condition -> Equal number of positives and negatives bt the relative order are not same

        // Time Complexity: O(n)
        //  Space Complexity: O(1)


        int positive = 0;
        int negative = 1;
        int n = arr.length;

        while (positive < n - 1 && negative < n) {

            if (arr[positive] > 0) positive += 2;

            else if (arr[negative] < 0) negative += 2;

            else {

                swap(arr, positive, negative);
                positive += 2;
                negative += 2;


            }
        }
        return arr;


    }


    public static void main(String[] args) {

        // Rearrange array elements by sign and there is equal number of positives and negatives

        int[] arr = {3, 1, 2, -12, -5, -4};
        int[] Ans = rearrangeElementsBySign(arr);
        System.out.println(Arrays.toString(Ans));
        int[] Ans1 = rearrangeElementsBySignI(arr);
        System.out.println(Arrays.toString(Ans1));
    }
}
