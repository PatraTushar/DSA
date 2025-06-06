package stacksByKK.InterviewQuestion;

import java.util.Arrays;
import java.util.Stack;

public class Q6 {

    static int[] previousSmallerElement(int[] arr){

        // Q previous smaller element

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int res[]=new int[n];
        res[0]=-1;
        st.push(arr[0]);


        for(int i=1;i<n;i++){

            while (!st.isEmpty() && arr[i]<=st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                res[i]=-1;

            }

            else {
                res[i]=st.peek();
            }

            st.push(arr[i]);
        }

        return res;


    }

    static int[] previousGreaterElement(int[] arr){

        // Q: previous greater element

        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] res=new int[n];
        res[0]=-1;
        st.push(arr[0]);

        for(int i=1;i<n;i++){

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

        int[] arr={100,80,60,70,60,75,85};
        int[] PGE=previousGreaterElement(arr);
        System.out.println(Arrays.toString(PGE));
        int[] PSE=previousSmallerElement(arr);
        System.out.println(Arrays.toString(PSE));

    }
}
