package SlidingWindow.InterviewQuestions;

public class Q39 {

    static long[] countKConstraintSubstrings(String s, int k, int[][] queries) {

        // Time Complexity (TC): O(n+Q)
        //Space Complexity (SC): O(n)

        int n = s.length();

        int[] leftMost = new int[n];
        int[] rightMost = new int[n];

        int count0 = 0;
        int count1 = 0;

        int left = 0;

        // finding leftMost

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '0') count0++;
            else count1++;

            while (count0 > k && count1 > k) {


                if (s.charAt(left) == '0') count0--;
                else count1--;

                left++;

            }

            leftMost[right] = left;


        }


        // finding rightMost

        count0 = 0;
        count1 = 0;

        int right = n - 1;

        for (left = n - 1; left >= 0; left--) {

            if (s.charAt(left) == '0') count0++;
            else count1++;

            while (count0 > k && count1 > k) {


                if (s.charAt(right) == '0') count0--;
                else count1--;

                right--;

            }

            rightMost[left] = right;

        }


        // valid Substrings

        int[] valid = new int[n];

        for (int i = 0; i < n; i++) {

            valid[i] = i - leftMost[i] + 1;
        }


        // prefixSum


        long[] prefix = new long[n];

        prefix[0]=valid[0];

        for (int i = 1; i < n; i++) {

            prefix[i] = prefix[i - 1] + valid[i];
        }


        // Answer queries

        long[] result = new long[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int low = queries[i][0];
            int high = queries[i][1];

            int validRight = Math.min(high, rightMost[low]);

            long length = validRight - low + 1;

            result[i] = length * (length + 1) / 2;

            if (validRight < high) {
                result[i] += prefix[high] - prefix[validRight];
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->3261

        String s = "0001111";
        int k = 2;
        int[][] queries = {{0, 6}};

        long[] res = countKConstraintSubstrings(s, k, queries);
    }
}
