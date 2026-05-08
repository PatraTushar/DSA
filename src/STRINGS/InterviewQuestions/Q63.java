package STRINGS.InterviewQuestions;

public class Q63 {
    static int numSub(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int mod = 1_000_000_007;

        long result = 0;

        int repeatedOnes = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '1') {

                repeatedOnes++;
            } else {

                result = (result + (long) repeatedOnes * (repeatedOnes + 1) / 2) % mod;
                repeatedOnes = 0;
            }


        }

        result = (result + (long) repeatedOnes * (repeatedOnes + 1) / 2) % mod;


        return (int) result;


    }

    public static void main(String[] args) {

        // leeTCode->1513

        String s = "0110111";
        System.out.println(numSub(s));


    }
}
