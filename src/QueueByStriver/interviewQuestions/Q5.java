package QueueByStriver.interviewQuestions;

import java.util.Arrays;

public class Q5 {

    static int findMaxInKWindow(int[] arr,int k,int i){

        int max=Integer.MIN_VALUE;

        for(int j=i;j<k+i;j++){

            if(arr[j]>max){
                max=arr[j];
            }


        }

        return max;
    }

    static int[] slidingWindow(int[] arr,int k){

        // Bruteforce Approach

        //Time Complexity: O(n*k)
        //Time Complexity: O(n-k+1)


        int n=arr.length;
        int[] result=new int[n-k+1];

        for(int i=0;i<n-k+1;i++){
            result[i]=findMaxInKWindow(arr,k,i);
        }

        return result;




    }

    static void slidingWindowII(int[] arr,int k){


    }

    public static void main(String[] args) {

        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] ans=slidingWindow(arr,k);
        System.out.println(Arrays.toString(ans));




    }
}
