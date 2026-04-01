package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q33 {

    public static class ListNode {


        int val;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }

    static ListNode reverse(ListNode head){

        ListNode curr=head;
        ListNode prev=null;
        ListNode Agla;

        while (curr!=null){
            Agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Agla;
        }

        return prev;

    }

    static ListNode plusOne(ListNode head){

        //Time Complexity: O(n)
        //Space Complexity: O(n)


        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        int carry = 1;


        ListNode temp = reverse(head);

        while (temp != null) {

            int sum = temp.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            d.next = new ListNode(digit);
            d = d.next;
            temp = temp.next;
        }

        if (carry>0) d.next=new ListNode(carry);


        return reverse(dummy.next);



    }

    static void display(ListNode head){

        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(2);

        a.next = b;
        b.next = c;

        display(a);
        ListNode Ans=plusOne(a);
        display(Ans);



    }
}
