package LINKEDLIST.CIRCULARLINKEDLIST;

public class circularLL {



    public static void printList(Node head){


       if(head==null) return;

        System.out.print(head.data +" ");

        Node temp=head.next;

        while(temp!=head){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }




    }

    public static class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }


    public static void main(String[] args) {

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

        printList(a);



    }
}
