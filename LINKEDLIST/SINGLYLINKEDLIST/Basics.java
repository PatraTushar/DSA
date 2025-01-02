package LINKEDLIST;

public class Basics {

    static int length(Node a){

        Node temp=a;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    static void displayRecursively(Node head){

        if(head==null){
            return;
        }

        System.out.print(head.data +" ");
        displayRecursively(head.next);
    }

    public static void insertAtEnd(Node head,int value){                 //only head is given

        Node temp=new Node(value);
            Node t = head;
            while(t.next!=null){

                t = t.next;

            }

            t.next=temp;
        }





    static void display(Node head){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }

    public static class Node{

        int data;                             //value
        Node next;                //store address of the next node

        Node(int data){

            this.data=data;

        }
    }



    public static void main(String[] args) {

        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(18);

       // 5-->3-->9-->8-->16

        a.next=b;    //5-->3
        b.next=c;    //5-->3-->9
        c.next=d;    //5-->3-->9-->8
        d.next=e;    //5-->3-->9-->8-->16

        insertAtEnd(a,87);
        display(a);
        System.out.println();




         //display  (1 method)

//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);


        //display (2 method)   using a

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);


        //using for loop

//        Node temp=a;
//        for(int i=0;i<=4;i++){
//
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//
//        }


        //using while loop

//        Node temp=a;
//        while(temp!=null){
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }


        // using function

       // display(a);


        //recursively

        // displayRecursively(a);

        //Length method

        System.out.println(" length is " +length(a));










    }
}
