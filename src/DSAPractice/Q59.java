package DSAPractice;

import java.util.Arrays;

public class Q59 {

    static int[] findMissingAndRepeatingNumber(int[] arr, int n) {

        long sumN = (long) n * (n + 1) / 2;
        long sqrN = n * (n + 1) * (2 * n + 1) / 6;
        long sum = 0;
        long sqr = 0;

        for (int ele : arr) {

            sum += ele;
            sqr += (long) ele * ele;
        }

        long val1 = sumN - sum;
        long val2 = sqrN - sqr;
        val2 /= val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};


    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = 6;
        int[] ans = findMissingAndRepeatingNumber(arr, n);
        System.out.println(Arrays.toString(ans));
    }
}
