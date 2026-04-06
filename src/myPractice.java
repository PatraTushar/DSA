import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q20;

public class myPractice {


    public static class ListNode {

        int val;
        ListNode next;

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

    static boolean isPalindromeLL(ListNode head) {

        if (head.next == null) return true;

        ListNode leftMiddle = findLeftMiddle(head);

        leftMiddle.next = reverse(leftMiddle.next);

        ListNode slow = head;
        ListNode fast = leftMiddle.next;

        while (fast != null) {

            if (slow.val == fast.val) {
                slow = slow.next;
                fast = fast.next;
            }

            else return false;
        }

        return true;


    }


    public static void main(String[] args) {


        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(isPalindromeLL(a));
    }
}





