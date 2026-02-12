package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q2 {

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

    static Node nthNodeFromEnd(Node head,int n){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }

        temp=head;

        int fromStart=size-n+1;

        for(int i=0;i<fromStart-1;i++){
            temp=temp.next;

        }

        return temp;


    }



    public static void main(String[] args) {

        // Q: finding nth node from the end of linked list

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

        Node ans=nthNodeFromEnd(a,4);
        System.out.println(ans.data);


    }
}
