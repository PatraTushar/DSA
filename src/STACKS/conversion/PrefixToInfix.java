package STACKS.conversion;


import java.util.Stack;

public class PrefixToInfix {

    static String evaluation(String prefix) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int length = prefix.length();
        Stack<String> st = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

                st.push(ch + "");

            } else {

                String operand1 = st.pop();
                String operand2 = st.pop();
                String result = "(" + operand1 + ch + operand2 + ")";
                st.push(result);

            }


        }

        return st.peek();

    }

    public static void main(String[] args) {

        String prefix = "*+PQ-MN";
        System.out.println(evaluation(prefix));


    }
}
