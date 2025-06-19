


public class myPractice {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }
    }


    static void display(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;

        }

        System.out.println();

    }

    static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node agla;

        while (curr != null) {

            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;


    }


    static int twinSum(Node head) {


        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        Node storeNode = reverse(slow.next);
        slow.next = storeNode;

        Node pointer1 = head;
        Node pointer2 = slow.next;
        int sum = 0;

        while (pointer2 != null) {

            if ((pointer1.data + pointer2.data) > sum) {
                sum = pointer1.data + pointer2.data;
            }

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return sum;


    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println(twinSum(a));


    }

}