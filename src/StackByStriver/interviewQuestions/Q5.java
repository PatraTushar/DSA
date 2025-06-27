package StackByStriver.interviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class Q5 {

    static int[] previousSmallerElement(int[] arr){

        // Time Complexity (TC): O(N)
        // Space Complexity (SC): O(N)

        int[] pse=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while (!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return pse;




    }

    public static void main(String[] args) {

        int[] arr={5,7,9,6,7,4,5,1,3,7};
        int[] ans=previousSmallerElement(arr);
        System.out.println(Arrays.toString(ans));


    }
}
