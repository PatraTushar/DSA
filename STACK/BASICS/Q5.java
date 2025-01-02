package STACK;

import java.util.Stack;

public class Q5 {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> rt=new Stack<>();

        while(st.size()>0){

            rt.push(st.pop());
        }

        Stack<Integer> at=new Stack<>();

        while(rt.size()>0){
            at.push(rt.pop());
        }

        while(at.size()>0){
            st.push(at.pop());
        }

        System.out.println(st);
    }
}
