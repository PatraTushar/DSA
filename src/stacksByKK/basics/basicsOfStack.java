package stacksByKK.basics;

import java.util.Stack;

public class basicsOfStack {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(20);
        st.push(45);
        st.push(57);
        st.push(70);
        System.out.println(st);
//        System.out.println(st.size());
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.peek());

        while (st.size()>2){
            st.pop();
        }

        System.out.println(st.peek());

    }
}
