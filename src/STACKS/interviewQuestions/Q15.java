package STACKS.interviewQuestions;

import java.util.Stack;

public class Q15 {

    static String removeKDigits(String num, int k) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        Stack<Character> st = new Stack<>();
        int removed = 0;

        for (char ch : num.toCharArray()) {


            while (!st.isEmpty() && (st.peek() > ch && removed < k)) {

                st.pop();
                removed++;
            }

            st.push(ch);


        }

        while (!st.isEmpty() && removed < k) {

            st.pop();
            removed++;

        }


        StringBuilder sb = new StringBuilder();


        for (char ch : st) sb.append(ch);


        while (sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);

        if (sb.length()==0) return "0";


        return sb.toString();


    }

    public static void main(String[] args) {

        String str = "1432219";
        int k = 3;
        String Ans = removeKDigits(str, k);
        System.out.println(Ans);


    }
}
