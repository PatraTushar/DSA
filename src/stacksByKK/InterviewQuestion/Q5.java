package stacksByKK.InterviewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class Q5 {

    static int[] nextSmallerElement(int[] arr){

        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr[n - 1]);
        res[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] <= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }


            st.push(arr[i]);


        }

        return res;

    }

    static int[] nextGreaterElement(int[] arr){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] res=new int[n];
        res[n-1]=-1;
        st.push(arr[n-1]);

        for(int i=n-2;i>=0;i--){

            while (!st.isEmpty() && arr[i]>=st.peek() ){

                st.pop();

            }

            if(st.size()==0){
                res[i]=-1;
            }

            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }



        return res;
    }

    public static void main(String[] args) {

        int[] arr={1,5,3,2,1,6,3,4};
       int[] NGE=nextGreaterElement(arr);
        System.out.println(Arrays.toString(NGE));
        int[] NSE=nextSmallerElement(arr);
        System.out.println(Arrays.toString(NSE));





    }
}
