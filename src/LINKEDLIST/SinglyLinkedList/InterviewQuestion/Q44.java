package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q44 {

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


    static ListNode mergeList(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val<list2.val){

                temp.next=list1;
                temp=list1;
                list1=list1.next;
            }


            else {

                temp.next=list2;
                temp=list2;
                list2=list2.next;
            }
        }

        if (list1!=null) temp.next=list1;
        else temp.next=list2;

        return dummy.next;



    }

    static ListNode sortList(ListNode head) {

        // leeTCode->148

        // TC: O(N log N)
        // SC: O(logN)

        if (head == null || head.next == null) return head;

        ListNode middle = findLeftMiddle(head);

        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;


        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);


        return mergeList(leftHead, rightHead);


    }

    public static void main(String[] args) {

        ListNode a = new ListNode(7);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(11);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;



        display(a);
        ListNode Ans = sortList(a);
        display(Ans);
    }
}
