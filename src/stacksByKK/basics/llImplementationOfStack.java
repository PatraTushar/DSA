package stacksByKK.basics;


import STACK.linkedListImplementation;

public class llImplementationOfStack {

   public static class Node {

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class llStack{

        Node head=null;
        int size=0;

        void push(int data){



            Node temp=new Node(data);
            temp.next=head;
            head=temp;
            size++;


       }

       int pop(){

            if(head==null){
                System.out.println(" stack is empty ");
                return -1;
            }
            int top=head.data;
            head=head.next;

            return top;

       }

       int peek(){

            if(head==null){
                System.out.println(" stack is empty ");
                return -1;
            }
            return head.data;
       }

       boolean isEmpty(){
            if(size==0){
                return true;
            }

            else return false;
       }

         void displayRev(Node head){

            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        void displayRec(Node head){

            if(head==null) return;

            displayRec(head.next);
            System.out.print(head.data +" ");
        }



    }

    public static void main(String[] args) {

       llStack st=new llStack();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
      // st.displayRev(st.head);
        st.displayRec(st.head);



    }
}
