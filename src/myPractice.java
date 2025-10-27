import QueueByStriver.basics.dequeImplementationOfLL;

public class myPractice {

    public static class dequeImplementationOfLL {

        public static class Node {

            Node prev;
            int data;
            Node next;

            Node(int data) {

                this.data = data;
            }
        }

        Node head;
        Node tail;
        int size;

        dequeImplementationOfLL() {

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


        public void offerFirst(int val) {

            Node newNode = new Node(val);

            if (isEmpty()) {

                head = tail = newNode;
            } else {

                newNode.next = head;
                head.prev = newNode;
                head = newNode;

            }

            size++;


        }

        public void offerLast(int val) {

            Node newNode = new Node(val);

            if (isEmpty()) {

                head = tail = newNode;
            } else {

                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }

            size++;


        }


        public Integer pollFirst() {

            if (isEmpty()) return null;

            Integer top = head.data;
            head = head.next;

            if (head != null) head.prev = null;
            else tail = null;
            size--;


            return top;


        }

        public Integer pollLast() {

            if (isEmpty()) return null;

            int top = tail.data;

            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
            size--;

            if (tail == null) head = null;

            return top;


        }

        public Integer peekFirst() {

            if (isEmpty()) return null;

            return head.data;


        }

        public Integer peekLast() {

            if (isEmpty()) return null;

            return tail.data;


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

        // Create deque object using your class name
        dequeImplementationOfLL dq = new dequeImplementationOfLL();

        // Add elements to front and rear
        dq.offerFirst(10);   // Deque: 10
        dq.offerLast(20);    // Deque: 10 20
        dq.offerFirst(5);    // Deque: 5 10 20
        dq.offerLast(30);    // Deque: 5 10 20 30

        // Display deque
        System.out.print("Deque after adding elements: ");
        dq.display();      // Output: 5 10 20 30

        // Peek front and rear
        System.out.println("Front element: " + dq.peekFirst()); // 5
        System.out.println("Rear element: " + dq.peekLast());   // 30

        // Remove elements from front and rear
        System.out.println("Removed front: " + dq.pollFirst()); // removes 5
        System.out.println("Removed rear: " + dq.pollLast());   // removes 30

        // Display deque after removals
        System.out.print("Deque after removing elements: ");
        dq.display();      // Output: 10 20

        // Check size and emptiness
        System.out.println("Deque size: " + dq.getSize());           // 2
        System.out.println("Is deque empty? " + dq.isEmpty());    // false

    }
}

