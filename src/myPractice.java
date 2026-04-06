import OOPS.AccessModifier.Public.A;

public class myPractice {


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

    static ListNode deleteRightMiddle(ListNode head) {

        if (head.next==null) return head;

        ListNode prev=null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev=slow;
            slow = slow.next;
            fast = fast.next.next;
        }


       prev.next=slow.next;

        return head;

    }


    public static void main(String[] args) {


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
        ListNode Ans = deleteRightMiddle(a);
        display(Ans);


    }

}





