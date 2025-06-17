
public class myPractice {


    public static class Node {

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

            Node newNode = new Node(data);
            Node temp = head;

            if (idx < 1 && idx == size + 1) {

                throw new IndexOutOfBoundsException(" wrong index ");

            }

            if (idx == 1) {
                insertAtHead(data);
                return;

            }

            else {


                for (int i = 1; i < idx - 1; i++) {

                    temp = temp.next;
                }

                Node storeAfterNode = temp.next;
                temp.next = newNode;
                newNode.next = storeAfterNode;
            }

            size++;


        }

        int getAt(int idx){

            Node temp=head;

            if(idx<1 || idx>size){

                throw new IndexOutOfBoundsException(" wrong index ");

            }

            for(int i=1;i<idx;i++){
                temp=temp.next;

            }

            return temp.data;
        }


    }

    public static void main(String[] args) {

    }


}