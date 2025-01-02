package STACK.QUESTIONS;

import java.util.Stack;

public class Q7 {

    public static int[] previousGreaterElement(int arr[],int idx){

        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;

        st.push(idx);
        res[idx]=1;

        for(int i=idx+1;i<n;i++){

            while(st.size()>0 && arr[st.peek()]<arr[i]){
                st.pop();
            }

            if(st.size()==0) res[i]=i+1;

            else res[i]=i-st.peek();
            st.push(i);

        }



        return res;

    }

    public static void main(String[] args) {

        int arr[]={100,80,60,70,60,75,85};


        int ans[]=previousGreaterElement(arr,0);

        System.out.println(" original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");


            }

        System.out.println();

        System.out.println(" stock span problem ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }



    }
}