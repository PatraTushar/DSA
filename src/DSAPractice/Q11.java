package DSAPractice;

import java.util.Arrays;
import java.util.Map;

public class Q11 {

    static int[] sorted(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int p1 = n - 1;


        while (left <= right) {

            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare >= rightSquare) {
                res[p1--] = leftSquare;
                left++;
            }

            else {

                res[p1--]=rightSquare;
                right--;
            }


        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr = {-10, -3, -2, 1, 4, 5};
        int[] ans = sorted(arr);
        System.out.println(Arrays.toString(ans));

    }
}
