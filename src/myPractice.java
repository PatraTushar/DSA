import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q1;

public class myPractice {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }

    static Node deleteNthNodeFromEnd(Node head,int n){

        Node slow=head;
        Node fast=head;

        if(n==0){
            throw new NullPointerException(" Not possible ");
        }

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;
        }

        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return head;
    }


    static void display(Node head){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();


    }


    public static void main(String[] args) {


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
        Node nth=deleteNthNodeFromEnd(a,4);
        display(nth);






    }

}