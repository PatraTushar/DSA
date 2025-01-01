package LINKEDLIST;

public class Q12 {

    static void display(Node head){

        Node temp=head;

        while(temp!=null ){

            System.out.print(temp.data + " ");
            temp=temp.next;

        }

    }

    public static Node oddEvenSequence(Node head){

        Node temp=head;

        Node o=new Node(-1);
        Node tempO=o;

        Node e=new Node(0);
        Node tempe=e;

        while(temp!=null && temp.next!=null){

            if(temp.data %2 !=0){

                Node a=new Node(temp.data);
                tempO.next=a;
                tempO=tempO.next;
                temp=temp.next;
            }

            else{

                Node a=new Node(temp.data);
                tempe.next=a;
                tempe=tempe.next;
                temp=temp.next;
            }


        }

        o=o.next;
        e=e.next;

        if(temp.data%2!=0){
            tempO.next=e;
        }

        else{
            tempe.next=o;
        }



//        tempO.next=e;

        return o;

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
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(1);
        Node e=new Node(2);
        Node f=new Node(8);
        Node g=new Node(10);
        Node h=new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        Node ans=oddEvenSequence(a);
        display(ans);




    }
}
