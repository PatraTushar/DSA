package SORTING;

import java.util.Scanner;

public class Q1 {

    static void sorting(int arr[]){

        int n= arr.length;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==0 && arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }



    public static void main(String[] args) {

        int arr[]={0,5,0,3,42};

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        sorting(arr);

        System.out.println(" after sorting ");

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }



    }
}
