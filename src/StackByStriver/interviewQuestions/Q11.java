package StackByStriver.interviewQuestions;

import java.util.Stack;

public class Q11 {

    static long sumOfSubArrMax(int[] arr){

        //Time Complexity (TC): O(N)
        //Space Complexity (SC): O(N)

        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] pge=new int[n];
        int[] nge=new int[n];

        for(int i=0;i<n;i++){

            while (!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            pge[i]=st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i=n-1;i>=0;i--){

            while (!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }

            nge[i]=st.isEmpty() ? n : st.peek();
            st.push(i);
        }




        long total=0;


        for(int i=0;i<n;i++){
            long left = i - pge[i];
            long right = nge[i] - i;
            total = (total + arr[i] * left * right);

        }

        return  total;




    }

    public static void main(String[] args) {

        int[] arr={1,4,3,2};
        System.out.println(sumOfSubArrMax(arr));


    }
}
