package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q19 {

    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sort(int arr[],int n){

        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]!=0 && arr[right]!=1){

                swap(arr,left,right);
                left++;
                right--;

            }

            if(arr[left]==0){
                left++;
            }

            if(arr[right]==1){
                right--;
            }


        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elelments ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" input array ");
        printArray(arr,n);

        sort(arr,n);
        System.out.println(" sorted array ");
        printArray(arr,n);





    }
}
