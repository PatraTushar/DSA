package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class   Q14 {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;

        System.out.println(" linked list 1 ");
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println();

        System.out.println(" linked list 2 ");
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
        System.out.println();
    }

    static void display2(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

    }

    static Node MergeTwoLL(Node head1, Node head2) {

        //Time Complexity: O(N + M)
        //Space Complexity: O(1)

        System.out.println(" After merging ");

        Node ptr1 = head1;
        Node ptr2 = head2;
        Node dummy = new Node(100);
        Node current = dummy;


        while (ptr1 != null && ptr2 != null) {

            if (ptr1.data < ptr2.data) {

                current.next = ptr1;
                current = ptr1;
                ptr1 = ptr1.next;

            } else {

                current.next = ptr2;
                current = ptr2;
                ptr2 = ptr2.next;


            }
        }

        if (ptr1 == null) {
            current.next = ptr2;
        } else {
            current.next = ptr1;
        }

        return dummy.next;

    }


    public static void main(String[] args) {

        //  Merge 2 sorted linked list ( not using extra space i.e O(1))  Best approach

        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;

        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(6);
        Node h = new Node(7);

        e.next = f;
        f.next = g;
        g.next = h;

        display(a, e);

        Node Ans = MergeTwoLL(a, e);
        display2(Ans);


    }
}
