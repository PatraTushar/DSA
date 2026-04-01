package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q28 {


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

    static ListNode reverse(ListNode head) {

        if (head == null || head.next == null) return head;

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


    static void reorderSet(ListNode head) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        ListNode middle = findLeftMiddle(head);

        ListNode second = reverse(middle.next);

        middle.next = null;


        ListNode first = head;


        ListNode temp1, temp2;


        while (second != null) {

            temp1 = first.next;
            temp2 = second.next;


            first.next = second;
            second.next = temp1;


            first = temp1;
            second = temp2;

        }


    }

    public static void main(String[] args) {

        // Q: Reorder list (leeTCode->143)

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);


        reorderSet(a);


    }
}
