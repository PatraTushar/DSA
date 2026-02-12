package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q40 {

    public static class ListNode {


        int data;
        ListNode next;

        ListNode(int data) {

            this.data = data;
        }
    }

    static ListNode rotateList(ListNode head, int k){

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(1)

        if(head==null || k==0) return head;



        ListNode temp=head;
        int length=1;
        while (temp.next!=null){

            length++;
            temp=temp.next;

        }
        ListNode tail=temp;

         k=k%length;
        if(k==0) return head;


        tail.next=head;


        int lengthDiff=length-k;
        ListNode newTail=head;
        for(int i=1;i<lengthDiff;i++){
            newTail=newTail.next;
        }

        head=newTail.next;
        newTail.next=null;

        return head;









    }




    static void display(ListNode head){

        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // rotate list (leeTCode->61)

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        ListNode Ans=rotateList(a,2);
        display(Ans);










    }


}
