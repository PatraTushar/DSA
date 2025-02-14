package STACK.QUESTIONS;

import java.util.Stack;

public class Q11 {

    public static int[] previousSmallerElement(int arr[]){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int PSE[]=new int[n];

        st.push(arr[0]);
        PSE[0]=-1;

        for(int i=1;i<n;i++){

            while(st.size()>0 && arr[i]<st.peek()){
                st.pop();
            }

            if(st.size()==0) PSE[i]=-1;

            else PSE[i]=st.peek();

            st.push(arr[i]);
        }

        return PSE;


    }

    public static void main(String[] args) {

        int arr[]={5,2,4,6,3,5};

        int ans[]=previousSmallerElement(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }

    }
}
