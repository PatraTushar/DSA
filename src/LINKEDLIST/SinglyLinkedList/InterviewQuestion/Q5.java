package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q5 {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static void display(Node head){

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static Node deleteNthNodeFromEnd(Node head,int n){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if(n==0){
            throw new NullPointerException(" Not possible ");
        }

        Node slow=head;
        Node fast=head;

        for(int i=0;i<n;i++) {

            fast = fast.next;
        }


            if (fast == null) {
                return head.next;
            }

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;



        return head;



    }

    public static void main(String[] args) {

      // Q: Delete nth node from end of the linked list(in one traversal)  here head node is deleted  (leeTCode->237)

        Node a=new Node(100);
        Node b=new Node(15);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);

//        Node node3rd=deleteNthNode(a,3);
//        display(node3rd);

        Node node6th=deleteNthNodeFromEnd(a,4);
        display(node6th);


    }
}
