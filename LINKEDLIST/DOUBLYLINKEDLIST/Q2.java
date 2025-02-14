package LINKEDLIST.DOUBLYLINKEDLIST;

public class Q2 {

    public static void twoSum(Node head,int target){

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        Node tail=temp;

        Node h=head;
        Node t=tail;



        while(h.data<t.data){

            int sum=h.data+t.data;
            if(sum==target){
                System.out.println(" pair found ("+h.data+ ","  +t.data+")");
                return;
            }

            else if(sum>target){
                t=t.prev;


            }

            else{
                h=h.next;

            }
        }

        System.out.println(" No pair found ");


    }

    public static class Node{

        Node prev;
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(8);
        Node d=new Node(13);
        Node e=new Node(100);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        int target=16;
        twoSum(a,target);




    }
}
