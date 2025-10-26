package StackByStriver.basics;

import java.util.EmptyStackException;

public class dynamicStackImplementationUsingGenerics {

    // DYNAMIC STACK IMPLEMENTATION USING GENERICS

    public static class Stack<T> {

        T[] stack;
        int size;
        int index;
        int capacity;

        int DEFAULT_CAPACITY = 10;

        @SuppressWarnings("unchecked")
        Stack() {

            capacity = DEFAULT_CAPACITY;
            stack = (T[]) new Object[capacity];
            index = -1;
            size = 0;
        }


        public boolean isEmpty() {

            return size == 0;
        }

        public boolean isFull() {

            return size == capacity;
        }


        @SuppressWarnings("unchecked")
        public void resize() {

            capacity *= 2;
            T[] newStack = (T[]) new Object[capacity];

            for (int i = 0; i < stack.length; i++) {

                newStack[i] = stack[i];

            }

            stack = newStack;

        }


        public void push(T val) {

            if (isFull()) resize();

            stack[++index] = val;
            size++;

        }


        public T pop() {

            if (isEmpty()) {

                throw new EmptyStackException();
            }


            T top = stack[index];

            index--;
            size--;

            if (capacity > DEFAULT_CAPACITY && size < capacity / 4) shrink();

            return top;


        }

        @SuppressWarnings("unchecked")
        public void shrink() {

            capacity /= 2;

            T[] newStack = (T[]) new Object[capacity];

            for (int i = 0; i < stack.length; i++) {

                newStack[i] = stack[i];

            }

            stack = newStack;
        }


        public T peek() {

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

        public static void main(String[] args) {

            Stack<Integer> st = new Stack();

            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.display();
            System.out.println(st.isFull());
            System.out.println(st.isEmpty());
            System.out.println(st.peek());
            System.out.println(st.pop());
            st.display();
        }

    }
}
