package ArraysbyStriver.interviewQuestions;


import java.util.Arrays;

public class Q15 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static int[] sorted(int[] arr){

        int n=arr.length;
        int i=0;
        int j=n-1;
        int k=n-1;
        int[] result=new int[n];

        while (i<=j){
            if(k<0) break;;

            if( Math.abs(arr[i])>Math.abs(arr[j])){
                result[k]=arr[i]*arr[i];
                i++;


            }

            else {
                result[k]=arr[j]*arr[j];
                j--;

            }

            k--;

        }



        return result;
    }

    public static void main(String[] args) {

        // Q; Given an array A sorted in non decreasing order return the array of the squares of each number sorted in non decreasing order

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(n)

        int[] arr={-10,-3,-2,1,4,5};
       // int[] arr2={2,4,6,7,10};
        int[] ans=sorted(arr);
        System.out.println(Arrays.toString(ans));

    }
}
