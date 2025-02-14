package STACK.BASICS;

import java.util.Stack;

public class displayStackRecursively {



    public static void displayReverseRecursively(Stack<Integer> s){

        if(s.size()==0) return;;
        int top=s.pop();
        System.out.print(top +" ");
        displayReverseRecursively(s);
        s.push(top);



    }

    public static void displayRecursively(Stack<Integer> s){

        if(s.size()==0) return;
        int top=s.pop();
        displayRecursively(s);
        System.out.print(top+" ");
        s.push(top);





    }



    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayReverseRecursively(st);
        System.out.println();
        displayRecursively(st);

    }
}
