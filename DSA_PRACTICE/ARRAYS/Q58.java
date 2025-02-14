package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q58 {

    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }


    static int[] prefixSum(int arr[],int n){

        int pref[]=new int[n];
        pref[0]=arr[0];

        for(int i=1;i<n;i++){

            pref[i]=pref[i-1]+arr[i];


        }

        return pref;
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

        int ans[]=prefixSum(arr,n);

        System.out.println(" prefix sum is ");
        printarr(ans,n);




    }
}
