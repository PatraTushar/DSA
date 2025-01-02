package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q52 {

    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;


    }

    static void reverse(int arr[],int n){

        int left=0,right=n-1;

        while(left<right){

            swap(arr,left,right);

           left++;
            right--;

        }
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

        reverse(arr,n);

        System.out.println(" after reverse ");

        printArr(arr,n);










    }
}
