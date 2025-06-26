package StackByStriver.basics;

import java.util.Stack;

public class Q1 {

    static void copyContentInSameOrder(Stack<Integer> st) {

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        Stack<Integer> gt = new Stack<>();

        while (!st.isEmpty()) {
            gt.push(st.pop());
        }


        Stack<Integer> rt = new Stack<>();

        while (!gt.isEmpty()){

            rt.push(gt.pop());
        }

        System.out.println(rt);
    }

    public static void main(String[] args) {

        // Q: copy the content of one stack to another in same order

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        copyContentInSameOrder(st);


    }
}
