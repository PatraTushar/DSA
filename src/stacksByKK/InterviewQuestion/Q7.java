package stacksByKK.InterviewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class Q7 {

    static int[] stockSpan(int[] arr){

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int res[]=new int[n];
        res[0]=1;
        st.push(0);


        for(int i=1;i<n;i++){

            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i]=i+1;

            }

            else {
                res[i]=i-st.peek();
            }

            st.push(i);
        }

        return res;
    }

    public static void main(String[] args) {

        // Q: stock span problem

        int[] arr={100,80,60,70,60,75,85};
        int[] Ans=stockSpan(arr);
        System.out.println(Arrays.toString(Ans));

    }
}
