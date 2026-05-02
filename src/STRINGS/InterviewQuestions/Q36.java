package STRINGS.InterviewQuestions;

public class Q36 {

    static long countSubstrings(String s, char c) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int n = s.length();
        long count = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == c) count++;


        }

        return count * (count - 1) / 2 + count;

    }

    public static void main(String[] args) {

        // leeTCode->3084

        String s = "abada";
        char c = 'a';
        System.out.println(countSubstrings(s, c));

    }
}
