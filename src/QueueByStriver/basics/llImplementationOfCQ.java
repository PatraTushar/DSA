package QueueByStriver.basics;

import java.util.NoSuchElementException;

public class llImplementationOfCQ {

    public static class circularQueue {


        public static class Node {

            int data;
            Node next;

            Node(int data) {

                this.data = data;
            }
        }


        Node head = null;
        Node tail = null;

        int size = 0;


        public void add(int data) {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;
                tail.next = head;

            }

            size++;


        }

        public int remove() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (size == 0) {
                throw new NoSuchElementException(" queue is empty ");
            }

            if (size == 1) {
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            tail.next = head;
            size--;

            return val;


        }


        public int peek() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (size == 0) {
                throw new NoSuchElementException(" queue is empty ");

            }

            return head.data;
        }

        public int size() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (size == 0) return 0;

            return size;
        }

        public boolean isEmpty() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            return size == 0;
        }


        public void display() {

            //Time Complexity:O(n)
            //Space Complexity:O(1)

            if (head == null) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print(head.data + " ");
            Node temp = head.next;
            while (temp != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();


        }
    }



    public static void main(String[] args) {

        circularQueue q=new circularQueue();
        System.out.println(q.isEmpty());  // true
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();  // 1 2 3 4 5
        q.remove();
        q.display();  // 2 3 4 5
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty());  // false


    }
}
