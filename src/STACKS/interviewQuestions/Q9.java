package STACKS.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q9 {

    static int[] previousGreaterElement(int[] arr){

        // Time Complexity (TC): O(N)
        // Space Complexity (SC): O(N)

        int[] PSE=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int n=arr.length;

        for(int i=0;i<n;i++){

            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            PSE[i]=st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);


        }

        return PSE;


    }

    public static void main(String[] args) {

        int[] arr={0,3,4,5,2,3,4,1,4};
        int[] ans=previousGreaterElement(arr);
        System.out.println(Arrays.toString(ans));

    }
}
