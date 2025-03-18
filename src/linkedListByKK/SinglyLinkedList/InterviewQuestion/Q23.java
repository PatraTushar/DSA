package linkedListByKK.SinglyLinkedList.InterviewQuestion;

import OopsByKK.AccessModifier.Public.A;

public class Q23 {

    public static class Node{

        int data;
        Node next;
        Node random;

        Node(int data){
            this.data=data;
        }
    }

    static void display(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node randomPointer(Node head){

        // Deep copy

        Node h=new Node(0);
        Node t1=head;
        Node t2=h;

        while (t1!=null){
            Node a=new Node(t1.data);
            t2.next=a;
            t1=t1.next;
            t2=a;
        }

        h=h.next;
        t1=head;
        t2=h;

        // Alternate connection

        Node temp=new Node(-1);

        while (t1!=null){
            temp.next=t1;
            t1=t1.next;
            temp=temp.next;

            temp.next=t2;
            t2=t2.next;
            temp=temp.next;
        }

        t1=head;
        t2=h;


        // Assigning random pointers

        if (t1.random==null){
            t2.random=null;
        }
        else {
            t2.random = t1.random.next;
            t1=t1.next.next;
           if(t1!=null) t2=t2.next.next;
        }


        t1=head;
        t2=h;

        // separating the values

        while (t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if (t1==null) break;
            t2.next=t1.next;
            if (t2.next==null) break;
            t2=t2.next;
        }

        return h;




    }

    public static void main(String[] args) {

        // Q: copy list with random Pointer (leeTCode-->138)

        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        a.random=null;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;

        display(a);
        Node Ans=randomPointer(a);
        display(Ans);




    }
}
