package LINKEDLIST.circularLinkedList;

public class Q1 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    static ListNode deleteHead(ListNode head){


        if(head==null || head.next==head) return null;

        ListNode temp=head;

        while (temp.next!=head){
            temp=temp.next;
        }

        temp.next=head.next;

        return head.next;



    }

    static void display(ListNode head){

        ListNode temp=head.next;
        System.out.print(head.val +" ");
        while (temp!=head){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }



        System.out.println();
    }

    public static void main(String[] args) {

        // only head is given of circular linked list . Delete the Head


        ListNode a=new ListNode(1);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;

        display(a);
        ListNode Ans=deleteHead(a);
        display(Ans);






    }
}
