public class myPractice {

    public static class Node {

        int val;
        Node next;
        Node child;

        Node(int val) {

            this.val = val;
        }
    }

    static Node merge(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node p1 = dummy;

        while (temp1 != null && temp2 != null) {

            if (temp1.val < temp2.val) {

                p1.child = temp1;
                p1 = p1.child;
                temp1 = temp1.child;
            } else {

                p1.child = temp2;
                p1 = p1.child;
                temp2 = temp2.child;

            }

            p1.next = null;
        }


        if (temp1!=null)  p1.child=temp1;
        else p1.child=temp2;

        return dummy.child;




    }


    static Node flatten(Node head) {

        if (head == null || head.next == null) return head;

        Node newHead = flatten(head.next);

        return merge(head, newHead);


    }

    static void display(Node head) {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.child;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(10);
        Node d = new Node(1);
        Node e = new Node(7);
        Node f = new Node(11);
        Node g = new Node(12);
        Node h = new Node(4);
        Node i = new Node(9);
        Node j = new Node(5);
        Node k = new Node(6);
        Node l = new Node(8);


        a.next = b;
        a.child = null;
        b.next = d;
        b.child = c;
        c.child = null;
        d.child = e;
        e.child = f;
        f.child = g;
        d.next = h;
        h.child = i;
        i.child = null;
        h.next = j;
        j.child = k;
        k.child = l;
        l.child = null;

        Node head = flatten(a);
        display(head);


    }


}

