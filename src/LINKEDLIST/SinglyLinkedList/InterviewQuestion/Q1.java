package LINKEDLIST.SinglyLinkedList.InterviewQuestion;

public class Q1 {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    static void display(ListNode a){

        ListNode temp=a;

        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void deleteNode(ListNode listNode){

        // (leeTCode->237)

        //Time Complexity (TC): O(1)
        //Space Complexity (SC): O(1)

        if (listNode == null || listNode.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node using this method.");
        }


        listNode.val = listNode.next.val;
        listNode.next= listNode.next.next;


    }

    public static void main(String[] args) {

        // Q: Delete node with node as given parameter

        ListNode a=new ListNode(4);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(1);
        ListNode d=new ListNode(9);

        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        deleteNode(b);
        display(a);





    }
}
