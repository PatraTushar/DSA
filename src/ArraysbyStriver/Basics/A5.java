package ArraysbyStriver.Basics;

import java.util.Arrays;

public class A5 {

    static int max(int[] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }

        }

        return max;
    }

    static int min(int[] arr){

        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }

        }

        return min;


    }

    static int[] smallestAndLargest(int[] arr){

        //Time Complexity (TC): O(n)
        //Space Complexity (SC): O(1)
        int largest=max(arr);
        int smallest=min(arr);

        int[] newArr=new int[2];
        newArr[0]=smallest;
        newArr[1]=largest;

        return newArr;


    }

    public static void main(String[] args) {

        // Q: return the smallest and largest element in the form of array

        int[] arr={5,8,1,3,6,2};
       int[] ans= smallestAndLargest(arr);
        System.out.println(Arrays.toString(ans));
    }
}
