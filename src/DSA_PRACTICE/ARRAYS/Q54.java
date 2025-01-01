package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q54 {

    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }


    static void rotateOnce(int arr[],int n){

        int temp=arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }

        arr[n-1]=temp;
    }

    static void rotate(int arr[],int n,int k){

        k=k%n;

        if(k<0){
            k=k+n;
        }

        for(int i=0;i<k;i++){
            rotateOnce(arr,n);
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter rotations ");
        int k=sc.nextInt();


        rotate(arr,n,k);
        System.out.println(" after rotation ");
        printarr(arr,n);





    }
}
