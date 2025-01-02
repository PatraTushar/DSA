package QUESTIONS;

import java.util.Scanner;
public class Q51 {

    //without creating new array       i/p-- 2  1  3  4  5        o/p-- 2  3  6  10  15

    static void prefixSum(int arr[]){

        //int ans =arr[0];


        for(int i=1;i< arr.length;i++){

            arr[i]=arr[i-1] + arr[i];


        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];


        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        prefixSum(arr);


        System.out.println(" prefix array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
