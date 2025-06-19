import OopsByKK.AccessModifier.Public.A;
import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q14;
import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q15;


public class myPractice {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static void display (Node head){

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

    }

    static void oddEvenSplit(Node head){

        Node odd=new Node(-1);
        Node even=new Node(-1);

        Node o1=odd;
        Node e1=even;
        Node temp=head;

        while (temp!=null){

            if(temp.data%2!=0){

                o1.next=temp;
                o1=temp;



            }

            else {

                e1.next=temp;
                e1=temp;



            }

            temp=temp.next;
        }


       o1.next=null;
        e1.next=null;

        o1=odd.next;
        e1=even.next;

        display(o1);
        System.out.println();
        display(e1);




    }













        public static void main(String[] args){

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
            System.out.println();
            oddEvenSplit(a);

        }

    }