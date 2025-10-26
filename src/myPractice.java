import java.util.NoSuchElementException;

public class myPractice {

    public static class Queue {

        public static class Node {

            int data;
            Node next;

            Node(int data) {

                this.data = data;


            }

        }

        Node head;
        Node tail;
        int size;

        Queue() {

            head = null;
            tail = null;
            size = 0;


        }

        public boolean isEmpty() {

            return size == 0;
        }

        public int getSize() {
            return size;
        }

        public void add(int val) {

            Node temp = new Node(val);

            if (isEmpty()) {

                head = tail = temp;


            } else {

                tail.next = temp;
                tail = temp;
            }

            size++;


        }


        public Integer poll() {

            if (isEmpty()) {

                return null;
            }

            int top = head.data;
            head = head.next;
            size--;

            return top;
        }


        public Integer peek() {

            if (isEmpty()) return null;

            return head.data;
        }

        public void display() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.getSize());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.peek());

    }

}

