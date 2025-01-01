package LINKEDLIST;

public class Q3 {

    public static Node nthFromLast(Node head,int n){

        Node slow=head;
        Node fast=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        while(fast!=null){

            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);

        //100-->13-->4-->5-->12-->10
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node ans=nthFromLast(a,4);
        System.out.println(ans.data);


    }
}
