package linkedListByKK.doublyLinkedList;


public class implementationOfDLL {


    public static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }

    public static class Dll {

        Node head = null;
        Node tail = null;

        int size = 0;


        void insertAtTail(int data) {

            Node newNode = new Node(data);

            if (tail == null) {

                head = newNode;


            } else {

                tail.next = newNode;
                newNode.prev = tail;

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
                head.prev = newNode;
                head = newNode;
            }

            size++;


        }

        void insertAtAnyIndex(int idx, int data) {

            if (idx < 0 || idx > size) {

                throw new IndexOutOfBoundsException(" invalid index ");
            }

            Node newNode = new Node(data);

            if (idx == 0) {

                insertAtHead(data);


            } else if (idx == size) {

                insertAtTail(data);
            } else {

                Node temp = head;

                for (int i = 0; i < idx - 1; i++) {

                    temp = temp.next;
                }

                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
                newNode.next.prev = newNode;


            }

            size++;
        }


        void deleteHead() {

            if (head == null) {
                System.out.println(" nothing we can delete ");
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
            } else {

                head = head.next;
                head.prev = null;

            }

            size--;


        }

        void deleteTail() {

            if (tail == null) {
                System.out.println(" nothing we can delete ");
                return;
            }

            if (head == tail) {

                head = null;
                tail = null;
            } else {

                tail = tail.prev;
                tail.next = null;

            }

            size--;


        }

        void deleteAtAnyIndex(int idx) {

            if (idx < 0 || idx == size) {
                throw new IndexOutOfBoundsException(" No index  to delete ");
            }

            if (idx == 0) {
                deleteHead();
            } else if (idx == size - 1) {

                deleteTail();
            } else {

                Node temp = head;

                for (int i = 0; i < idx - 1; i++) {

                    temp = temp.next;

                }

                Node nodeToDelete = temp.next;
                temp.next = nodeToDelete.next;
                nodeToDelete.next.prev = temp;


            }

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



        Dll doubly = new Dll();
        doubly.insertAtTail(10);
        doubly.insertAtTail(20);
        doubly.insertAtTail(30);
        doubly.insertAtTail(40);
        doubly.display();
        doubly.insertAtHead(50);
        doubly.display();
        doubly.insertAtAnyIndex(3, 100);
        doubly.display();
        doubly.insertAtAnyIndex(0, 300);
        doubly.display();
        doubly.deleteTail();
        doubly.display();
        doubly.deleteHead();
        doubly.display();
        doubly.deleteAtAnyIndex(3);
        doubly.display();


    }



}
