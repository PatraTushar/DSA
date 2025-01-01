package LINKEDLIST;

public class Q8 {

    public static boolean cycle(Node head){

        Node slow=head;
        Node fast=head;

        if(head.next==null) return false;
        if(head==null) return false;

        while(fast!=null){

            if(slow==null) return false;
            slow=slow.next;

            if(fast.next==null) return false;
            fast=fast.next.next;

            if(slow==fast) return true;


        }

        return false;
    }

    public static class Node{

        int data;

        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {

        Node a=new Node(3);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;

        Node p=new Node(3);
        Node q=new Node(2);
        Node r=new Node(0);
        Node s=new Node(4);

       boolean ans=cycle(a);
       System.out.println(ans);


    }
}
