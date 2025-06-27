package StackByStriver.interviewQuestions;

import java.util.Stack;

public class minStack {

    public static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // BruteForce Approach



    Stack<Pair> st=new Stack<>();

    public void push(int val){

        // Time Complexity : O(1)
        // Space Complexity : O(n)

        if(st.isEmpty()){

            st.push(new Pair(val,val));
        }

        else {

            st.push(new Pair(val,Math.min(val,st.peek().second)));
        }


    }

    public int getMin(){

        // Time Complexity : O(1)
        // Space Complexity : O(n)

        return st.peek().second;
    }


    public int peek(){
        // Time Complexity : O(1)
        // Space Complexity : O(n)

        return st.peek().first;
    }

    public void pop() {
        // Time Complexity : O(1)
        // Space Complexity : O(n)

        if (!st.isEmpty()) {
            st.pop();
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }




    public static void main(String[] args) {

      minStack m=new minStack();

        // Push some values
        m.push(12);
        m.push(15);
        m.push(10);

        // Get top value
        System.out.println("Top element: " + m.peek());     // Should print 10

        // Get minimum value
        System.out.println("Minimum so far: " + m.getMin()); // Should print 10

        // Pop top element
        m.st.pop(); // Removes 10

        // Get top and min after pop
        System.out.println("Top after pop: " + m.peek());   // Should print 15
        System.out.println("Min after pop: " + m.getMin()); // Should print 12

    }
}
