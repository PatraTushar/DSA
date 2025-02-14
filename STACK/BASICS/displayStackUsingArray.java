package STACK;

import java.util.Stack;

public class displayStackUsingArray {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int n=st.size();

        int arr[]=new int[n];

        for(int i=n-1;i>=0;i--){

            int x=st.pop();
            arr[i]=x;

        }

        for(int i=0;i<n;i++){

            System.out.print(arr[i] +" ");
            int x=arr[i];
            st.push(x);
        }
    }
}
