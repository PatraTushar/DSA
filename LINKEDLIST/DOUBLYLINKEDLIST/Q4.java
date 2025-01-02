package LINKEDLIST.DOUBLYLINKEDLIST;

public class Q4 {

    public static void printList(Node head){

        Node temp=head;
        while(temp!=null){

            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node flatten(Node head){

        Node temp=head;

        while(temp!=null){

            Node t=temp.next;

            if(temp.child!=null){
                Node c=flatten(temp.child);
                temp.next=c;
                c.prev=temp;

                while(c.next!=null){
                    c=c.next;
                }

                c.next=t;
              if(t!=null)  t.prev=c;

            }

            temp.child=null;
            temp=t;
        }

        return head;
    }

    public static class Node{

        Node prev;
        int data;
        Node next;

        Node child;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        Node j=new Node(10);
        Node k=new Node(11);
        Node l=new Node(12);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        c.child=g;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        g.next=h;
        h.prev=g;
        h.next=i;
        i.prev=h;
        i.next=j;
        j.prev=i;
        h.child=k;
        k.next=l;
        l.prev=k;

        Node ans=flatten(a);
        printList(ans);




    }
}
