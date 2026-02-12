package QUEUE.interviewQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q9 {

    static void reverseQueue(Queue<Integer> q) {

        // Time Complexity: O(n)
        //Space Complexity: O(n)


        Stack<Integer> st=new Stack<>();

        while (!q.isEmpty()){

            st.add(q.poll());
        }

        while (!st.isEmpty()){

            q.add(st.pop());
        }

        System.out.println(q);
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(7);
        q.add(11);
        q.add(8);
        q.add(9);
        reverseQueue(q);

    }
}
