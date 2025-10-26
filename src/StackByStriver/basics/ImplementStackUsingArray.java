package StackByStriver.basics;

import java.util.EmptyStackException;


public class ImplementStackUsingArray {

    public static class Stack {

        int[] stack;
        int size;
        int index;
        int capacity;

        int DEFAULT_CAPACITY = 10;

        Stack() {

            capacity = DEFAULT_CAPACITY;
            stack = new int[capacity];
            index = -1;
            size = 0;
        }


        int getSize() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size;
        }


        public boolean isEmpty() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == 0;
        }

        public boolean isFull() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == capacity;
        }


        public void push(int val) {

            //Time Complexity: O(1)
            //Space Complexity: O(1)


            stack[++index] = val;
            size++;

        }


        public int pop() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                throw new EmptyStackException();
            }


            int top = stack[index];

            index--;
            size--;


            return top;


        }


        public int peek() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                throw new EmptyStackException();
            }

            return stack[index];
        }

        public void display() {

            //Time Complexity: O(n)
            //Space Complexity: O(n)

            for (int i = 0; i < size; i++) {

                System.out.print(stack[i] + " ");
            }

            System.out.println();


        }


    }


    public static void main(String[] args) {


        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();   // 1 2 3 4 5
        st.pop();
        st.display();  // 1 2 3 4
        System.out.println(st.peek()); // 4
        System.out.println(st.getSize()); // 4
        System.out.println(st.isEmpty()); // false


    }
}
