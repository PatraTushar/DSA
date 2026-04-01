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




    static ListNode delete(ListNode head) {

        if (head==null || head.next==null) return null;

        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){

            prev=slow;
            slow=slow.next;
            fast=fast.next.next;


        }



        prev.next=slow.next;

        return head;




    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(9);

        a.next = b;
        b.next = c;

        display(a);
        ListNode Ans = delete(a);
        display(Ans);


    }


}





