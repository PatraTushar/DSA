package STACKS.basics;

import java.util.Stack;

public class Q5 {

    static void displayStackRecursively(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n) (due to recursion stack)

        if(st.size()==0) return;

        int top=st.pop();
        System.out.print(top +" ");
        displayStackRecursively(st);
        st.push(top);

    }


    static void displayStack(Stack<Integer> st){

        //Time Complexity: O(n)
        //Space Complexity: O(n) (due to recursion stack)


        if(st.size()==0) return;
        int top=st.pop();
        displayStack(st);
        System.out.print(top +" ");
        st.push(top);


    }






    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayStackRecursively(st);
        System.out.println();
        displayStack(st);


    }
}
