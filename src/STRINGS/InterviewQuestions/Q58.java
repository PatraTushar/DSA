package STRINGS.InterviewQuestions;

import java.util.Stack;

public class Q58 {

    static String smallestNumber(String pattern) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = pattern.length();
        Stack<Character> st = new Stack<>();
        int counter = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= n; i++) {

            st.push((char) ('0' + counter++));

            if (i == n || pattern.charAt(i) == 'I') {

                while (!st.isEmpty()) {
                    result.append(st.pop());
                }
            }

        }

        return result.toString();


    }

    public static void main(String[] args) {

        // leeTCode->2375

        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }
}
