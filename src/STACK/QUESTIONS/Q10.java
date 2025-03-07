package STACK.QUESTIONS;

import java.util.Stack;

public class Q10 {

    public static int[] nextSmallerElement(int arr[]){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int NSE[]=new int[n];

        st.push(arr[n-1]);
        NSE[n-1]=-1;

        for(int i=n-2;i>=0;i--){

            while(st.size()>0 && arr[i]<st.peek()){
                st.pop();
            }

            if(st.size()==0) NSE[i]=-1;

            else NSE[i]=st.peek();

            st.push(arr[i]);
        }

        return NSE;


    }

    public static void main(String[] args) {

        int arr[]={5,2,4,6,3,5};

        int ans[]=nextSmallerElement(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}
