package STRINGS.InterviewQuestions;

public class Q44 {

    static long minimumSteps(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = s.length();
        long count = 0;
        int ones = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);
            int digit = ch - '0';

            if (digit == 1) ones++;

            else {

                count += ones;
            }


        }

        return count;


    }

    public static void main(String[] args) {

        // leeTCode->2938

        String s = "101";
        System.out.println(minimumSteps(s));


    }
}
