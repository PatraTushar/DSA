package linkedListByKK.SinglyLinkedList.InterviewQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q42 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // ─── Approach 1: Brute Force ──────────────────────────────────────────────
    // TC: O(N log N)  |  SC: O(N)

    static Node mergeKSortedList(Node[] lists) {
        List<Integer> allVals = new ArrayList<>();

        for (Node head : lists) {
            while (head != null) {
                allVals.add(head.data);
                head = head.next;
            }
        }

        Collections.sort(allVals);

        Node dummy = new Node(-1);
        Node temp = dummy;
        for (int val : allVals) {
            temp.next = new Node(val);
            temp = temp.next;
        }

        return dummy.next;
    }

    // ─── Approach 2: Min-Heap (PriorityQueue) ────────────────────────────────
    // TC: O(N log K)  |  SC: O(K)
    // N = total nodes, K = number of lists

    static Node mergeKSortedListII(Node[] lists) {

        // ✅ Must provide comparator — Node doesn't implement Comparable
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Step 1: Push the head of every non-null list into the heap
        for (Node head : lists) {
            if (head != null) {
                pq.offer(head);
            }
        }

        Node dummy = new Node(-1);
        Node temp = dummy;

        // Step 2: Always extract the smallest node, attach it, push its next
        while (!pq.isEmpty()) {
            Node smallest = pq.poll();         // O(log K)
            temp.next = smallest;
            temp = temp.next;

            if (smallest.next != null) {
                pq.offer(smallest.next);        // O(log K)
            }
        }

        temp.next = null; // ✅ cleanly terminate the merged list

        return dummy.next;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Linked List 1: 1 -> 4 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(4);
        l1.next.next = new Node(5);

        // Linked List 2: 1 -> 3 -> 4
        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

        // Linked List 3: 2 -> 6
        Node l3 = new Node(2);
        l3.next = new Node(6);

        // Linked List 4: 0 -> 7
        Node l4 = new Node(0);
        l4.next = new Node(7);

        Node[] lists = {l1, l2, l3, l4};

        System.out.print("Brute Force:   ");
        display(mergeKSortedList(lists));

        // Rebuild lists (mergeKSortedList mutates heads)
        l1 = new Node(1); l1.next = new Node(4); l1.next.next = new Node(5);
        l2 = new Node(1); l2.next = new Node(3); l2.next.next = new Node(4);
        l3 = new Node(2); l3.next = new Node(6);
        l4 = new Node(0); l4.next = new Node(7);

        Node[] lists2 = {l1, l2, l3, l4};

        System.out.print("Min-Heap:      ");
        display(mergeKSortedListII(lists2));
    }
}


// Learn Heap first if You want to understand this Question