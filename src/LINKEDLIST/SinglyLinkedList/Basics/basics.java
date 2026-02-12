package LINKEDLIST.SinglyLinkedList.Basics;


public class basics {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        a.next=b;  //5-->3
        b.next=c;  //5-->3-->9
        c.next=d;   //5-->3-->9-->8
        d.next=e;  // //5-->3-->9-->8-->16

        System.out.println(a.next.data);


    }
}
