package STACK;

import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        Stack<Integer> gt=new Stack<>();

        while(st.size()>0){
            gt.push(st.pop());
        }

        Stack<Integer> rt=new Stack<>();

        while(gt.size()>0){

            rt.push(gt.pop());

        }

        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
