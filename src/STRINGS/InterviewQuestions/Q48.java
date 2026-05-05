package STRINGS.InterviewQuestions;

public class Q48 {

    static int minChanges(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = s.length();
        int changes = 0;

        for (int i = 0; i < n - 1; i += 2) {

            if (s.charAt(i) != s.charAt(i + 1)) changes++;
        }

        return changes;


    }

    public static void main(String[] args) {

        // leeTCode->2914

        String s = "1001";
        System.out.println(minChanges(s));


    }
}
