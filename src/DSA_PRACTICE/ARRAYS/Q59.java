package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q59 {

    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void prefixSum(int arr[],int n){


        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        prefixSum(arr,n);
        printarr(arr,n);



    }
}
