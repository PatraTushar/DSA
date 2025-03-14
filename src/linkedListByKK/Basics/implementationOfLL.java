package linkedListByKK.Basics;

public class implementationOfLL {

    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class linkedList{

        Node head=null;
        Node tail=null;

        int size=0;


         void insertAtTail(int data){

             Node temp=new Node(data);

            if(head==null){
                head=temp;

            }

            else{
                tail.next=temp;
            }

            tail=temp;
            size++;
        }

        void insertAtHead(int data){

             Node temp=new Node(data);

             if(head==null){
                 head=temp;
                 tail=temp;
             }

             else {
                 temp.next=head;
                 head=temp;
             }
             size++;
        }

         void insertAt(int idx,int data){

             Node temp=new Node(data);
             Node t=head;

             if(idx<0 || idx>size){
                 System.out.println(" wrong index ");
                 return;
             }

             if(idx==size){
                 insertAtTail(data);
                 return;
             }

             else if(idx==0){
                 insertAtHead(data);
                 return;
             }

             for(int i=0;i<idx-1;i++){
                 t=t.next;

             }

             temp.next=t.next;
             t.next=temp;
             size++;
         }

         int getAt(int idx){

             if(idx<0 || idx>=size){
                 System.out.println(" wrong index ");
                 return -1;
             }

             Node temp=head;

             for (int i=0;i<idx;i++){
                 temp=temp.next;
             }

             return temp.data;



         }

         void deleteAt(int idx){
             if(idx<0 || idx>=size){
                 System.out.println(" wrong index ");
                 return ;
             }

             Node temp=head;

             if(idx==0){
                 head=head.next;
                 size--;
                 return;

             }

             for(int i=0;i<idx-1;i++){

                 temp=temp.next;

             }

              if(idx==size-1){
                  tail=temp;
                  temp.next=null;
              }

              else {
                  temp.next=temp.next.next;
              }

              size--;
         }




         void display(){

             Node temp=head;

             while (temp!=null){
                 System.out.print(temp.data +" ");
                 temp=temp.next;
             }

             System.out.println();
        }
    }



    public static void main(String[] args) {


        linkedList ll=new linkedList();
        ll.insertAtTail(2);
        ll.display();    //2
        ll.insertAtTail(5);
        ll.insertAtTail(10);
        ll.insertAtTail(8);
        ll.display();    // 2-->5-->10-->8
        ll.insertAtHead(20);
        ll.display(); // 20--> 2-->5-->10-->8
        ll.insertAt(3,100);
        ll.display(); // 20--> 2-->5-->100-->10-->8
        ll.insertAt(6,200);
        ll.display(); // 20--> 2-->5-->100-->10-->8-->200
       // System.out.println(ll.tail.data);
        ll.insertAt(0,1000);
        ll.display();  // 1000-->20--> 2-->5-->100-->10-->8-->200
        System.out.println(ll.getAt(3));
        ll.deleteAt(3);
        ll.display(); //  1000-->20--> 2-->100-->10-->8-->200
        System.out.println(ll.tail.data);
        ll.deleteAt(6);
        ll.display();  //1000-->20--> 2-->100-->10-->8
        System.out.println(ll.tail.data);












    }
}
