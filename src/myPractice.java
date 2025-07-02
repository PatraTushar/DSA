import java.util.NoSuchElementException;

public class myPractice {


    int[] arr=new int[10];
    int size=0;
    int front=-1;
    int rear=-1;

    public void add(int data){

        if(size==arr.length){
            System.out.println(" insertion not possible ");
            return;
        }

        if(front==-1){

            front=rear=0;

        }


            arr[rear] = data;
            rear++;
            size++;



    }

    public int remove(){

        if(front==-1){
            throw new NoSuchElementException(" queue is empty ");
        }

       int val=arr[front++];
        size--;

        if(size==0) front=rear=-1;

        return val;


    }


    public int peek(){

        if(size==0){
            throw new NoSuchElementException(" queue is empty ");
        }

        return arr[front];


    }

    void display(){

        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front;i<rear;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }


    public int size(){

        if(size==0){
            return 0;
        }

        return size;

    }


    public boolean isEmpty(){

        return size==0;
    }

    public static void main(String[] args) {

    }

}