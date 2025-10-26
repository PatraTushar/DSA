package StackByStriver.conversion;

import java.util.Stack;

public class PostfixToInfix {

    static String evaluation(String postfix) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        int length = postfix.length();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            char ch = postfix.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

                st.push(ch + "");

            } else {

                String operand2 = st.pop();
                String operand1 = st.pop();
                String result = "(" + operand1 + ch + operand2 + ")";
                st.push(result);

            }


        }

        return st.peek();


    }

    public static void main(String[] args) {

        String postfix = "AB-DE+F*/";
        System.out.println(evaluation(postfix));


    }
}
