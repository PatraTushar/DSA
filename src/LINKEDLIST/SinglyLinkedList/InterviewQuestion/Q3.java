package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q3 {

    // same as Q2

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

    static ListNode nthNodeFromLast(ListNode head, int n) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if (head == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input: List is empty or n is non-positive.");
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {

            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


    public static void main(String[] args) {

        // Q: finding nth node from the end of linked list(in one traversal)

        ListNode a = new ListNode(100);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);

        ListNode ans = nthNodeFromLast(a, 3);
        System.out.println(ans.val);


    }
}
