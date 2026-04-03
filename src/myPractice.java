import LINKEDLIST.SinglyLinkedList.InterviewQuestion.Q23;
import linkedListByKK.SinglyLinkedList.InterviewQuestion.Q41;

public class myPractice {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode random;

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

    static ListNode randomPointer(ListNode head){


    }



    public static void main(String[] args) {

        ListNode a=new ListNode(7);
        ListNode b=new ListNode(13);
        ListNode c=new ListNode(11);
        ListNode d=new ListNode(10);
        ListNode e=new ListNode(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        a.random=null;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;

        display(a);
        ListNode Ans=randomPointer(a);
        display(Ans);
    }


}





