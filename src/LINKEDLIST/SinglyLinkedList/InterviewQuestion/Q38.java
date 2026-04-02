package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class Q38 {

    public static class ListNode {


        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {

            this.val = val;
        }
    }


    static ArrayList<ArrayList<Integer>> sumPairs(ListNode head, int sum) {

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(1) (excluding the output list)

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        ListNode left = head;
        ListNode right = head;

        while (right.next != null) {

            right = right.next;
        }


        while (left != null && right != null && left != right && left.prev != right) {

            int currentSum = left.val + right.val;

            if (currentSum == sum) {

                result.add(new ArrayList<>(Arrays.asList(left.val, right.val)));
                left = left.next;
                right = right.prev;
            }

            else if (currentSum < sum) left = left.next;

            else right = right.prev;
        }

        return result;


    }


    static void display(ListNode head) {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // Find pairs with given sum in Sorted DLL

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(9);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        int sum = 5;

        ArrayList<ArrayList<Integer>> Ans = sumPairs(a, sum);
        System.out.println(Ans);


    }
}
