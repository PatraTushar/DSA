package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q4 {

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

    static void deleteNthNodeFromEnd(Node head,int n){

        Node slow=head;
        Node fast=head;


        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if (fast == null) {
            System.out.println("Cannot delete head node in this implementation");
            return;
        }


        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
    }

    public static void main(String[] args) {

        // Q: Delete nth node from end of the linked list(in one traversal)  here head node cant be deleted

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
        deleteNthNodeFromEnd(a,1);
        display(a);








    }
}
