package STACK;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        Stack<Integer> st=new Stack<>();

        //user input to print a stack

//        System.out.println(" enter number of elements you want to insert ");
//        int n=sc.nextInt();
//
//        System.out.println(" enter " + n + " elements ");
//        for(int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);


        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //Reverse Order

        Stack<Integer> gt=new Stack<>();

        while(st.size()>0){
//            int x=st.peek();
//            gt.push(x);
//            st.pop();

            gt.push(st.pop());
        }


        Stack <Integer> rt=new Stack<>();

        while(gt.size()>0) {
            rt.push(gt.pop());
        }

        System.out.println(rt);




    }
}
