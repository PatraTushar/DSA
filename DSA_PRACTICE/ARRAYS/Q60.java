package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q60 {

    static int[] prefixSum(int arr[],int n){

        int pref[]=new int[n];

        pref[0]=arr[0];

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }

        return pref;
    }

    static int[] suffixSum(int arr[],int n){

        int suff[]=new int[n];

        suff[n-1]=arr[n-1];

        for(int i=n-2;i>0;i--){

            suff[i]=arr[i]+suff[i+1];
        }

        return suff;


    }

    static boolean ans(int[] prefix,int [] suffix,int n){


        for(int i=0;i<n-1;i++){

            if (prefix[i]==suffix[i+1]){

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

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] prefix=prefixSum(arr,n);
        int[] suffix=suffixSum(arr,n);

        boolean ans=ans(prefix,suffix,n);

        System.out.println(" final ans is "  +ans);






    }
}
