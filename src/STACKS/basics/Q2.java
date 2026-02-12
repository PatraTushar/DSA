package STACKS.basics;

import java.util.Stack;

public class Q2 {

    static void reverseStack(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        Stack<Integer> gt=new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());
        }
        //  System.out.println(gt);

        Stack<Integer> rt=new Stack<>();

        while (gt.size()>0){
            rt.push(gt.pop());
        }
        // System.out.println(rt);

        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);



    }

    public static void main(String[] args) {

        // Reverse a Stack Using Two Auxiliary Stacks

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        reverseStack(st);



    }
}
