package ARRAYS.strivers;

import java.util.Arrays;

public class Q25 {

    static int[] findMissingAndRepeatingNumber(int[] arr, int n) {         // better solution

        // Time Complexity: O(n)
        //  Space Complexity: O(n)

        int[] freq = new int[n + 1];
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {

            freq[arr[i]]++;
        }


        for (int i = 1; i <= n; i++) {
            if (freq[i] > 1) {      // repeating
                result[0] = i;

            } else if (freq[i] == 0) {  // missing
                result[1] = i;
            }

        }

        return result;

    }

    static int[] findMissingAndRepeating(int[] arr, long n) {  // optimal solution

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        long NthSum = (n * (n + 1)) / 2;         // sum of n natural number
        long sqrOfNthSum = (n * (n + 1) * (2 * n + 1)) / 6;  // sum of square of natural number
        long sumOfArr = 0;
        long sqrSumOfArr = 0;

        for (int ele : arr) {

            sumOfArr += ele;
            sqrSumOfArr += (long) ele * (long) ele;
        }


        long val1 = sumOfArr - NthSum; // x-y   //-4
        long val2 = sqrSumOfArr - sqrOfNthSum;         //-24
        val2 = val2 / val1;  //x+y     // -24/-4=6

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};


    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;
        int[] ans = findMissingAndRepeatingNumber(arr, n);
        System.out.println(Arrays.toString(ans));

        int[] result = findMissingAndRepeating(arr, n);
        System.out.println(Arrays.toString(result));

    }
}
