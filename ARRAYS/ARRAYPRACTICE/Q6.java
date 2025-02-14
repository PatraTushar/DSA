package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q6 {

    static void sortedArray(int arr[],int n){

        int ans=Integer.MIN_VALUE;



        for(int i=0;i<n;i++){                     // 1 5 5 7 8

            if(arr[i]>=ans){

                arr[i]++;
                ans=arr[i];

            }

            else{
                System.out.println( " array is not sorted");
                return;
            }

        }

        System.out.println(" array is sorted");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sortedArray(arr,n);



    }
}
