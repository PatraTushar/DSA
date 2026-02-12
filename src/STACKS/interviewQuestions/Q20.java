package STACKS.interviewQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class Q20 {

    static ArrayList<Integer> arrayBeautiful(int[] arr) {

        // Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)


        Stack<Integer> st = new Stack<>();


        for (int ele : arr) {

            if (st.isEmpty()) st.push(ele);

            else if (ele >= 0) {

                if (st.peek() >= 0) st.push(ele);
                else st.pop();


            } else {

                if (st.peek() < 0) st.push(ele);
                else st.pop();


            }


        }

        ArrayList<Integer> result = new ArrayList<>();


        for (int ele : st) {

            result.add(ele);
        }

        return result;


    }

    public static void main(String[] args) {

        int[] arr = {4, 2, -2, 1};
        ArrayList<Integer> ans = arrayBeautiful(arr);
        System.out.println(ans);
    }
}
