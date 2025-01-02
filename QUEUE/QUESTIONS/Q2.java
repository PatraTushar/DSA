package QUEUE.QUESTIONS;

import java.util.*;

public class Q2 {


    public Queue<Integer> reverse(Queue<Integer> input, int k){

        if(input.isEmpty()){
            return input;
        }

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<k;i++){

            st.push(input.remove());         // st-1 2 3
        }

        while(st.size()>0){

            input.add(st.pop());        // input- 4 5 3 2 1
        }

        for(int i=0;i<input.size()-k;i++){

            input.add(input.remove());        //op-3 2 1 4 5
        }

        return input;






    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);



        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);


        System.out.println(" enter k ");
        int k=sc.nextInt();

        Q2 obj = new Q2();
        Queue<Integer> ans = obj.reverse(q, k);
        System.out.println("Reversed Queue: " + ans);


    }
}
