package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q3 {

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

    static Node nthNodeFromLast(Node head,int n){

        Node slow=head;
        Node fast=head;

        for(int i=0;i<n;i++){

            fast=fast.next;
        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }



    public static void main(String[] args) {

        // Q: finding nth node from the end of linked list(in one traversal)

        Node a=new Node(100);
        Node b=new Node(13);
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

        Node ans=nthNodeFromLast(a,3);
        System.out.println(ans.data);


    }
}
