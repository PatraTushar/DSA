package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q16 {

    static int[] suffixSum(int[] arr){
        int n=arr.length;

        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+ arr[i+1];
        }

        return arr;
    }

    static int[] prefixSum(int[] arr){

        for(int i=1;i<arr.length;i++){

            arr[i]=arr[i-1]+arr[i];
        }

        return arr;
    }


    public static void main(String[] args) {

        // Q: prefix sum And suffix sum

        int[] arr={2,1,3,4,5};
      //  int[] prefix=prefixSum(arr);
     //   System.out.println(" prefix array is " +Arrays.toString(prefix));
        int[] suffix=suffixSum(arr);
        System.out.println(" suffix array is " +Arrays.toString(suffix));
    }
}
