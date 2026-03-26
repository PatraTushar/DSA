public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
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


    static ListNode findMiddle(ListNode head) {

        if (head==null || head.next==null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {

            prev = slow;
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
        ListNode Ans = findMiddle(a);
        System.out.println(Ans.val);


    }
}




