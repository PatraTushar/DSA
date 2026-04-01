package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q22 {

    public static class ListNode {

        int val;
        ListNode next;

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

    static ListNode oddEvenLL(ListNode head){

        if(head==null || head.next==null) return head;

        ListNode temp=head;
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode tempO=odd;
        ListNode tempE=even;

        while (temp!=null){


            tempO.next=temp;
            temp=temp.next;
            tempO=tempO.next;

            tempE.next=temp;
            if(temp==null) break;
            temp=temp.next;
            tempE=tempE.next;
        }

        odd=odd.next;
        even=even.next;
        tempO.next=even;
        return odd;
    }

    public static void main(String[] args) {

        // Q: Odd even linked list (leeTCode-->328)

        ListNode a=new ListNode(10);
        ListNode b=new ListNode(11);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(6);
        ListNode f=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        ListNode Ans=oddEvenLL(a);
        display(Ans);


    }
}
