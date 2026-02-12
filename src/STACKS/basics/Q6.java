package STACKS.basics;

import java.util.Stack;

public class Q6 {

    static Stack<Integer> removeFromBottom(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        Stack<Integer> rt=new Stack<>();
        while (st.size()>1){
            rt.push(st.pop());
        }

        st.pop();

        while (rt.size()>0){
            st.push(rt.pop());
        }

        return st;

    }

    static Stack<Integer> removeFromAnyIdx(Stack<Integer> st,int idx){

        //Time Complexity: O(n)
        //Space Complexity: O(n)

        Stack<Integer> rt=new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop());
        }

        st.pop();

        while (rt.size()>0){
            st.push(rt.pop());
        }

        return st;

    }

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> Bottom=removeFromBottom(st);
        System.out.println(Bottom);

        Stack<Integer> index=removeFromAnyIdx(st,3);
        System.out.println(index);
    }
}
