package STACK;

public class linkedListImplementation {

    public static class Node{      //user defined data type

        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

    }

    public static class LLStack{     //user defined data structure

        Node head=null;
        int size=0;
        void push(int x){

            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;


        }

        void displayRec(Node h){

            if(h==null) return;

            displayRec(h.next);
            System.out.print(h.data +" ");

        }

        void display(){

            displayRec(head);
            System.out.println();

        }

        void displayRev(){

            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){

            if(head==null){
                System.out.println(" stack is empty ");
                return -1;
            }

            int x=head.data;
            head=head.next;

            return x;
        }

        int peek(){

            if(head==null){
                System.out.println(" stack is empty ");
                return -1;
            }

            return head.data;
        }

        boolean isEmpty(){

            if (size==0) return true;

            return false;
        }

        static void displayRev(Node head){

            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        LLStack st=new LLStack();

        st.push(5);
        st.display();  //5
        st.push(3);
        st.display();  //5 3
        st.push(7);
        st.display();  //5 3 7
        System.out.println(st.size());   //3
        st.pop();
        st.display(); //5 3
        System.out.println(st.size()); //2
        st.push(12);
        st.push(34);


    }
}
