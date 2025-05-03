package ArraysbyKK.interviewQuestions;

import OopsByKK.AccessModifier.Public.A;

import java.util.Arrays;

public class Q14 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static int[]  order(int[] arr){

        int i=0;
        int j=arr.length-1;

        while (i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;

            }

            else if(arr[i]%2==0){
                i++;
            }

            else j--;


        }

        return arr;


    }


    public static void main(String[] args) {

        // Q: move all the even integers at teh beginning followed by all the odd integers

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)

        int[] arr={1,2,3,4,5,6,7,8};
        int[] ans=order(arr);
        System.out.println(Arrays.toString(ans));


    }
}
