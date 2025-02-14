package STACK;

import java.util.Stack;

public class Q4 {


    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // remove from bottom

        Stack<Integer> rt=new Stack<>();

//        while(st.size()>1){
//
//            rt.push(st.pop());
//        }
//
//        st.pop();
//
//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//
//        System.out.println(st);
//

        //remove from any index

        int idx=2;

        while(st.size()>idx+1){

            rt.push(st.pop());


        }

        st.pop();

        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);

    }
}
