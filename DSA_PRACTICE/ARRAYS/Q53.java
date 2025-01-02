package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q53 {
    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static int[] reverse(int arr[],int n){

        int newArr[]=new int[n];
        int i=0;

       for(int j=n-1;j>=0;j--){
           newArr[i++]=arr[j];

       }

       return newArr;


    }



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println(" enter " + n + " elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();


    }

       int ans[]= reverse(arr,n);

        System.out.println(" after reverse ");
        printarr(ans,n);





    }
}
