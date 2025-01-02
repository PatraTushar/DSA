package STACK.BASICS;

//import java.util.Stack;




public class arrayImplementation {

    public static class Stack{

         int arr[]=new int[4];
         int idx=0;

          void push(int x){

              if(isFull()){
                  System.out.println(" stack is full ");
                  return;
              }
            arr[idx]=x;
            idx++;

        }

        int peek(){

               if(idx==0){
                   System.out.println(" stack is empty ");
                   return -1;
               }

              return arr[idx-1];
        }

        int pop(){


              if(idx==0){
                  System.out.println(" stack is empty ");
                  return -1;
              }
             int top=arr[idx-1];
             arr[idx-1]=0;
             idx--;
             return top;
        }

        void display(){

              for(int i=0;i<=idx-1;i++){
                  System.out.print(arr[i] +" ");
              }

            System.out.println();
        }

        int size(){
              return idx;
        }

        boolean isEmpty(){
              if(idx==0) return true;
              else return false;
        }

        boolean isFull(){

              if(idx==arr.length) return true;
              else return false;


        }

        int capacity(){
              return arr.length;
        }




    }



    public static void main(String[] args) {

        Stack st=new Stack();

        st.push(5);
        st.display();  //5
        st.push(3);
        st.display();  //5 3
        st.push(7);
        st.display();  //5 3 7
        System.out.println(st.size());
        st.pop();
        st.display(); //5 3
        System.out.println(st.size()); //2
        st.push(12);
        st.push(34);
        System.out.println(st.isFull());
        st.push(333);







    }
}
