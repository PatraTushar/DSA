package STACK;

import java.util.Stack;

public class stackUnderFlow {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);  //1 2 3 4 5

        st.pop();
        System.out.println(st);  //1 2 3 4
        st.pop();
        System.out.println(st);  //1 2 3
        st.pop();
        System.out.println(st);  //1 2
        st.pop();
        System.out.println(st);  // 1
        st.pop();
        System.out.println(st);  // []
        st.pop();                   //error
        System.out.println(st);





    }
}
