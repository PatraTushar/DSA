package Greedy;

public class Q15 {


    static long minimumReplacement(int[] num) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = num.length;
        long minOperation = 0;


        for (int i = n - 2; i >= 0; i--) {

            if (num[i] > num[i + 1]) {

                int parts = num[i] / num[i + 1];

                if (num[i] % num[i + 1] != 0) parts++;


                minOperation += parts - 1;


                num[i] /= parts;

            }


        }

        return minOperation;


    }

    public static void main(String[] args) {

        // leeTCode->2366

        int[] arr = {12, 9, 7, 6, 17, 19, 21};
        System.out.println(minimumReplacement(arr));

    }
}
