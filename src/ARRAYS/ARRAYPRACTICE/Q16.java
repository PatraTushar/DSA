package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q16 {

    static void rotateArrayOnce(int arr[],int n,int k){       //1 2 3 4 5

        int temp=arr[0];

        for(int i=1;i<n;i++){

            arr[i-1]=arr[i];
        }

        arr[n-1]=temp;

    }

    static void rotate(int arr[],int n,int k){

        k=k%n;

        if (k < 0) {

            k=k+n;
        }

        for(int i=1;i<=k;i++){

            rotateArrayOnce(arr,n,k);

        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0; i<arr.length; i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("enter k");
        int k= sc.nextInt();

        System.out.println(" original array ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();

      //  rotateArrayOnce(arr,n,k);
        rotate(arr,n,k);
        System.out.println(" rotate array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
