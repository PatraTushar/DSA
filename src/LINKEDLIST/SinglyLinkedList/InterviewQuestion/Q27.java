package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q27 {

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

    static ListNode reverseBetween(ListNode head, int left, int right) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {

            temp = temp.next;
        }


        ListNode curr = temp.next;
        ListNode prev = null;
        ListNode agla;
        ListNode tail = curr;

        for (int i = 0; i < right - left + 1; i++) {

            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        temp.next = prev;
        tail.next = curr;

        return dummy.next;

    }

    public static void main(String[] args) {

        // Q: reverse linked list II (leeTCode->92)

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);

        ListNode Ans = reverseBetween(a, 2, 4);
        display(Ans);

    }
}
