package Recursion.CodeWithMik;

import java.util.ArrayList;

public class Q5 {


    public static class Node {

        int val;
        Node prev;
        Node next;
        Node child;

        Node(int val) {

            this.val = val;
        }
    }


    static Node flatten(Node head) {

        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child != null) {
                Node temp = flatten(curr.child);
                curr.next = temp;
                temp.prev = curr;

                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = next;
                if (next != null) next.prev = temp;

            }

            curr.child = null;
            curr = next;
        }

        return head;


    }

    static void flattenI(Node head) {


    }


    public static void main(String[] args) {

        // leeTCode->430

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(11);
        Node g = new Node(12);
        Node h = new Node(9);
        Node i = new Node(10);
        Node j = new Node(4);
        Node k = new Node(5);
        Node l = new Node(6);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.child = d;
        c.next = j;
        d.next = e;
        e.prev = d;
        e.child = f;
        e.next = h;
        f.next = g;
        g.prev = f;
        h.prev = e;
        h.next = i;
        i.prev = h;
        j.prev = c;
        j.next = k;
        k.prev = j;
        k.next = l;
        l.prev = k;

    }
}
