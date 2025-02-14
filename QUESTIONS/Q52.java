package QUESTIONS;

import java.util.Scanner;
public class Q52 {

    static int[] prefixSum(int arr[]){

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+ arr[i-1];
        }

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n + 1];

        System.out.println(" enter " + n +  " elements ");

        for(int i=1;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int prefsum[]=prefixSum(arr);

        System.out.println(" enter number queries ");
        int q=sc.nextInt();

        while(q-- > 0){

            System.out.println(" enter range ");
            int l= sc.nextInt();
            int r=sc.nextInt();

            int ans=prefsum[r] -prefsum[l-1];

            System.out.println(" sum " +ans);

        }


    }
}
