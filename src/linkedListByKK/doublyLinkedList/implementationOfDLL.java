package linkedListByKK.doublyLinkedList;


public class implementationOfDLL {

    public static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node insertAtHead(Node head, int val) {

        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;

        return head;
    }

    static Node insertAtTail(Node head, int val) {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;


        return head;


    }

    static void insertAtAnyIndex(Node head, int index, int val) {

        Node temp = head;

        if (index < 0) {
            System.out.println(" invalid index ");
        }

        for (int i = 0; i < index - 1; i++) {

            temp = temp.next;
        }


        Node t = new Node(val);

        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;

    }

    static Node deleteHead(Node head){

        if(head==null) return null;
        head=head.next;
        head.prev=null;
        return head;

     }


     static void deleteTail(Node head){

         Node temp=head;

         while (temp.next!=null){
             temp=temp.next;
         }

         // temp=tail;       if tail is given
         temp=temp.prev;
         temp.next=null;



     }

     static void deleteAtAnyIndex(Node head,int index){

        Node temp=head;

        for(int i=0;i<index-1;i++){

            temp=temp.next;
        }

        temp.next=temp.next.next;
        temp.next.prev=temp;



     }










    public static void main(String[] args) {

        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        display(a);
//        Node newHead=insertAtHead(a,40);
//        display(newHead);
//        Node newTail=insertAtTail(a,100);
//        display(newTail);
//        insertAtAnyIndex(a,2,200);
//        display(a);

//       Node deleteH= deleteHead(a);
//       display(deleteH);

//        deleteTail(a);
//        display(a);


        deleteAtAnyIndex(a,2);
        display(a);

    }
}
