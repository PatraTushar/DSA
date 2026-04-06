import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q11;
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

    static ListNode hasCycle(ListNode head) {

        if (head==null || head.next==null) return null;

        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null &&fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast) break;


        }

        if (fast==null || fast.next==null) return null;

        slow=head;

        while (slow!=fast){

            slow=slow.next;
            fast=fast.next;
        }


        return slow;


    }


    public static void main(String[] args) {


        // Input 1
        ListNode a =new ListNode(3);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(0);
        ListNode d=new ListNode(-4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;

        System.out.println(hasCycle(a));

        // Input 2

        ListNode e=new ListNode(1);
        ListNode f=new ListNode(2);
        e.next=f;
        f.next=e;

        System.out.println(hasCycle(e));

        // Input 3

        ListNode g=new ListNode(1);
        System.out.println(hasCycle(g));


    }

}





