package BitManipulation.InterviewQuestions;

import java.util.Arrays;

public class Q22 {

    static int[] xorQueries(int[] arr, int[][] queries) {

        // Time Complexity : O(n + m)
        // Space Complexity : O(n + m)


        int n = arr.length;
        int m = queries.length;
        int[] cumulativeXOR = new int[n];
        int[] ans = new int[m];


        cumulativeXOR[0] = arr[0];
        for (int i = 1; i < n; i++) {

            cumulativeXOR[i] = cumulativeXOR[i - 1] ^arr[i];
        }


        for (int i = 0; i < m; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            if (l == 0) ans[i] = cumulativeXOR[r];

            else ans[i] = cumulativeXOR[l - 1] ^ cumulativeXOR[r];
        }

        return ans;
    }

    public static void main(String[] args) {

        // leeTCode->1310

        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] result = xorQueries(arr, queries);
        System.out.println(Arrays.toString(result));

    }
}
