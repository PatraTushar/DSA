package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q28 {


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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }

    static Node reverse(Node head){

        if(head==null || head.next==null) return head;

        Node curr=head;
        Node prev=null;
        Node agla=null;

        while (curr!=null){

            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;

        }

        return prev;

    }

    static void reorderSet(Node head){

        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

       Node reverse2ndHalf=reverse(slow.next);
        slow.next=reverse2ndHalf;

        Node t1=head;
       Node t2=reverse2ndHalf;


        while (t2!=null){
            slow.next=t2.next;
            t2.next=t1.next;
            t1.next=t2;
            t1=t2.next;
            if(t1 == null) break;
            t2=slow.next;
        }

        display(head);


    }

    public static void main(String[] args) {

        // Q: Reorder list (leeTCode->143)

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);


        reorderSet(a);



    }
}
