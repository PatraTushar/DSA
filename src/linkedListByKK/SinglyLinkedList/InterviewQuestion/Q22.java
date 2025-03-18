package linkedListByKK.SinglyLinkedList.InterviewQuestion;

import OopsByKK.AccessModifier.Public.A;

public class Q22 {

    public static class Node{

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

    static Node oddEvenLL(Node head){

        if(head==null || head.next==null) return head;

        Node temp=head;
        Node odd=new Node(0);
        Node even=new Node(0);
        Node tempO=odd;
        Node tempE=even;

        while (temp!=null){


            tempO.next=temp;
            temp=temp.next;
            tempO=tempO.next;

            tempE.next=temp;
            if(temp==null) break;
            temp=temp.next;
            tempE=tempE.next;
        }

        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }

    public static void main(String[] args) {

        // Q: Odd even linked list (leeTCode-->328)

        Node a=new Node(10);
        Node b=new Node(11);
        Node c=new Node(1);
        Node d=new Node(4);
        Node e=new Node(6);
        Node f=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        Node Ans=oddEvenLL(a);
        display(Ans);


    }
}
