package STRINGS.InterviewQuestions;

import java.util.Stack;

public class Q7 {

    static String makeGood(String s) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty() && Math.abs(st.peek()-ch)==32){

                st.pop();
            }

            else st.push(ch);
        }

        StringBuilder sb=new StringBuilder();

        for (char ch:st) sb.append(ch);

        return sb.toString();


    }

    public static void main(String[] args) {

        //leeTCode->1544

        String s = "leEeetcode";
        String ans = makeGood(s);
        System.out.println(ans);

    }
}
