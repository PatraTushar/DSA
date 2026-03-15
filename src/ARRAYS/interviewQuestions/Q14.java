package ARRAYS.interviewQuestions;

import java.util.Arrays;

public class Q14 {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static int[]  order(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)


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

    static int[] sort(int[] arr) {

        // here order matters

        int[] result = new int[arr.length];

        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) evenCount++;

        }

        int left = 0;
        int right = evenCount;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) result[left++] = arr[i];

            else result[right++]=arr[i];


        }

        return result;


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
