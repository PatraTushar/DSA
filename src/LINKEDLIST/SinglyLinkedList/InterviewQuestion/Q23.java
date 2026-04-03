package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q23 {

    public static class ListNode {

        int val;
        ListNode next;
        ListNode random;

        ListNode(int val){
            this.val = val;
        }
    }

    static void display(ListNode head){
        ListNode temp=head;

        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static ListNode copyRandomList(ListNode head){

        if(head==null) return null;

        // Assign the alternate connections

        ListNode oldTemp = head;
        ListNode newTemp;

        while (oldTemp != null) {

            newTemp = new ListNode(oldTemp.val);
            newTemp.next = oldTemp.next;
            oldTemp.next = newTemp;
            oldTemp = oldTemp.next.next;


        }

        // Assign the random pointers

        oldTemp = head;
        newTemp = head.next;

        while (oldTemp != null) {

            if (oldTemp.random == null) {
                newTemp.random = null;

            } else {

                newTemp.random = oldTemp.random.next;
            }

            oldTemp = oldTemp.next.next;
            if (newTemp.next == null) break;
            newTemp = newTemp.next.next;
        }

        ListNode dummy = new ListNode(-1);
        oldTemp = head;
        newTemp = head.next;
        dummy.next = newTemp;

        // separate the connections

        while (oldTemp != null) {

            oldTemp.next = newTemp.next; // restore original list
            if (newTemp.next != null) {
                newTemp.next = newTemp.next.next; // connect clone nodes
            }
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        return dummy.next;




    }

    public static void main(String[] args) {

        //  (leeTCode-->138)

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
        ListNode Ans= copyRandomList(a);
        display(Ans);




    }
}
