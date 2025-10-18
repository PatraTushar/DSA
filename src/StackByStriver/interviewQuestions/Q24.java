package StackByStriver.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q24 {

    static List<Integer> printBracketNumber(String s) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int count = 0;
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {


            if (ch == '(') {

                count++;
                st.push(count);
                list.add(count);
            } else if (ch == ')') {

                list.add(st.pop());

            }


        }

        return list;


    }

    public static void main(String[] args) {

        String s = "(aa(bdc))p(de)";
        List<Integer> ans = printBracketNumber(s);
        System.out.println(ans);

    }
}
