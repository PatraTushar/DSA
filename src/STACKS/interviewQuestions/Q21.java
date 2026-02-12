package STACKS.interviewQuestions;

import java.util.Stack;

public class Q21 {

    static int stringManipulation(String[] str) {

        // Time Complexity (TC): O(n * l)  l is the average length of string
        //Space Complexity (SC): O(n)

        Stack<String> st = new Stack<>();

        for (String s : str) {

            boolean removed = false;

            if (!st.isEmpty() && st.peek().equals(s)) {

                removed = true;
                st.pop();


            }

            if (!removed) st.push(s);


        }

        return st.size();
    }

    public static void main(String[] args) {

        String[] str = {"ab", "ac", "da", "da", "ac", "db","ea"};
        System.out.println(stringManipulation(str));

    }
}
