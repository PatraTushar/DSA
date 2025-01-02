package QUESTIONS;

import java.util.Scanner;

public class Q53 {

    static int[] prefixArray(int arr[]){

        int m= arr.length;
       int pref[]=new int[m];
        pref[0]=arr[0];

        for(int i=1;i<arr.length;i++){

            pref[i]=pref[i-1] + arr[i];
        }

        return pref;



    }


    static int[] suffixSum(int arr[]){

        int m=arr.length;
        int suff[]=new int[m];

        suff[m-1]=arr[m-1];

        for(int i=m-2;i>=0;i--){

            suff[i]=suff[i+1] + arr[i];
        }

        return suff;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println( " enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        int pref[]=prefixArray(arr);

        int suff[]=suffixSum(arr);







    }
}
