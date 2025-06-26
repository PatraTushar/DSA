package StackByStriver.basics;

import java.util.EmptyStackException;

public class ImplementStackUsingArray {

    int idx=-1;
    int[] stack=new int[10];


    public void  push(int val){

        if(idx==stack.length-1){
            throw new IndexOutOfBoundsException(" element cant be inserted ");
        }

        idx++;
        stack[idx]=val;


    }

    public int peek(){

        if(idx==-1){
            throw new EmptyStackException();
        }

        return stack[idx];
    }


    public int pop(){

        if(idx==-1){
            throw new EmptyStackException();
        }

        return stack[idx--];


    }

    public int size(){

        if(idx==-1) return 0;

        return idx+1;
    }

    boolean isFull(){

        if(idx==stack.length-1) return true;
        else return false;
    }

    void display(){

        for (int i=0;i<=idx;i++){
            System.out.print(stack[i]+" ");
        }

        System.out.println();
    }


    public static void main(String[] args) {


        ImplementStackUsingArray st=new ImplementStackUsingArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();   // 1 2 3 4 5
        st.pop();
        st.display();  // 1 2 3 4
        System.out.println(st.peek()); // 4
        System.out.println(st.size()); // 4
        System.out.println(st.isFull()); // false


    }
}
