package STACKS.basics;

import java.util.Stack;

public class basicsOfStack {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(20);
        st.push(45);
        st.push(57);
        st.push(70);
        System.out.println(st);  // [1, 20, 45, 57, 70]
        System.out.println(st.size());  //5
        st.pop();
        System.out.println(st);    // [1, 20, 45, 57]
        st.pop();
        System.out.println(st);   // [1, 20, 45]
        System.out.println(st.peek());    // 45

        while (st.size()>2){
            st.pop();
        }

        System.out.println(st.peek());  // 20





    }
}
