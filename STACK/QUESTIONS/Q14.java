package STACK.QUESTIONS;

import LINKEDLIST.Q5;

import java.util.Stack;

public class Q14 {

    public static int[] nextGreatestElement(int arr[]){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int NGE[]=new int[n];

        st.push(n-1);
        NGE[n-1]=-1;

        for(int i=n-2;i>=0;i--){

            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0) NGE[i]=-1;
            else NGE[i]=st.peek();
            st.push(i);
        }

        return NGE;


    }

    public static void main(String[] args) {
        int arr[]={5,2,4,6,3,5};

        int ans[]=nextGreatestElement(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
}
