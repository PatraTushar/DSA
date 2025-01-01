package LINKEDLIST;

public class Q15 {

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static Node reverse(Node head){

         Node curr=head;
         Node prev=null;
         Node agla=null;


         while(curr!=null){

             agla=curr.next;
             curr.next=prev;
             prev=curr;
             curr=agla;
         }

         return prev;

    }

    public static class  Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node ans=reverse(a);
        display(ans);




    }
}
