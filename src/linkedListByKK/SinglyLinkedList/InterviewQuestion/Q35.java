package linkedListByKK.SinglyLinkedList.InterviewQuestion;

public class Q35 {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteMiddle(Node head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        // for even right middle

        Node slow = head;
        Node fast = head;

        if(fast==null) return null;
        if (fast.next==null) return head;
        fast=fast.next.next;

        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null && slow.next != null) slow.next = slow.next.next;

        return head;
    }

    static void display(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        Node Ans = deleteMiddle(a);
        display(Ans);


    }
}
