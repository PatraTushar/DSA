public class myPractice {


    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    static void display(ListNode head) {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    static ListNode findIntersection(ListNode head1,ListNode head2) {





    }


    public static void main(String[] args) {


    }

}





