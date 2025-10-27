package QueueByStriver.basics;


public class llImplementationOfCQ {

    public static class circularQueue {


        //  USING HEAD AND TAIL POINTER
        private static class Node {

            int data;
            Node next;

            Node(int data) {

                this.data = data;
            }

        }


        Node head;
        Node tail;
        int size;

        circularQueue() {

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

            Node newNode = new Node(val);

            if (isEmpty()) {

                head = tail = newNode;

            } else {

                tail.next = newNode;
                tail = newNode;


            }

            tail.next = head;
            size++;

        }


        public Integer poll() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (isEmpty()) return null;

            int top = head.data;

            if (size == 1) {

                head = tail = null;

            } else {

                head = head.next;
                tail.next = head;

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

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();
        }


    }


    public static void main(String[] args) {

        circularQueue q = new circularQueue();
        System.out.println(q.isEmpty());  // true
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();  // 1 2 3 4 5
        q.poll();
        q.display();  // 2 3 4 5
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty());  // false


    }
}
