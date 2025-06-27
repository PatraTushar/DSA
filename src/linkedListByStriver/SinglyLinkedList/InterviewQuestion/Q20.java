package linkedListByStriver.SinglyLinkedList.InterviewQuestion;

public class Q20 {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

   public static Node rev(Node head){

        Node curr=head;
        Node prev=null;
        Node agla;

        while (curr!=null){

            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;

        }

        return prev;
    }


    static boolean isPalindromeLL(Node head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node temp=rev(slow.next);
        slow.next=temp;

        Node p1=head;
        Node p2=slow.next;

        while ( p2!=null){

            if(p1.data!=p2.data) return false;

            p1=p1.next;
            p2=p2.next;
        }

        return true;


    }

    public static void main(String[] args) {

        // Q: palindrome linked list (leeTCode-->234)

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(isPalindromeLL(a));


    }
}
