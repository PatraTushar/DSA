package linkedListByStriver.SinglyLinkedList.Basics;

public class displayingALL {

    static void displayLL(Node head){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();



    }

    static void displayLLRec(Node temp){

        if(temp==null) return;

        System.out.print(temp.data +" ");
        displayLLRec(temp.next);


    }

    static int lengthMethod(Node head){

        int length=0;

        while (head!=null){
            length++;
            head=head.next;

        }

        return length;
    }

    static int lengthRec(Node head,int length){



        if(head==null) return length;

       return lengthRec(head.next,length+1);

    }



    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static void main(String[] args) {

        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        displayLL(a);
        displayLLRec(a);
        System.out.println();
        int length=lengthMethod(a);
        System.out.println(length);
        int lengthRec=lengthRec(a,0);
        System.out.println(lengthRec);









    }
}
