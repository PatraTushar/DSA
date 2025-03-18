package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q19 {

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
    static Node reverseALL(Node head){

        Node curr=head;
        Node prev=null;
        Node agla=null;

        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }

        return prev;
    }

    public static void main(String[] args) {

        // Q: Reverse a linked list (Iterative)  (leeTCode-->206)

        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        Node rev=reverseALL(a);
        display(rev);



    }
}
