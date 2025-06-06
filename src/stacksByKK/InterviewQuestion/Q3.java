package stacksByKK.InterviewQuestion;

import java.util.Stack;

public class Q3 {

    static boolean bracketSequence(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);

            }
            else {

                if (st.isEmpty() || (ch == ')' && st.peek() != '(') || (ch == '}' && st.peek() != '{') || (ch == ']' && st.peek() != '[')) {
                    return false;
                }

                st.pop();


            }

        }

        return st.isEmpty();


    }

    public static void main(String[] args) {

        System.out.println(bracketSequence("()"));
        System.out.println(bracketSequence("()[]{}"));
        System.out.println(bracketSequence("(]"));
        System.out.println(bracketSequence("([])"));


    }
}
