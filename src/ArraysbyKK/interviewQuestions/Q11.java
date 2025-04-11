package ArraysbyKK.interviewQuestions;

import java.util.Arrays;

public class Q11 {

    static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverse(int[] arr,int i,int j){


        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        // Q: rotate array by k steps  (leeTCode->189)

        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));




    }
}
