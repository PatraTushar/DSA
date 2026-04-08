import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q23;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q25;

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

    static ListNode duplicateII(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        d.next = head;

        while (head != null) {

            if (head.next != null && head.val == head.next.val) {

                int duplicate = head.val;

                while (head != null && head.val == duplicate) {

                    head = head.next;
                }

                d.next = head;
            } else {


                d = d.next;
                head = head.next;
            }
        }

        return dummy.next;


    }


    static ListNode copyRandomList(ListNode head) {

        ListNode oldTemp = head;

        // alternate connection

        while (oldTemp != null) {

            ListNode newNode = new ListNode(oldTemp.val);
            newNode.next = oldTemp.next;
            oldTemp.next = newNode;
            oldTemp = oldTemp.next.next;
        }


        // assign random pointers

        oldTemp = head;
        ListNode newTemp = head.next;

        while (oldTemp != null) {

            if (oldTemp.random == null) newTemp.random = null;

            else newTemp.random = oldTemp.random.next;


            oldTemp = oldTemp.next.next;
            if (newTemp.next == null) break;
            newTemp = newTemp.next.next;
        }


        // separate te connection

        oldTemp = head;
        newTemp = head.next;
        ListNode dummy = new ListNode(-1);
        dummy.next = newTemp;

        while (oldTemp != null) {

            oldTemp.next = newTemp.next;
            if (newTemp.next != null) newTemp.next = newTemp.next.next;
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        return dummy.next;


    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        display(a);
        ListNode ans = duplicateII(a);
        display(ans);


        ListNode i = new ListNode(7);
        ListNode j = new ListNode(13);
        ListNode k = new ListNode(11);
        ListNode l = new ListNode(10);
        ListNode m = new ListNode(1);

        i.next = j;
        j.next = k;
        k.next = l;
        l.next = m;

        i.random = null;
        j.random = j;
        k.random = m;
        l.random = k;
        m.random = i;

        display(i);
        ListNode Ans = copyRandomList(i);
        display(Ans);


    }
}





