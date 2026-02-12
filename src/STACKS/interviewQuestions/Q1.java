package STACKS.interviewQuestions;

import java.util.Stack;

public class Q1 {

    static boolean validParenthesis(String s) {

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {

                st.push(ch);

            } else {

                if (st.isEmpty()) return false;


                if (ch == ']' && st.peek() == '[' || ch == '}' && st.peek() == '{' || ch == ')' && st.peek() == '(') {

                    st.pop();
                } else {

                    return false;
                }


            }

        }

        return st.isEmpty();
    }


    public static void main(String[] args) {

        String str1 = "()[{}()]";
        String str2 = "()[{}(])";
        System.out.println(validParenthesis(str1));
        System.out.println(validParenthesis(str2));


    }


}
