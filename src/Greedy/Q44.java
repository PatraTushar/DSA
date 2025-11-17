package Greedy;

public class Q44 {

    static int longestSubsequence(String s, int k) {

        //  Time Complexity: O(n)
        //  Space Complexity: O(1)


        int n = s.length();
        int length = 0;

        for (int i = n - 1; i >= 0; i--) {

            int number = s.charAt(i) - '0';
            int val = number * (int) Math.pow(2, n - i - 1);

            if (val > k) continue;

            k -= val;
            length++;


        }

        return length;


    }

    public static void main(String[] args) {

        // leeTCode->2311

        String s = "1001010";
        int k = 5;
        System.out.println(longestSubsequence(s, k));


    }
}
