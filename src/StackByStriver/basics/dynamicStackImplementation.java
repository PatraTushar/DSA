package StackByStriver.basics;

import java.util.EmptyStackException;


// DYNAMIC STACK IMPLEMENTATION
public class dynamicStackImplementation {

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

            return size;
        }


        public boolean isEmpty() {

            return size == 0;
        }

        public boolean isFull() {

            return size == capacity;
        }


        public void resize() {

            capacity *= 2;
            int[] newStack = new int[capacity];

            for (int i = 0; i < stack.length; i++) {

                newStack[i] = stack[i];

            }

            stack = newStack;

        }


        public void push(int val) {

            if (isFull()) resize();

            stack[++index] = val;
            size++;

        }


        public int pop() {

            if (isEmpty()) {

                throw new EmptyStackException();
            }


            int top = stack[index];

            index--;
            size--;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;


        }

        public void shrink() {

            capacity /= 2;

            int[] newStack = new int[capacity];

            for (int i = 0; i < stack.length; i++) {

                newStack[i] = stack[i];

            }

            stack = newStack;
        }


        public int peek() {

            if (isEmpty()) {

                throw new EmptyStackException();
            }

            return stack[index];
        }

        public void display() {

            for (int i = 0; i < size; i++) {

                System.out.print(stack[i] + " ");
            }

            System.out.println();


        }


    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());
        st.display();
        System.out.println("Size: " + st.getSize());
        System.out.println("IsEmpty: " + st.isEmpty());

    }


}
