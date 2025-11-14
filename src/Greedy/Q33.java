package Greedy;

public class Q33 {

    static long maximumValueSum(int[] arr, int k, int[][] edges) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = arr.length;
        long result = 0;
        int xorApplied = 0;
        int loss = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int XOR = arr[i] ^ k;


            if (XOR > arr[i]) {

                result += XOR;
                xorApplied++;
            } else {

                result += arr[i];

            }

            loss = Math.min(loss, Math.abs(arr[i] - XOR));


        }


        if (xorApplied % 2 == 0) return result;

        return result - loss;


    }


    public static void main(String[] args) {

        // leeTCode->3068

        int[] arr = {1, 2, 1};
        int k = 3;
        int[][] edges = {{0, 1}, {0, 2}};
        System.out.println(maximumValueSum(arr, k, edges));

    }
}
