package QueueByStriver.basics;


public class llImplementationOfQueue {

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

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            return size == 0;
        }

        public int getSize() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            return size;
        }

        public void add(int val) {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

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

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (isEmpty()) {

                return null;
            }

            int top = head.data;
            head = head.next;
            size--;

            if (head == null) {

                tail = null;
            }

            return top;
        }


        public Integer peek() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (isEmpty()) return null;

            return head.data;
        }

        public void display() {

            //Time Complexity:O(n)
            //Space Complexity:O(1)

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
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
}
