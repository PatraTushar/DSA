//package linkedListByKK.SinglyLinkedList.InterviewQuestion;
//
//
//import OopsByKK.AccessModifier.Public.A;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Q41 {
//
//    public static class Node{
//
//        int data;
//        Node next;
//        Node child;
//
//        Node(int data){
//            this.data=data;
//        }
//    }
//
//    static List<Integer> flattenLinkedList(Node head) {
//
//        //Time Complexity (TC): O(N log N)
//        //Space Complexity (SC): O(N)
//
//        List<Integer> list = new ArrayList<>();
//
//        Node temp = head;
//
//        while (temp != null) {
//
//            Node temp2 = temp;
//
//            while (temp2 != null) {
//                list.add(temp2.data);
//                temp2 = temp2.child;
//            }
//
//            temp = temp.next;
//
//        }
//
//        return list;
//
//
//    }
//
//    static Node convert(Node head ){
//
//        List<Integer> list=flattenLinkedList(head);
//        Collections.sort(list);
//
//         head=new Node(list.get(0));
//        Node temp=head;
//
//        for(int i=1;i<list.size();i++){
//           temp.next =new Node(list.get(i));
//           temp=temp.next;
//        }
//
//        return head;
//
//
//    }
//
//    static Node mergeList(Node list1,Node list2){
//
//        Node dummy=new Node(-1);
//        Node res=dummy;
//
//        while (list1!=null && list2!=null){
//
//            if(list1.data<list2.data){
//
//                res.child=list1;
//                res=list1;
//                list1=list1.child;
//
//            }
//
//            else {
//                res.child=list2;
//                res=list2;
//                list2=list2.child;
//            }
//
//            res.next=null;
//
//        }
//
//        if(list1!=null) res.child=list1;
//        else  res.child=list2;
//
//        return dummy.next ;
//
//
//    }
//
//
//    static Node flattenLinkedListII(Node head){
//
//       Node Ans= mergeList(list1,list2);
//    }
//
//    static void display(Node head){
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data +" ");
//            temp=temp.next;
//        }
//
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        Node a=new Node(3);
//        Node b=new Node(2);
//        Node c=new Node(10);
//        Node d=new Node(1);
//        Node e=new Node(7);
//        Node f=new Node(11);
//        Node g=new Node(12);
//        Node h=new Node(4);
//        Node i=new Node(9);
//        Node j=new Node(5);
//        Node k=new Node(6);
//        Node l=new Node(8);
//
//        a.next=b;
//        b.next=d;
//        b.child=c;
//        c.child=null;
//        d.next=h;
//        d.child=e;
//        e.child=f;
//        f.child=g;
//        g.child=null;
//        h.next=j;
//        h.child=i;
//        i.child=null;
//        j.next=null;
//        j.child=k;
//        k.child=l;
//        l.child=null;
//
//
//       Node Ans= convert(a);
//       display(Ans);
//
//
//
//    }
//}
