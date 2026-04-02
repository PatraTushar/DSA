package linkedListByKK.SinglyLinkedList.InterviewQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q41 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode child;

        ListNode(int val) {
            this.val = val;
        }
    }

    // ─── Approach 1: Brute Force ──────────────────────────────────────────────
    // TC: O(N log N)  |  SC: O(N)

    static List<Integer> flattenLinkedList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            ListNode temp2 = temp;
            while (temp2 != null) {
                list.add(temp2.val);
                temp2 = temp2.child;   // traverse down each column
            }
            temp = temp.next;          // move to next column
        }
        return list;
    }

    static ListNode convert(ListNode head) {
        List<Integer> list = flattenLinkedList(head);
        Collections.sort(list);

        head = new ListNode(list.get(0));
        ListNode temp = head;

        for (int i = 1; i < list.size(); i++) {
            temp.child = new ListNode(list.get(i)); // ✅ use child, not next
            temp = temp.child;
        }
        return head;
    }

    // ─── Approach 2: Optimal Merge ───────────────────────────────────────────
    // TC: O(N log K)  |  SC: O(1)  where K = number of next-linked columns

    static ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;   // ✅ move via child, not next
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;   // ✅ move via child, not next
            }
            res.next = null;
        }

        // attach remaining
        if (list1 != null) res.child = list1;
        else               res.child = list2;

        return dummy.child; // ✅ return dummy.child, not dummy.next
    }

    static ListNode flattenLinkedListII(ListNode head) {
        // Base case: empty list or single column
        if (head == null || head.next == null) return head;

        // ✅ Recursively flatten the rest, then merge with current head
        ListNode mergedTail = flattenLinkedListII(head.next);
        head.next = null; // disconnect before merging

        return mergeList(head, mergedTail);
    }

    // ─── Display (using child pointer for flattened output) ──────────────────

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.child; // ✅ flattened list is linked via child
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Build the multi-level linked list
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(7);
        ListNode f = new ListNode(11);
        ListNode g = new ListNode(12);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(5);
        ListNode k = new ListNode(6);
        ListNode l = new ListNode(8);

        a.next = b;
        b.next = d;   b.child = c;
        d.next = h;   d.child = e;  e.child = f;  f.child = g;
        h.next = j;   h.child = i;
        j.child = k;  k.child = l;

        // Test Approach 1
        ListNode ans1 = convert(a);
        System.out.print("Brute Force:  ");
        display(ans1);

        // Rebuild (convert mutates the list)
        a = new ListNode(3);  b = new ListNode(2);   c = new ListNode(10);
        d = new ListNode(1);  e = new ListNode(7);   f = new ListNode(11);
        g = new ListNode(12); h = new ListNode(4);   i = new ListNode(9);
        j = new ListNode(5);  k = new ListNode(6);   l = new ListNode(8);

        a.next = b;
        b.next = d;   b.child = c;
        d.next = h;   d.child = e;  e.child = f;  f.child = g;
        h.next = j;   h.child = i;
        j.child = k;  k.child = l;

        // Test Approach 2
        ListNode ans2 = flattenLinkedListII(a);
        System.out.print("Optimal Merge: ");
        display(ans2);
    }
}
