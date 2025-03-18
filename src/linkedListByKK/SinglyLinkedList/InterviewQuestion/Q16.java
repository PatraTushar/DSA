package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q16 {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static void display(Node head){

        Node temp=head;

        System.out.println(" original linked list ");
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }

    static void oddEvenLL(Node head){

        Node temp=head;
        Node oddList=new Node(0);
        Node evenList=new Node(0);
        Node o=oddList;
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





    }

    public static void main(String[] args) {

        // Q: odd even linked list

        Node a=new Node(2);
        Node b=new Node(1);
        Node c=new Node(3);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(4);
        Node g=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);


    }
}
