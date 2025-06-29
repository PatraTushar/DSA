package ArraysbyStriver.interviewQuestions;

import java.util.Arrays;

public class Q10 {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr){

        int i=0;
        int j= arr.length-1;

        while (i<j){
            swap(arr,i,j);
            i++;
            j--;

        }

    }

    public static void main(String[] args) {

        // Q: Reverse an array

        int[] arr={45,87,93,12,100};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
