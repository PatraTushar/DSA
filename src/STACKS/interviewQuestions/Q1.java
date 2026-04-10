package STACKS.interviewQuestions;

import java.util.Stack;

public class Q1 {

    static boolean validParenthesis(String s) {

        //Time Complexity: O(n)
        //Space Complexity: O(n)
        int length = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            char currChar = s.charAt(i);

            if (currChar == '{' || currChar == '[' || currChar == '(') st.push(currChar);

            else {

                if (st.isEmpty()) return false;

                else if ((currChar == '}' && st.peek() == '{') || (currChar == ']' && st.peek() == '[') || (currChar == ')' && st.peek() == '('))
                    st.pop();

                else return false;



            }
        }

        return st.isEmpty();

    }


    public static void main(String[] args) {

        // leeTCode->20

        String str1 = "()[{}()]";
        String str2 = "()[{}(])";
        System.out.println(validParenthesis(str1));
        System.out.println(validParenthesis(str2));


    }


}
