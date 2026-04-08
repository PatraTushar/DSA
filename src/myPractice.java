import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q23;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q25;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q27;

public class myPractice {


    public static class ListNode {

        int val;
        ListNode next;

        ListNode random;


        ListNode(int val) {
            this.val = val;
        }
    }

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


    static void display(ListNode head) {


        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
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


    static ListNode fun(ListNode head, int left, int right) {

        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = temp.next;
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

        ListNode Ans = fun(a, 2, 4);
        display(Ans);


    }
}





