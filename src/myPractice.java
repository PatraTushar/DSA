//import linkedListByKK.doublyLinkedList.Q1;
//
//public class myPractice {
//
//    public static class Node {
//
//        Node prev;
//        int data;
//        Node next;
//
//        Node(int data) {
//
//            this.data = data;
//        }
//    }
//
//
//
//    static Node AddNumbers(Node head1,Node head2){
//
//        Node temp1=head1;
//        Node temp2=head2;
//        Node dummy=new Node(-1);
//        Node d1=dummy;
//        int carry=0;
//
//
//
//        while (temp1!=null && temp2!=null){
//
//
//            int sum= temp1.data + temp2.data + carry;
//            int result=0;
//
//            if(sum>10){
//
//                carry=sum/10;
//                result=sum%10;
//                Node newNode=new Node(result);
//                d1.next=newNode;
//                temp1=temp1.next;
//                temp2=temp2.next;
//
//
//            }
//
//            else {
//
//                carry=sum/10;
//                result=sum%10;
//                Node newNode=new Node(result);
//                d1.next=newNode;
//                temp1=temp1.next;
//                temp2=temp2.next;
//
//
//            }
//
//
//        }
//
//        if(carry==1){
//
//
//
//        }
//
//        else {
//
//
//        }
//    }
//
//
//
//
//
//
//
//
//    static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//
//        Node a = new Node(4);
//        Node b = new Node(5);
//        Node c = new Node(6);
//        Node d = new Node(2);
//        Node e = new Node(1);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//
//
//        Node f = new Node(4);
//        Node g = new Node(1);
//        Node h = new Node(8);
//        Node i = new Node(5);
//        Node j = new Node(2);
//
//        f.next=g;
//        g.next=h;
//        h.next=i;
//        i.next=j;
//
//
//
//
//
//
//
//
//    }
//
//}