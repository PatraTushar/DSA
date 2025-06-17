package linkedListByKK.SinglyLinkedList.Basics;

public class implementationOfLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }


    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;

        int size = 0;

        void insertAtTail(int data) {

            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;

            } else {

                tail.next = newNode;
            }

            tail = newNode;
            size++;


        }

        void insertAtHead(int data) {

            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;
                tail = newNode;
            } else {

                newNode.next = head;
                head = newNode;
            }

            size++;


        }

        void insert(int idx, int data) {

            Node temp = head;
            Node newNode = new Node(data);

            if (idx < 1 || idx > size+1) {
                throw new IndexOutOfBoundsException(" wrong index ");
            }

            if (idx == 1) {
                insertAtHead(data);
                return;
            }

            if (idx == size + 1) {
                insertAtTail(data);
                return;
            }



                for (int i = 1; i < idx - 1; i++) {

                    temp = temp.next;

                }

                Node storeAfterNode = temp.next;
                temp.next = newNode;
                newNode.next = storeAfterNode;



            size++;


        }

        int getAt(int idx) {
            Node temp = head;

            if (idx < 1 || idx >size ) {
                throw new IndexOutOfBoundsException(" wrong index ");
            }


            for (int i = 1; i < idx; i++) {

                temp = temp.next;

            }
            return temp.data;
        }

        void deleteAt(int idx) {

            Node temp = head;

            if (idx < 1 || idx > size ) {
                throw new IndexOutOfBoundsException(" wrong index ");
            }

            if (idx == 1) {

                head=head.next;

                if(head==null){
                    tail=null;
                }

                size--;
                return;
            }


            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }

            // If deleting last node, update tail
            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next;
            size--;


        }


        void display() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insertAtTail(10);
        ll.insertAtTail(100);
        ll.insertAtTail(1400);
        ll.insertAtTail(1600);
        ll.insertAtTail(3300);
        ll.display();     // 10 100 1400 1600 3300
        ll.insertAtHead(222);
        ll.display();    // 222 10 100 1400 1600 3300
        ll.insert(4, 900);
        ll.display();     // 222 10 100 900 1400 1600 3300
        System.out.println(ll.getAt(3)); // 100
        ll.deleteAt(5);
        ll.display(); // 222 10 100 900 1600 3300


    }



}
