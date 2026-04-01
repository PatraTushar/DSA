package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q21 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode agla;

        while (curr != null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        return prev;
    }

    static ListNode findLeftMiddle(ListNode head) {

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;


        }


        if (fast == null) return prev;

        return slow;

    }


    static int maxTwinSum(ListNode head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        ListNode leftMiddle = findLeftMiddle(head);

        leftMiddle.next = reverse(leftMiddle.next);

        ListNode ptr1 = head;
        ListNode ptr2 = leftMiddle.next;

        int maxTwin = 0;

        while (ptr2 != null) {

            int sum = ptr1.val + ptr2.val;

            if (sum > maxTwin) maxTwin = sum;

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }


        return maxTwin;

    }

    public static void main(String[] args) {

        // Q: Find the maximum twin sum of a linked list of even length (leeTCode-->2130)
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        int Ans = maxTwinSum(a);
        System.out.println(Ans);


    }
}
