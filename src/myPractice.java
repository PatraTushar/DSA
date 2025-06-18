

public class myPractice {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }
    }









    public static void main(String[] args) {

        Node a=new Node(87);
        Node b=new Node(100);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(12);
        Node g=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        Node h=new Node(90);
        Node i=new Node(9);
        h.next=i;
        i.next=e;














    }

}