package LINKEDLIST;

public class Implementation {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }


    }

    public static class linkedlist{

        Node head=null;
        Node tail=null;


        int size=0;

        void insertAtEnd(int val){

            Node temp=new Node(val);

            if(head==null){
                head=temp;
                tail=temp;
            }

            else{
                tail.next=temp;
                tail=temp;

            }
            size++;
        }

        void insertAtHead(int val){

            Node temp=new Node(val);

            if(head==null){
                head=temp;
                tail=temp;
            }

            else {
                temp.next = head;
                head = temp;
            }

            size++;
        }

         void insertAt(int idx,int val){

            Node t=new Node(val);
            Node temp=head;

            if(idx==size){
                insertAtEnd(val);
                return;
            }

            else if(idx==0){
                insertAtHead(val);
                return;
            }

            else if(idx<0 &&  idx>size){
                System.out.println(" wrong index ");
                return;
            }



            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }

            t.next=temp.next;
            temp.next=t;
            size++;

        }

        int getAt(int idx){

            if(idx<0 && idx>size){
                System.out.println(" Wrong index ");
            }

            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }

            return temp.data;

        }

        void deleteAt(int idx) {

            if(idx==0){
                head=head.next;
                size--;
                return;
            }

            Node temp=head;

            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
            tail=temp;
            size--;

        }

        void display(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }

            System.out.println();
        }


//        int size(){
//            Node temp=head;
//
//            int count =0;
//            while (temp!=null){
//                count++;
//                temp=temp.next;
//            }
//
//            return count;
//        }
    }



    public static void main(String[] args) {

        linkedlist ll=new linkedlist();


        ll.insertAtEnd(5);  //5
        ll.insertAtEnd(6);  //5-->6
        ll.display();
        System.out.println();
     //   System.out.println(ll.size());
        ll.insertAtEnd(10);
        ll.display(); //5-->6-->10
        ll.insertAtHead(101);
        ll.display();   //101-->5-->6-->10
        ll.insertAt(2,33);
        ll.display(); //101-->5-->33-->6-->10
        ll.insertAt(5,45);  //101-->5-->33-->6-->10-->45
        ll.display();
        System.out.println(ll.tail.data);
        ll.insertAt(0,100);
        ll.display();      //100-->101-->5-->33-->6-->10-->45
        System.out.println(ll.getAt(6));
        ll.deleteAt(6);
        ll.display();



    }
}
