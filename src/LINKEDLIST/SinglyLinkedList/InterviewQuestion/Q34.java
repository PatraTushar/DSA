package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q34 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    static int lengthOfALoop(ListNode head) {

        //Time Complexity: O(n)
        //Space Complexity: O(1)

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int length = 1;
                ListNode temp = slow.next;

                while (temp != slow) {

                    length++;
                    temp = temp.next;
                }

                return length;


            }
        }

        return 0;

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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = c;

        System.out.println(lengthOfALoop(a));

    }
}
