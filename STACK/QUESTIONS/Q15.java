package STACK.QUESTIONS;

import java.util.Stack;

public class Q15 {

    public static int largestAreaInHistogram(int arr[]){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;

        int NSE[]=new int[n];
        int PSE[]=new int[n];

        //calculate the next smaller element

        st.push(n-1);
        NSE[n-1]=n;

        for(int i=n-2;i>=0;i--){

            while(st.size()>0 && arr[i]<arr[st.peek()]){

                st.pop();
            }

            if(st.size()==0) NSE[i]=n;

            else NSE[i]=st.peek();

            st.push(i);
        }

        // make the stack empty

        while(st.size()>0) st.pop();


        //calculate the next previous element

        st.push(0);
        PSE[0]=-1;

        for(int i=1;i<n;i++){

            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }

            if(st.size()==0) PSE[i]=-1;

            else PSE[i]=st.peek();

            st.push(i);

        }


        int max=-1;
        for(int i=0;i<n;i++){

            int area=arr[i]*(NSE[i]-PSE[i]-1);

            if(area>max) max=area;


        }

        return max;


    }

    public static void main(String[] args) {

        int arr[]={5,2,4,6,3,5};

        int ans=largestAreaInHistogram(arr);

        System.out.println(" largest area is " +ans);




    }
}
