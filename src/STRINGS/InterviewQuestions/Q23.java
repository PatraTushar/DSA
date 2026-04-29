package STRINGS.InterviewQuestions;

public class Q23 {

    static int countHomogeneous(String s) {

        // Time Complexity:  O(n)
        // Space Complexity: O(1)

        int n = s.length();

        long MOD = 1_000_000_007;


        long length = 0;
        long result = 0;

        for (int i = 0; i < n; i++) {

            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {

                length++;
            } else length = 1;

            result = (result + length) % MOD;


        }

        return (int) result;


    }

    public static void main(String[] args) {

        // leeTCode->1759

        String s = "abbcccaa";
        System.out.println(countHomogeneous(s));
    }
}
