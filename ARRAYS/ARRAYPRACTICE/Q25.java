package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q25 {

    static int[] prefixSum(int arr[],int n){

        int pref[]=new int[n];
        pref[0]=arr[0];

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }

        return pref;
    }

    static int[] suffixSum(int arr[],int n){

        int[] suffix=new int[n];

        suffix[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){

            suffix[i]=suffix[i+1]+ arr[i];
        }

        return suffix;



    }

    static boolean equalSumPartition(int arr[]  ,int n){
       int pref[]= prefixSum(arr,n);
       int suffix[]= suffixSum(arr,n);

       for(int i=0;i<=n-2;i++){
           if(pref[i]==suffix[i+1]){
               return true;
           }

       }

       return false;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elelments ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" equal sum partition : " +equalSumPartition(arr,n) );




    }
}
