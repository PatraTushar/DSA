import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q41;

public class myPractice {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode child;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode mergeList(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                d.child = list1;
                d = list1;
                list1 = list1.child;

            } else {

                d.child = list2;
                d = list2;
                list2 = list2.child;
            }

            d.next = null;


        }

        if (list1 != null) d.child = list1;
        else d.child = list2;

        return dummy.child;

    }

    static ListNode FLATTEN(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode rightList = FLATTEN(head.next);
        head.next = null;

        return mergeList(head, rightList);


    }


    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.child; // ✅ flattened list is linked via child
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(7);
        ListNode f = new ListNode(11);
        ListNode g = new ListNode(12);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(5);
        ListNode k = new ListNode(6);
        ListNode l = new ListNode(8);

        a.next = b;
        b.next = d;
        b.child = c;
        d.next = h;
        d.child = e;
        e.child = f;
        f.child = g;
        h.next = j;
        h.child = i;
        j.child = k;
        k.child = l;

        // Test Approach 1
        ListNode ans1 = FLATTEN(a);
        System.out.print("optimal:  ");
        display(ans1);


    }


}





