package LINKEDLIST.SinglyLinkedList.Basics;

public class implementationOfLL {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static class LinkedList {

        ListNode head = null;
        ListNode tail = null;
        int size = 0;

        void insertAtTail(int data) {

            ListNode newListNode = new ListNode(data);

            if (head == null) {

                head = newListNode;

            } else {

                tail.next = newListNode;

            }

            tail = newListNode;
            size++;

        }

        void insertAtHead(int data) {

            ListNode newListNode = new ListNode(data);

            if (head == null) {
                head = newListNode;
                tail = newListNode;
            } else {

                newListNode.next = head;
                head = newListNode;


            }

            size++;
        }


        void insert(int idx, int data) {

            if(idx<0 || idx>size){

                throw new IndexOutOfBoundsException(" invalid index ");

            }

            if(idx==0){

                insertAtHead(data);
                return;
            }

            if(idx==size){
                insertAtTail(data);
                return;
            }



            ListNode newListNode =new ListNode(data);
            ListNode temp=head;

            for(int i=0;i<idx-1;i++){

                temp=temp.next;

            }

            ListNode afterListNode =temp.next;
            temp.next= newListNode;
            newListNode.next= afterListNode;

            size++;

        }

       public int getAt(int idx){

            ListNode temp=head;

            if(idx<0 || idx==size){

                throw new IndexOutOfBoundsException(" invalid index ");

            }

            for(int i=0;i<idx;i++){
                temp=temp.next;

            }

            return temp.val;
        }

       public void delete(int idx){

            ListNode temp=head;

            if(idx<0 || idx==size){
                throw new IndexOutOfBoundsException(" invalid index ");
            }

            if(idx==0){
                head=head.next;

                if(head==null){
                    size--;
                    return ;
                }

                size--;
                return;
            }

            for(int i=0;i<idx-1;i++){

                temp=temp.next;
            }

            temp.next=temp.next.next;
            size--;


        }

        void display(){

            ListNode temp=head;

            while (temp!=null){
                System.out.print(temp.val +" ");
                temp=temp.next;
            }

            System.out.println();
        }



    }

    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.insertAtTail(10);
        ll.insertAtTail(20);
        ll.insertAtTail(30);
        ll.insertAtTail(40);
        ll.insertAtTail(50);
        ll.display(); // 10 20 30 40 50
        ll.insertAtHead(100);
        ll.display(); //100 10 20 30 40 50
        ll.insert(3,500);
        ll.display();  //100 10 20 500 30 40 50
        System.out.println(ll.getAt(4)); //30
        ll.delete(5);
        ll.display();  // 100 10 20 500 30 50




    }



}
