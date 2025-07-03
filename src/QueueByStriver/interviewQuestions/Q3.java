package QueueByStriver.interviewQuestions;

import java.util.Stack;

public class Q3 {

    public static class Queue{


        Stack<Integer> original=new Stack<>();
        Stack<Integer> helper=new Stack<>();


        public void push(int data){

            // Time Complexity: O(1)
            // Space Complexity: O(1)

            original.push(data);
        }

        public int pop(){

            // Time Complexity: O(n)
            // Space Complexity: O(1)

            if(original.size()==0) return -1;

            while (original.size()>1){
                helper.push(original.pop());
            }

            int top=original.pop();

            while (helper.size()>0){

                original.push(helper.pop());
            }

            return top;
        }

        public int peek(){

            // Time Complexity: O(n)
            // Space Complexity: O(1)

            if(original.size()==0) return -1;

            while (original.size()>1){
                helper.push(original.pop());
            }

            int top = original.pop();
            helper.push(top);


            while (helper.size()>0){

                original.push(helper.pop());
            }

            return top;
        }

        public boolean isEmpty(){

            // Time Complexity: O(1)
            // Space Complexity: O(1)

            return original.isEmpty();
        }
    }




    public static void main(String[] args) {

        // Implement Queue Using 2 Stack

        Queue q = new Queue();

        // Enqueue elements
        q.push(10);
        q.push(20);
        q.push(30);

        // Peek at front
        System.out.println("Front element: " + q.peek()); // Output: 10

        // Dequeue elements
        System.out.println("Removed: " + q.pop()); // Output: 10

        // Peek again
        System.out.println("Front element: " + q.peek()); // Output: 20

        // Enqueue more
        q.push(40);

        // Dequeue more
        System.out.println("Removed: " + q.pop()); // Output: 20
        System.out.println("Removed: " + q.pop()); // Output: 30
        System.out.println("Removed: " + q.pop()); // Output: 40

        // Try popping from empty queue
        System.out.println("Removed: " + q.pop()); // Output: -1

        // Check if queue is empty
        System.out.println("Is queue empty? " + q.isEmpty()); // Output: true
    }


    }

