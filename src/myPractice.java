public class myPractice {

    public static class ListNode {


        int data;
        ListNode next;

        ListNode(int data) {

            this.data = data;
        }
    }


    static ListNode findIntersection(ListNode headA, ListNode headB){

        //Time Complexity: O(n + m)
        //Space Complexity: O(1)

        ListNode temp1=headA;
        ListNode temp2=headB;

        int length1=0;
        int length2=0;

        while (temp1!=null){
            length1++;
            temp1=temp1.next;
        }

        while (temp2!=null){
            length2++;
            temp2=temp2.next;
        }

        if(length1>length2){

            return findIntersection(headB,headA);

        }

        ListNode slow=headA;
        ListNode fast=headB;

        int lengthDiff=length2-length1;

        for(int i=0;i<lengthDiff;i++){
            fast=fast.next;
        }

        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
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

        ListNode a=new ListNode(87);
        ListNode b=new ListNode(100);
        ListNode c=new ListNode(13);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(12);
        ListNode g=new ListNode(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        ListNode h=new ListNode(90);
        ListNode i=new ListNode(9);
        h.next=i;
        i.next=e;

        display(a);
        display(h);
        ListNode Ans=findIntersection(a,h);
        System.out.println(Ans.data);





    }

}