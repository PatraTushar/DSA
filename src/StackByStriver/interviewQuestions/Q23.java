package StackByStriver.interviewQuestions;

import java.util.Stack;

public class Q23 {

    static String build(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != '#') st.push(ch);
            else if (!st.isEmpty()) st.pop();
        }

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        return sb.toString();
    }

    static boolean backspaceCompare(String s, String t) {

        // Time Complexity (TC): O(n + m)   n=s.length and m=t.length
        //Space Complexity (SC): O(n + m)

        return build(s).equals(build(t));


    }

    public static void main(String[] args) {

        // leeTCode->844

        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));  // true

        String a = "a#c";
        String b = "b";
        System.out.println(backspaceCompare(a, b));  // false


    }
}
