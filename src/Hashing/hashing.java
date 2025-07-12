package Hashing;

import java.util.Arrays;

public class hashing {

    static int maximum(int arr[]){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    static int[] hash(int arr[]){

        int max=maximum(arr);

        int[] hash=new int[max+1];

        for(int i=0;i<arr.length;i++){

            hash[arr[i]]+=1;

        }

        return hash;

    }

    public static void main(String[] args) {

        int arr[]={1,2,1,3,2};
       int ans[]= hash(arr);
        System.out.println(Arrays.toString(ans));




    }
}
