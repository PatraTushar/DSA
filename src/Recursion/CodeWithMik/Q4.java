package Recursion.CodeWithMik;

import java.util.ArrayList;
import java.util.Collections;


public class Q4 {


    public static class Node {

        int data;
        Node next;
        Node child;

        Node(int data) {

            this.data = data;
        }
    }


    static Node convert(ArrayList<Integer> list) {

        if (list.size() == 0) return null;

        Node head = new Node(list.get(0));
        Node temp = head;

        for (int i = 1; i < list.size(); i++) {

            temp.child = new Node(list.get(i));
            temp = temp.child;

        }

        return head;

    }

    // BRUTE FORCE APPROACH
    static Node flatten(Node head) {

        // Time Complexity: O(n) + O(n log n) + O(n)=O(n log n)
        //Space Complexity: O(n)

        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {

            Node t2 = temp;

            while (t2 != null) {

                list.add(t2.data);
                t2 = t2.child;

            }

            temp = temp.next;


        }


        Collections.sort(list);


        return convert(list);


    }


    // OPTIMAL APPROACH
    static Node flattenI(Node head) {

        // Time Complexity: O(n)
        //Space Complexity: O(1)

        if (head == null || head.next == null) return head;

        Node mergeHead = flattenI(head.next);

        return merge(mergeHead, head);


    }


    static Node merge(Node head1, Node head2) {

        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(-1);
        Node d1 = dummy;

        while (temp1 != null && temp2 != null) {

            if (temp1.data < temp2.data) {

                d1.child = temp1;
                d1 = d1.child;
                temp1 = temp1.child;

            } else {

                d1.child = temp2;
                d1 = d1.child;
                temp2 = temp2.child;

            }

            d1.next = null;

        }

        if (temp1 != null) d1.child = temp1;

        else d1.child = temp2;

        return dummy.child;


    }


    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
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


        a.child = null;
        a.next = b;
        b.child = c;
        c.child = null;
        b.next = d;
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

        Node ans = flatten(a);
        display(ans);

        Node result = flattenI(a);
        display(result);

    }
}
