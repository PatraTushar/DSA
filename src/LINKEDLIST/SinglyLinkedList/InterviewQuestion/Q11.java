package LINKEDLIST.SinglyLinkedList.InterviewQuestion;


    public class Q11 {

        public static class ListNode {

            int val;
            ListNode next;

            ListNode(int val){
                this.val = val;
            }
        }

        static boolean hasCycle(ListNode head){

            //Time Complexity (TC): O(n)
            //Space Complexity (SC): O(1)

            if(head==null || head.next==null) return false;


            ListNode slow=head;
            ListNode fast=head;

            while (fast!=null && fast.next!=null){


                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast) return true;



            }

            return false;



        }

        public static void main(String[] args) {

            // Q: Cycle in a linked list I  (leeTCode-->141)

            // Input 1
            ListNode a =new ListNode(3);
            ListNode b=new ListNode(2);
            ListNode c=new ListNode(0);
            ListNode d=new ListNode(-4);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=b;

            System.out.println(hasCycle(a));

            // Input 2

            ListNode e=new ListNode(1);
            ListNode f=new ListNode(2);
            e.next=f;
            f.next=e;

            System.out.println(hasCycle(e));

            // Input 3

            ListNode g=new ListNode(1);
            System.out.println(hasCycle(g));










        }
    }


