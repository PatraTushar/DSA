package ArraysbyKK.Basics;

import java.util.Arrays;

public class ReversingAnArray {

    static void reverse(int num[]){


        int i=0;
        int j=num.length-1;

      while(i<=j){

          swap(num,i,j);
          i++;
          j--;


      }

        System.out.println(Arrays.toString(num));
    }

    static void swap(int arr[],int start,int end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60,70};
        reverse(arr);
    }
}
