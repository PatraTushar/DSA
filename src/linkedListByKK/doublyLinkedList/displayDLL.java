package linkedListByKK.doublyLinkedList;

public class displayDLL {

    public static class Node{

        Node prev;
        int data;

        Node next;

        Node(int data){
            this.data=data;
        }

    }


    static void display(Node head){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }

        System.out.println();
    }


    /// if random node is given how to display the list
    static void display2(Node random){

        Node temp=random;

        while (temp.prev!=null){
            temp=temp.prev;
        }

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }

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
        display2(a);
    }
}
