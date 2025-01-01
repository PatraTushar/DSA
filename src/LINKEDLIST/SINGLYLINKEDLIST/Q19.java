package LINKEDLIST;

public class Q19 {

    static void display(Node head){
        while (head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }

    public static class Node{

        int data;
        Node next;
        Node random;

        Node(int data){
            this.data=data;
        }


    }

    public static Node randomPointers(Node head){

        Node head2=new Node(0);
        Node t1=head;
        Node t2=head2;

        //creating deep copy        7->13->11->10->1

        while(t1!=null){

            Node t=new Node(t1.data);
            t2.next=t;
            t2=t;
            t1=t1.next;
        }
        head2=head2.next;
        t2=head2;
        t1=head;

        //alternate connection

        Node temp=new Node(-1);

        while(t1!=null) {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;

            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;

        }

        t2=head2;
        t1=head;


        //Assigning random pointers

        while(t1!=null && t2!=null){

            if(t1.random==null) t2.random=null;
            else t2.random=t1.random.next;
            t1=t1.next.next;
            if(t1!=null) t2 = t2.next.next;

        }

        t2=head2;
        t1=head;

        //separating the list

        while(t1!=null){

            t1.next=t2.next;
            t1=t1.next;
            if(t1==null) break;
            t2.next=t1.next;
            if(t2.next==null) break;
            t2=t2.next;
        }

        return head2;








    }

    public static void main(String[] args) {

        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        a.random=null;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;

        Node ans=randomPointers(a);
        display(ans);



    }
}
