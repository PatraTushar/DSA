package linkedListByStriver.SinglyLinkedList.InterviewQuestion;

public class Q21 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static Node reverse(Node head){

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

    static int maxTwinSum(Node head){

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        Node slow=head;
        Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node storeNode=reverse(slow.next);
        slow.next=storeNode;

        Node p1=head;
        Node p2=slow.next;
        int max=Integer.MIN_VALUE;

        while (p2!=null){

            if((p1.data + p2.data) >max){
                max=(p1.data + p2.data);
            }

            p1=p1.next;
            p2=p2.next;


        }

        return max;


    }

    public static void main(String[] args) {

        // Q: Find the maximum twin sum of a linked list of even length (leeTCode-->2130)
        Node a=new Node(1);
        Node b=new Node(10);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        int Ans=maxTwinSum(a);
        System.out.println(Ans);



    }
}
