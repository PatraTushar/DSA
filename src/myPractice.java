import java.util.EmptyStackException;

public class myPractice {


    int[] Stack=new int[10];
    int idx=-1;



    public void push(int data){

        if(idx==Stack.length-1){
            System.out.println(" stack is full ");
            return;
        }


        idx++;
        Stack[idx]=data;

    }

    public int peek(){

        if(idx==-1){
            throw new EmptyStackException();
        }

        return Stack[idx];

    }

    public int pop(){

        if(idx==-1){
            throw new EmptyStackException();
        }

        int top=Stack[idx];
        idx--;

        return top;
    }

    int size(){



        return idx+1;

    }

    boolean isEmpty(){

        if(idx==-1) return true;

        return false;
    }

    void display(){

        if(idx==-1){

            throw new EmptyStackException();

        }

        for(int i=0;i<=idx;i++){
            System.out.print(Stack[i] +" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {


    }


}