package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q14 {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    static int[] reverse(int arr[],int n){


        int ans[]=new int[n];
        int j=0;

        for(int i=n-1;i>=0;i--){

            ans[j]=arr[i];
            j++;

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];


        System.out.println(" enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]=reverse(arr,n);
        printArray(ans);






    }
}
