package stacksByKK.basics;

import java.util.Stack;

public class Q7 {

    static void insertAtBottom(Stack<Integer> st, int val) {

        Stack<Integer> gt = new Stack<>();
        while (!st.isEmpty()) {
            gt.push(st.pop());
        }
        st.push(val);

        while (!gt.isEmpty()) {
            st.push(gt.pop());
        }


    }


    static void reverse(Stack<Integer> st) {

        if (st.isEmpty()) return;

        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);

    }


    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
}
