package LINKEDLIST.doublyLinkedList;

import java.util.Arrays;

public class Q3 {

    public static class ListNode {

        ListNode prev;
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val = val;
        }
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {

        int firstCPI=-1;
        int prevCPI=-1;
        int currIndex=1;
        ListNode curr=head.next;
        ListNode prev=head;
        int[] res=new int[2];
        res[0]=Integer.MAX_VALUE;

        while(curr.next!=null){

            ListNode Next=curr.next;
            if(curr.val >prev.val && curr.val >Next.val || curr.val <prev.val && curr.val <Next.val){

                if(prevCPI==-1){
                    firstCPI=currIndex;
                    prevCPI=currIndex;
                }

                else{
                    res[0]=Math.min(res[0],currIndex-prevCPI);
                    prevCPI=currIndex;
                }
            }

            curr=curr.next;
            prev=prev.next;
            currIndex++;

        }


        if( firstCPI!=-1 && res[0]!=Integer.MAX_VALUE ){
            res[1]=prevCPI-firstCPI;
        }

        else{
            res[0]=-1;
            res[1]=-1;
        }

        return res;

    }

    public static void main(String[] args) {

        // Q3: critical point max and min distance  (leeTCode->2058)

        ListNode a=new ListNode(5);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(2);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(1);
        ListNode g=new ListNode(2);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        int[] ans=nodesBetweenCriticalPoints(a);
        System.out.println(Arrays.toString(ans));
    }


}
