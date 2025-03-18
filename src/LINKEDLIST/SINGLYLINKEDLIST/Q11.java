package LINKEDLIST;

public class Q11 {

    static void display(Node head){

         Node temp=head;

        while(temp!=null){

            System.out.print(temp.data + " ");
            temp=temp.next;

        }

    }




    public static Node mergeSort(Node h1,Node h2){

        Node t1=h1;
        Node t2=h2;

        Node h=new Node(100);
        Node t=h;

        while(t1!=null && t2!=null){

            if(t1.data<t2.data){

                t.next=t1;
                t=t1;
                t1=t1.next;
            }

            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }

        if(t1==null){
            t.next=t2;

        }

        else{
            t.next=t1;
        }

        return h.next;
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
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(8);
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        Node p=new Node(2);
        Node q=new Node(4);
        Node r=new Node(6);
        Node s=new Node(7);

        p.next=q;
        q.next=r;
        r.next=s;

        Node ans=mergeSort(a,p);
        display(ans);



    }
}
