package QUEUE.QUESTIONS;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // reverse a queue

        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Stack<Integer> st=new Stack<>();

        while(q.size()>0){

            st.push(q.remove());

        }

        while(st.size()>0){

            q.add(st.pop());
        }

        System.out.println(q);









    }
}
