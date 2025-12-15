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

        // Time Complexity: O(n)     n = total nodes in all levels.
        //Space Complexity: O(d)     d = maximum depth of child lists.

        Node curr = head;

        while (curr != null) {

            if (curr.child == null) {

                curr = curr.next;


            } else {

                Node child = flatten(curr.child);
                curr.child = null;

                Node next = curr.next;
                curr.next = child;
                child.prev = curr;


                Node lastChildNode = child;
                while (lastChildNode.next != null) {

                    lastChildNode = lastChildNode.next;
                }

                lastChildNode.next = next;

                if (next != null) next.prev = lastChildNode;
                curr = next;


            }


        }

        return head;


    }


    static void display(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        // leeTCode->430

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);



        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        c.child = f;
        f.next = g;
        g.prev = f;
        g.child = i;
        i.next = j;
        j.prev = i;
        g.next = h;
        h.prev = g;
        d.next = e;
        e.prev = d;

        display(a);
        flatten(a);
        display(a);


    }
}
