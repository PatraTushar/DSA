package linkedListByKK.circularLinkedList;

public class displayCLL {

   public static class Node{

       int data;
       Node next;

       Node(int data){
           this.data=data;
       }

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

       Node a=new Node(10);
       Node b=new Node(45);
       Node c=new Node(34);
       Node d=new Node(26);
       Node e=new Node(55);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=a;

       display(a);


    }
}
