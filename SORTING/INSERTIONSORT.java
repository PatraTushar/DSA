package SORTING;

import java.util.Scanner;

public class INSERTIONSORT {

    static void insertionSort(int arr[],int n){

        for(int i=1;i<n;i++){

            int j=i;

            if( j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        insertionSort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
