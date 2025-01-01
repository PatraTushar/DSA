package SORTING;

import java.util.Scanner;

public class SELECTIONSORT {



    static void selectionSort(int arr[],int n) {      // 2 1 4 5 3


        for(int i=0;i<n-1;i++){

            int min_index=i;

            for(int j=i+1;j<n;j++){

                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }




    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }



        selectionSort(arr,n);

        System.out.println(" after sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }


    }
}
