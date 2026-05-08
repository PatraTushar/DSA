package STRINGS.InterviewQuestions;

import java.util.Stack;

public class Q61 {

    static String robotSWithString(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = s.length();
        Stack<Character> st = new Stack<>();
        char[] minCharToRight = new char[n];
        minCharToRight[n - 1] = s.charAt(n - 1);
        StringBuilder result = new StringBuilder();

        for (int i = n - 2; i >= 0; i--) {

            minCharToRight[i] = (char) Math.min(s.charAt(i), minCharToRight[i + 1]);
        }

        int i = 0;

        while (i < n) {

            st.push(s.charAt(i));

            char minChar = i + 1 < n ? minCharToRight[i + 1] : s.charAt(i);

            while (!st.isEmpty() && st.peek() <= minChar) {

                result.append(st.pop());
            }

            i++;

        }


        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();

    }

    public static void main(String[] args) {

        // leeTCode->2434

        String s="zza";
        System.out.println(robotSWithString(s));
    }
}
