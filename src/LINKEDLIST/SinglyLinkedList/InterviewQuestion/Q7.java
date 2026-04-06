package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q7 {

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

    static ListNode findRightMiddle(ListNode head) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        if (head == null) return null;


        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {


            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {

        // Q: find middle element of linked list for odd and right middle for even  (leeTCode->876)

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
        ListNode Ans = findRightMiddle(a);
        System.out.println(Ans.val);


    }
}
