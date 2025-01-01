package LINKEDLIST;

public class Q17 {

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

    public static int twinSum(Node head){

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;

        }

        Node temp=reverse(slow.next);
        slow.next=temp;
        int maxSum=0;

        Node h1=head;
        Node h2=slow.next;

        while(h2!=null){

            int ans=h1.data+h2.data;

            if(ans>maxSum){
                maxSum=ans;

            }

            h1=h1.next;
            h2=h2.next;
        }

        return maxSum;






    }

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

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

        int finalAns=twinSum(a);
        System.out.println(finalAns);




    }
}
