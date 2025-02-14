package QUEUE.QUESTIONS;

import java.util.*;

public class Q6 {

    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);

        Stack<Integer> st=new Stack<>();

        int n=q.size();

        for(int i=0;i<(n/2);i++){
            st.push(q.remove());        // st=1 2 3 4            q=5 6 7 8
        }

        while(st.size()>0){

            q.add(st.pop());            // q=5 6 7 8 4 3 2 1        st=empty
        }

        for(int i=0;i<(n/2);i++){
            st.push(q.remove());       // st=5 6 7 8              q=4 3 2 1
        }


        for(int i=0;i<(n/2);i++){

            q.add(st.pop());
            q.add(q.remove());            // q=8 4 7 3 6 2 5 1   st=empty

        }


        while(q.size()>0){

            st.push(q.remove());           //st=8 4 7 3 6 2 5 1
        }


        while(st.size()>0){

            q.add(st.pop());                //q=1 5 2 6 3 7 4 8
        }

        System.out.println(q);


    }
}
