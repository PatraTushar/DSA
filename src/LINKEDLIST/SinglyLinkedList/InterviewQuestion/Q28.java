package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

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

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)



        Node slow=head;
        Node fast=head;


        while ( fast.next!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }


        Node rev2ndHalf=reverse(slow.next);
        slow.next=null;

        Node pointer1=head;
        Node pointer2=rev2ndHalf;



        while (pointer1 != null &&pointer2!=null){

            Node temp1 = pointer1.next;
            Node temp2 = pointer2.next;

            pointer1.next = pointer2;
            pointer2.next = temp1;

            pointer1 = temp1;
            pointer2 = temp2;




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
