import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q6;

public class myPractice {


    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    static void display(ListNode head) {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static ListNode deleteNthNode(ListNode head, int n) {



    }


    public static void main(String[] args) {

        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node h = new Node(90);
        Node i = new Node(9);
        h.next = i;
        i.next = e;


        display(a, h);
        Node Ans = findIntersection(a, h);
        System.out.println(" Intersection of both linked list is " + Ans.data);

    }

}





