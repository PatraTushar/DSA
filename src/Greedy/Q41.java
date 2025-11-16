package Greedy;

public class Q41 {

    static long minSum(int[] nums1, int[] nums2) {

        //  Time Complexity: O(m + n)
        //  Space Complexity: O(1)

        int m = nums1.length;
        int n = nums2.length;

        int zeroInNum1 = 0;
        int zeroInNum2 = 0;
        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < m; i++) {


            if (nums1[i] == 0) {

                zeroInNum1++;
                sum1 += 1;
            } else sum1 += nums1[i];
        }


        for (int i = 0; i < n; i++) {


            if (nums2[i] == 0) {
                zeroInNum2++;
                sum2 += 1;
            } else sum2 += nums2[i];
        }


        if ((sum1 < sum2 && zeroInNum1 == 0) || (sum2 < sum1 && zeroInNum2 == 0)) return -1;

        return Math.max(sum1, sum2);


    }

    public static void main(String[] args) {

        // leeTCode->2918

        int[] num1 = {3, 2, 0, 1, 0};
        int[] num2 = {6, 5, 0};
        System.out.println(minSum(num1, num2));

    }
}
