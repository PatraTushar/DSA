package QueueByStriver.basics;

public class llImplementationOfCQ {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class  LLcq{

        Node head=null;
        Node tail=null;

        int size=0;

        public void add(int val){

            Node temp=new Node(val);

            if(size==0){

                head=tail=temp;

            }

            else {

                tail.next=temp;
                tail=temp;
                tail.next=head;

            }

            size++;
        }


        public int remove(){

            if(size==0){
                System.out.println(" queue is empty ");
                return -1;
            }

            int x=head.data;
            head=head.next;
            tail.next=head;
            size--;
            return x;

        }

        public int peek(){

            if(size==0){
                System.out.println(" queue is empty ");
                return -1;
            }

            return head.data;

        }


        public boolean isEmpty(){

            if(size==0){
                return true;
            }

            else{
                return false;
            }
        }

        public void display(){

            if(size==0){
                System.out.println(" queue is empty ");

            }

            Node temp=head;


            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();



        }
    }

    public static void main(String[] args) {

        LLcq q=new LLcq();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());


    }
}
