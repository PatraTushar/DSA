package Recursion.CodeWithMik;

import java.util.Stack;

public class Q1 {

    static void insertAtBottom(Stack<Integer> st, int ele) {

        if (st.isEmpty()) {

            st.push(ele);
            return;
        }


        int top = st.pop();

        insertAtBottom(st, ele);

        st.push(top);

    }


    static void reverse(Stack<Integer> stack) {

        //  Time Complexity: O(n^2)
        //  Space Complexity: O(1)  // excluding stack space


        if (stack.isEmpty()) return;

        int topElement = stack.pop();

        reverse(stack);

        insertAtBottom(stack, topElement);


    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);
    }
}
