package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q11 {

    static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverse(int[] arr,int start,int end){


        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void rotateKTimes(int[] arr,int k) {

        int n=arr.length-1;
        k=k%n;

        reverse(arr,0,k);
        reverse(arr,k+1,n);
        reverse(arr,0,n);

        System.out.println(Arrays.toString(arr));


    }





    public static void main(String[] args) {
        // Q: rotate array by k steps  (leeTCode->189)

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int[] arr={1,2,3,4,5,6,7};
        int k=3;
       rotateKTimes(arr,k);



    }
}
