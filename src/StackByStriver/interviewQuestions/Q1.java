package StackByStriver.interviewQuestions;

import java.util.Stack;

public class Q1 {

    static boolean validParenthesis(String s) {

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        int i = 0;
        int n = s.length();

        Stack<Character> st = new Stack<>();

        while (i < n) {

            char ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {

                st.push(ch);
            }
            else {

                if(st.isEmpty()) return false;

                char top=st.peek();

                if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[')
                    st.pop();

                else return false;


            }
            i++;


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
