import java.util.Arrays;
import java.util.Stack;

public class myPractice {


    static int sumOfSubArrMin(int[] arr){

        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n];
        int[] smallest=new int[n];

       for(int i=0;i<n;i++){

           while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
               st.pop();
           }

           pse[i]=st.isEmpty() ? -1 : st.peek();
           st.push(i);
       }

       st.clear();

       for (int i=n-1;i>=0;i--){

           while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
               st.pop();
           }

           nse[i]=st.isEmpty() ? n : st.peek();
           st.push(i);
       }


        long total=0;
        int MOD = (int) 1e9 + 7;

        for(int i=0;i<n;i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + arr[i] * left * right) % MOD;

        }


       return (int) total;






    }

    static int sumOfSubArrMax(int[] arr){

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

            while (!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            nge[i]=st.isEmpty() ? n : st.peek();
            st.push(i);
        }




        long total=0;
        int MOD = (int) 1e9 + 7;

        for(int i=0;i<n;i++){
            long left = i - pge[i];
            long right = nge[i] - i;
            total = (total + arr[i] * left * right) % MOD;

        }

        return (int) total;




    }

    static int sumOfRanges(int[] arr){
        return sumOfSubArrMax(arr)-sumOfSubArrMin(arr);
    }






    public static void main(String[] args) {

        int[] arr={3,1,2,4};
        System.out.println(sumOfSubArrMin(arr));





    }


}