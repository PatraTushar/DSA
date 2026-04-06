import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q11;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q13;
import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q15;
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

    static void oddEvenSplit(ListNode head) {

        ListNode odd = new ListNode(-1);
        ListNode o = odd;
        ListNode even = new ListNode(-1);
        ListNode e = even;
        ListNode temp = head;

        while (temp != null) {

            if (temp.val % 2 == 0) {

                e.next=temp;
                e=temp;



            } else {

                o.next=temp;
                o=temp;



            }

            temp=temp.next;

        }

        o.next=null;
        e.next=null;


        display(odd.next);
        display(even.next);




    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.println(" original list ");
        display(a);
        oddEvenSplit(a);

    }
}





