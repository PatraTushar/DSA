public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {

            this.val = data;
        }
    }

    static void display(ListNode node) {

        ListNode temp = node;

        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static ListNode findIntersection(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthA = 0;
        int lengthB = 0;

        while (tempA != null) {

            lengthA++;

            tempA = tempA.next;
        }

        while (tempB != null) {

            lengthB++;
            tempB = tempB.next;
        }

        if (lengthA > lengthB) return findIntersection(headB, headA);

        int lengthDiff = lengthB - lengthA;


        ListNode slow = headA;
        ListNode fast = headB;

        for (int i = 0; i < lengthDiff; i++) {

            fast = fast.next;
        }


        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // one pass solution

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(87);
        ListNode b = new ListNode(100);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(12);
        ListNode g = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        ListNode h = new ListNode(90);
        ListNode i = new ListNode(9);
        h.next = i;
        i.next = e;


        display(a);
        ListNode Ans = findIntersection(a, h);
        System.out.println(" Intersection of both linked list is " + Ans.val);

    }
}




