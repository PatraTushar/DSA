public class myPractice {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
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


    static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(100);
        ListNode current = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2 != null) {


            if (ptr1.val < ptr2.val) {

                current.next = ptr1;
                current = ptr1;
                ptr1 = ptr1.next;
            } else {

                current.next = ptr2;
                current = ptr2;
                ptr2 = ptr2.next;
            }
        }


        while (ptr1 != null) {

            current.next = ptr1;
            current = ptr1;
            ptr1 = ptr1.next;
        }


        while (ptr2 != null) {

            current.next = ptr2;
            current = ptr2;
            ptr2 = ptr2.next;
        }

        return dummy.next;


    }

    public static void main(String[] args) {



    }
}




