package LINKEDLIST;

public class Q6 {

    public static Node middleElement1(Node head){

        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;

    }

    public static Node middleElement(Node head){            // right most middle for even

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null ){

            slow=slow.next;
            fast=fast.next.next;
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

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node p=new Node(5);
        Node q=new Node(1);
        Node r=new Node(3);
        Node s=new Node(8);
        Node t=new Node(20);
        Node u=new Node(21);
        Node v=new Node(95);

        p.next=q;
        q.next=r;
        r.next=s;
        s.next=t;
        t.next=u;
        u.next=v;

       Node ans= middleElement(a);
        System.out.println(ans.data);

        Node ans1=middleElement1(a);
        System.out.println(ans1.data);


    }
}
