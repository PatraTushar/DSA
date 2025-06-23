import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q30;
import linkedListByKK.doublyLinkedList.Q1;

public class myPractice {

    public static class Node {

        Node prev;
        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }





    static void display(Node head){

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(2);
        Node d = new Node(0);
        Node e = new Node(2);
        Node f = new Node(1);
        Node g = new Node(0);
        Node h = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;





    }

}