package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q8 {

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

    static ListNode findLeftMiddle(ListNode head) {

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) return null;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) return slow;
        return prev;
    }


    public static void main(String[] args) {

        // Q: find middle element of linked list for odd and left middle for even

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
        ListNode Ans = findLeftMiddle(a);
        System.out.println(Ans.val);


    }
}
