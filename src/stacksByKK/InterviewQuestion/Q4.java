package stacksByKK.InterviewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class Q4 {

    static int[] consecutiveSubsequence(int[] arr){

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            if(st.isEmpty() || st.peek()!=arr[i]) st.push(arr[i]);



            else if (arr[i]==st.peek()) {

                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }

            }
        }

        int num[]=new int[st.size()];

        for(int i=num.length-1;i>=0;i--){
            num[i]=st.pop();
        }

        return num;
    }

    public static void main(String[] args) {

        int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] Ans=consecutiveSubsequence(arr);
        System.out.println(Arrays.toString(Ans));

    }
}
