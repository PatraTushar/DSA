package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;
public class Q22 {

    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int arr[],int n){

        int ans[]=new int[n];

        ans[0]=arr[0];


        for(int i=1;i<n;i++){

             ans[i]=ans[i-1]+arr[i];

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" input array ");
        printArray(arr,n);

        System.out.println(" prefix array ");
        int ans[]=prefixSum(arr,n);
        printArray(ans,n);






    }
}
