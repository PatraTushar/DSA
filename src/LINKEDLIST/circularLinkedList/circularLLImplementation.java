package LINKEDLIST.circularLinkedList;

public class circularLLImplementation {


    public static class circularLL {


        //  USING ONLY TAIL POINTER
        private static class Node {

            int data;
            Node next;

            Node(int data) {

                this.data = data;
            }

        }


        Node tail;
        int size;

        circularLL() {


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

                tail = newNode;
                tail.next = newNode;

            } else {

                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;


            }


            size++;

        }


        public Integer poll() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (isEmpty()) return null;

            int top = tail.next.data;


            if (size == 1) {

                tail = null;

            } else {

                tail.next = tail.next.next;

            }
            return top;


        }


        public Integer peek() {

            //Time Complexity:O(1)
            //Space Complexity:O(1)

            if (isEmpty()) return null;

            return tail.next.data;
        }


        public void display() {

            //Time Complexity:O(n)
            //Space Complexity:O(1)

            Node temp = tail.next;

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != tail.next);

            System.out.println();
        }

    }

    public static void main(String[] args) {

        circularLL ll = new circularLL();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.display();
        System.out.println(ll.getSize());
        System.out.println(ll.poll());
        System.out.println(ll.getSize());
        System.out.println(ll.peek());
        System.out.println(ll.isEmpty());

    }
}
