package ArraysbyKK.strivers;

import java.util.Arrays;

public class Q1 {

    static void swap(int[] arr,int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int[] removeZeroesToEnd(int[] arr){

        int j=-1;

     for(int i=0;i<arr.length;i++){

         if(arr[i]==0){
             j=i;
             break;
         }

     }
     if(j==-1) return arr;

     for (int i=j+1;i<arr.length;i++){

         if(arr[i]!=0){
             swap(arr,i,j);
             j++;

         }




     }
     return arr;


    }

    public static void main(String[] args) {

        // move all zeroes to the end of the array (leeTCode-->283)

        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int[] Ans=removeZeroesToEnd(arr);
        System.out.println(Arrays.toString(Ans));
    }
}
