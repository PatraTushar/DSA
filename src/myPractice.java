public class myPractice {

    public static class Node {

        int val;
        Node next;

        Node(int data) {
            this.val = data;
        }
    }

    static void display(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    static void oddEvenSplit(Node head) {

        Node temp = head;
        Node dummyOdd = new Node(101);
        Node odd = dummyOdd;
        Node dummyEven = new Node(100);
        Node even = dummyEven;

        while (temp != null) {

            if (temp.val % 2 != 0) {

                odd.next = temp;
                odd = temp;

            } else {

                even.next = temp;
                even = temp;

            }

            temp = temp.next;
        }


        odd.next=null;
        even.next=null;

        display(dummyOdd.next);
        display(dummyEven.next);


    }

    public static void main(String[] args) {


        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println(" original list ");
        display(a);
        oddEvenSplit(a);


    }
}




