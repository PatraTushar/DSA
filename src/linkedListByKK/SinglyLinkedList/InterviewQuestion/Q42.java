//package linkedListByKK.SinglyLinkedList.InterviewQuestion;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.PriorityQueue;
//
//public class Q42 {
//
//    public static class Node {
//
//
//        int data;
//        Node next;
//
//        Node(int data) {
//
//            this.data = data;
//        }
//    }
//
//    static Node mergeKSortedList(Node[] lists){
//
//        // brute force approach
//
//        //Time Complexity (TC): O(N log N)
//        //Space Complexity (SC): O(N)
//
//        List<Integer> addAllVal=new ArrayList<>();
//
//        for(Node head:lists){
//
//            while (head!=null){
//                addAllVal.add(head.data);
//                head=head.next;
//            }
//
//
//        }
//
//        Collections.sort(addAllVal);
//
//        Node dummy=new Node(-1);
//        Node d1=dummy;
//        for(int i=0;i<addAllVal.size();i++){
//            d1.next=new Node(addAllVal.get(i));
//            d1=d1.next;
//        }
//
//        return dummy.next;
//
//
//
//
//    }
//
//
//    static Node mergeKSortedListII(Node[] lists){
//
//        PriorityQueue<Node> pq=new PriorityQueue<>();
//
//        for(Node head:lists){
//            if (head!=null){
//                pq.offer(head);
//            }
//        }
//
//
//
//    }
//
//    static void display(Node head){
//
//        Node temp=head;
//
//        while (temp!=null){
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // Linked List 1: 1 -> 4 -> 5
//        Node l1 = new Node(1);
//        l1.next = new Node(4);
//        l1.next.next = new Node(5);
//
//        // Linked List 2: 1 -> 3 -> 4
//        Node l2 = new Node(1);
//        l2.next = new Node(3);
//        l2.next.next = new Node(4);
//
//        // Linked List 3: 2 -> 6
//        Node l3 = new Node(2);
//        l3.next = new Node(6);
//
//        // Linked List 4: 0 -> 7
//        Node l4 = new Node(0);
//        l4.next = new Node(7);
//
//        Node[] lists={l1,l2,l3,l4};
//
//        Node sortedHead = mergeKSortedList(lists);
//        display(sortedHead);
//
//
//
//
//    }
//}
