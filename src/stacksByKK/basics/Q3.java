package stacksByKK.basics;

import OopsByKK.AccessModifier.Public.A;

import java.util.Stack;

public class Q3 {

    static void insertAtBottomRec(Stack<Integer> st,int val){

        if(st.size()==0){
            System.out.print(val+" ");
            st.push(val);
            return;
        }

        int top=st.pop();
        insertAtBottomRec(st,val);
        System.out.print(top +" ");
        st.push(top);


    }

    static Stack<Integer> insertAtBottom(Stack<Integer> st,int val){

        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }

        st.push(val);

        while (rt.size()>0){
            st.push(rt.pop());
        }

        return st;

    }

    static Stack<Integer> insertAtAnyIdx(Stack<Integer> st,int val,int idx){

        Stack<Integer> rt=new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop());
        }

        st.push(val);

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
        System.out.println(st);

      //  Stack<Integer> Bottom=insertAtBottom(st,10);
       // System.out.println(Bottom);

//        Stack<Integer> Index=insertAtAnyIdx(st,10,2);
//        System.out.println(Index);

        insertAtBottomRec(st,100);




    }
}
