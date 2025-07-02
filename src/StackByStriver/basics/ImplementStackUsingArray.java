package StackByStriver.basics;

import java.util.EmptyStackException;
import java.util.Stack;

public class ImplementStackUsingArray {

    public static class Stack {


        int idx = -1;
        int[] stack = new int[10];


        public void push(int val) {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (idx == stack.length - 1) {
                throw new IndexOutOfBoundsException(" element cant be inserted ");
            }

            idx++;
            stack[idx] = val;


        }

        public int peek() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            if (idx == -1) {
                throw new EmptyStackException();
            }

            return stack[idx];
        }


        public int pop() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            if (idx == -1) {
                throw new EmptyStackException();
            }

            int top = stack[idx];
            idx--;

            return top;


        }

        public int size() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            if (idx == -1) return 0;

            return idx + 1;
        }

        boolean isEmpty() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            if (idx == -1) return true;
            else return false;


        }

        void display() {

            //Time Complexity: O(n)
            //Space Complexity: O(1)


            for (int i = 0; i <= idx; i++) {
                System.out.print(stack[i] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {


        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();   // 1 2 3 4 5
        st.pop();
        st.display();  // 1 2 3 4
        System.out.println(st.peek()); // 4
        System.out.println(st.size()); // 4
        System.out.println(st.isEmpty()); // false




    }
}
