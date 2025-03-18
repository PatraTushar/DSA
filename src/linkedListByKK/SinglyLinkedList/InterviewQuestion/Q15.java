package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q15 {

    public static class Node{

        int data;
        Node next;

        Node(int data){

            this.data=data;
        }

    }

    static void display(Node head){
        Node temp=head;
        System.out.println(" original list ");
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void oddEvenSplit(Node head){

        Node temp=head;

        Node oddList=new Node(0);
        Node o=oddList;

        Node evenList=new Node(0);
        Node e=evenList;

        while (temp!=null){

            Node newNode=new Node(temp.data);
            if(temp.data%2!=0){
                o.next=newNode;
                o=newNode;
            }

            else {
                e.next=newNode;
                e=newNode;

            }

            temp=temp.next;
        }

        o=oddList.next;
        e=evenList.next;

        System.out.println(" Odd linked list ");
        while (o!=null){
            System.out.print(o.data +" ");
            o=o.next;
        }

        System.out.println();
        System.out.println(" Even linked list");
        while (e!=null){
            System.out.print(e.data +" ");
            e=e.next;
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

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        display(a);
        oddEvenSplit(a);
    }
}
