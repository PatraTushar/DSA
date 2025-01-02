package STACK;

import java.util.*;

public class basicsOfStack {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<Integer>();
        System.out.println(st.isEmpty());
        System.out.println("size is " +st.size());
        System.out.println(st);
        st.push(1);
        System.out.println(st.isEmpty());
        System.out.println("size is " +st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("size is " +st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("size is " +st.size());
        System.out.println(st);
        st.push(5);
        System.out.println("size is " +st.size());
        System.out.println(st);
        st.push(34);
        System.out.println("size is " +st.size());
        System.out.println(st);

        //peek
//
//       // System.out.println(st.peek());
//        System.out.println(st);
//        //  st.pop();
//     //   System.out.println(st);
//        System.out.println(" size is " +st.size());
//
//        while(st.size()>2){
//
//            st.pop();
//
//        }
//
//        System.out.println(st.peek());
//        System.out.println(st);
    }
}
