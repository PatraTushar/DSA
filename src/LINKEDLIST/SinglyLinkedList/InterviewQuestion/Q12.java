package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q12 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode detectCycle(ListNode head) {

        //Time Complexity: O(N)
        //Space Complexity: O(1)

        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) return null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }

        if (fast == null || fast.next == null) return null;


        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static int getIndex(ListNode head, ListNode target) {
        int index = 0; // Start indexing from 1
        ListNode temp = head;
        while (temp != null) {
            if (temp == target) return index;
            temp = temp.next;
            index++;
        }
        return -1; // Should never reach here if the node exists
    }

    public static void main(String[] args) {

        // Q:  Cycle in a linked list II (leeTCode-->142)

        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;


        ListNode e = new ListNode(1);
        ListNode f = new ListNode(2);
        e.next = f;
        f.next = e;

        ListNode g = new ListNode(1);


        ListNode Ans = detectCycle(a);


        if (Ans != null) {

            int cycleIndex = getIndex(a, Ans);

            System.out.println(" tail connects to node index " + cycleIndex);

        } else {
            System.out.println(" No cycle found ");
        }

    }
}
