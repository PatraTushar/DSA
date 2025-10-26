package StackByStriver.basics;


import java.util.EmptyStackException;


public class ImplementStackUsingLL {

    public static class Stack {

        Node head;
        Node tail;

        int size;

        public static class Node {

            int data;
            Node next;


            Node(int data) {

                this.data = data;
            }
        }

        Stack() {

            head = null;
            tail = null;
            size = 0;


        }

        public int getSize() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size;
        }

        public boolean isEmpty() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            return size == 0;
        }


        public void push(int val) {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            Node temp = new Node(val);

            if (isEmpty()) {

                head = tail = temp;


            } else {

                temp.next = head;
                head = temp;


            }

            size++;


        }


        public int pop() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                throw new EmptyStackException();
            }


            int top = head.data;
            head = head.next;
            size--;

            return top;

        }

        public int peek() {

            //Time Complexity: O(1)
            //Space Complexity: O(1)

            if (isEmpty()) {

                throw new EmptyStackException();
            }

            return head.data;
        }

        public void display() {

            //Time Complexity: O(n)
            //Space Complexity: O(1)

            Node temp = head;
            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }


    }


    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.getSize());
        System.out.println(st.pop());
        System.out.println(st.getSize());
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());


    }
}
