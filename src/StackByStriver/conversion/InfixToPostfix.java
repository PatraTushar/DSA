package StackByStriver.conversion;

import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char op) {

        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        else if (op == '^') return 3;
        else return 0;


    }


    static String evaluation(String s) {

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)


        int length = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < length; i++) {

            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

                postfix.append(ch);
            } else if (ch == '(') {

                st.push(ch);


            } else if (ch == ')') {

                while (st.peek() != '(') {

                    postfix.append(st.pop());
                }

                st.pop();

            } else {

                if (ch == '^') {

                    while (!st.isEmpty() && precedence(st.peek()) > precedence(ch)) {

                        postfix.append(st.pop());


                    }


                } else {

                    while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {

                        postfix.append(st.pop());
                    }

                }

                st.push(ch);

            }

        }


        while (!st.isEmpty()) {

            postfix.append(st.pop());
        }
        return postfix.toString();

    }

    public static void main(String[] args) {

        String str = "a+b*(c^d-e)";
        String Ans = evaluation(str);
        System.out.println(Ans);

    }
}
