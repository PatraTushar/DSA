package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

import java.util.Arrays;


public class Q43 {

    public static class ListNode {

        ListNode prev;
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {


        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        int currentIndex = 1;

        ListNode prevNode = head;
        ListNode currentNode = head.next;

        while (currentNode != null && currentNode.next != null) {

            ListNode nextNode = currentNode.next;

            boolean isCritical = (currentNode.val > prevNode.val && currentNode.val > nextNode.val) ||
                    (currentNode.val < prevNode.val && currentNode.val < nextNode.val);


            if (isCritical) {

                if (firstCriticalIndex==-1) firstCriticalIndex=currentIndex;

                else {

                    minDistance= Math.min(minDistance,currentIndex-lastCriticalIndex);
                    maxDistance=currentIndex-firstCriticalIndex;


                }

                lastCriticalIndex=currentIndex;
            }


            prevNode=currentNode;
            currentNode=currentNode.next;
            currentIndex++;

        }

        if (minDistance==Integer.MAX_VALUE) return new int[]{-1,-1};
        return new int[]{minDistance,maxDistance};
    }

    public static void main(String[] args) {

        //  (leeTCode->2058)

        ListNode a = new ListNode(5);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(1);
        ListNode g = new ListNode(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        int[] ans = nodesBetweenCriticalPoints(a);
        System.out.println(Arrays.toString(ans));
    }


}
