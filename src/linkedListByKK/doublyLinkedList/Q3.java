package linkedListByKK.doublyLinkedList;

import java.util.Arrays;

public class Q3 {

    public static class Node{

        Node prev;
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static int[] nodesBetweenCriticalPoints(Node head) {

        int firstCPI=-1;
        int prevCPI=-1;
        int currIndex=1;
        Node curr=head.next;
        Node prev=head;
        int[] res=new int[2];
        res[0]=Integer.MAX_VALUE;

        while(curr.next!=null){

            Node Next=curr.next;
            if(curr.data>prev.data && curr.data>Next.data || curr.data<prev.data && curr.data<Next.data){

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

        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(5);
        Node f=new Node(1);
        Node g=new Node(2);

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
