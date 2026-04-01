package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q29 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Reverse a linked list from head to tail
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode agla;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;
    }

    // Reverse every k nodes
    static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode groupStart = head;

        while (true) {
            ListNode kth = groupStart;
            for (int i = 1; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break; // less than k nodes left

            ListNode nextGroup = kth.next;
            kth.next = null; // cut current group

            // Reverse current group
            prevGroupEnd.next = reverse(groupStart);

            // Connect reversed group to next
            groupStart.next = nextGroup;

            // Move pointers for next iteration
            prevGroupEnd = groupStart;
            groupStart = nextGroup;
        }

        return dummy.next;
    }

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        int k = 3;

        display(a);
        ListNode ans = reverseKGroup(a, k);
        display(ans);
    }
}