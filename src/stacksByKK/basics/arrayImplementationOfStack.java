package stacksByKK.basics;

public class arrayImplementationOfStack {

    public static class Stack{

        int[] arr=new int[50];
        int idx=0;

        void push(int val){

            arr[idx]=val;
            idx++;

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

        int peek(){

            if(idx==0){
                System.out.println(" stack is empty ");
                return -1;
            }
            return arr[idx-1];
        }

         void display(){

            for (int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }

             System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){

            if(idx==0){
                return true;
            }

            return false;
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
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();  // 10 20 30 40 50
         st.pop();
        st.display();  // 10 20 30 40
        System.out.println(st.peek());  // 40
        System.out.println(st.isFull());  // false




    }
}
