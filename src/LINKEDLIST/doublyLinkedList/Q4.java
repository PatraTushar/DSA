package LINKEDLIST.doublyLinkedList;

public class Q4 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static Node deleteHead(Node head){


        if(head==null || head.next==head) return null;

        Node temp=head;

        while (temp.next!=head){
            temp=temp.next;
        }

        temp.next=head.next;

        return head.next;



    }

    static void display(Node head){

        Node temp=head.next;
        System.out.print(head.data +" ");
        while (temp!=head){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }



        System.out.println();
    }

    public static void main(String[] args) {

        // only head is given of circular linked list . Delete the Head


        Node a=new Node(1);
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(3);
        Node e=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;

        display(a);
        Node Ans=deleteHead(a);
        display(Ans);






    }
}
