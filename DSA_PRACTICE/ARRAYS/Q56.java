package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q56 {

    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void swap(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void sort(int arr[],int n){

        int left=0,right=n-1;

        while(left<=right){

            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left]%2==0){
                left++;
            }

            if(arr[right]%2!=0){
                right--;
            }
        }
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


        sort(arr,n);
        System.out.println(" after sorting");

        printarr(arr,n);
    }
}
