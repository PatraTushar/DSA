package SORTING;

import java.util.Scanner;


public class BUBBLESORT {

    static void bubbleSort(int arr[],int n){

        for(int i=0;i<n-1;i++){

            boolean flag=false;
            for(int j=0;j<n-1-i;j++){

                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }

            if(!flag){
                return;
            }
        }






    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        bubbleSort(arr,n);


        System.out.println("after sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }







}
