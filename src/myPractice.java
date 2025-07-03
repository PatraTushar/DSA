import java.util.NoSuchElementException;

public class myPractice {

    public static class Queue{

        int[] Queue=new int[10];
        int front =-1;
        int rear=-1;
        int size=0;


        public void add(int data){

            if(size==Queue.length){
                System.out.println(" queue is full ");
                return;
            }

            if(front==-1){
                front=0;
                rear=0;
            }

            else {

                rear=(rear+1)%Queue.length;
            }

            Queue[rear]=data;
            size++;

        }

        public int remove(){

            if(front==-1){

                throw new NoSuchElementException(" queue is empty ");
            }

            int val=Queue[front];

            if(size==1){
                front=rear=-1;
            }

            else {

                front=(front+1)%Queue.length;

            }

            size--;
            return val;
        }


        public int peek(){

            if(front==-1){

                throw new NoSuchElementException(" queue is empty ");
            }

            return Queue[front];


        }


        public int getSize(){

            if(size==0) return 0;

            return size;
        }

        public boolean isEmpty(){

            return size==0;
        }


        public void display(){

            if(front==-1){

                throw new NoSuchElementException(" queue is empty ");
            }

           for (int i=0;i<size;i++){

               int idx=(front+i)%Queue.length;
               System.out.print(Queue[idx]+" ");
           }


        }
    }

    public static void main(String[] args) {



    }


}