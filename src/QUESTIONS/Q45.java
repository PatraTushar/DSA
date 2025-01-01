package QUESTIONS;


import java.util.Scanner;
public class Q45 {



    static void rotateArrayOne(int arr[]){

        int temp=arr[0];

        for(int i=1;i< arr.length;i++){

            arr[i-1]=arr[i];

        }

        arr[arr.length-1]=temp;

    }



    static void rotate(int arr[],int k){

     k = k % arr.length;

     if(k < 0){
         k = k + arr.length;
     }

        for(int i=1;i<=k;i++){
            rotateArrayOne(arr);
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


        rotate(arr,k);

        System.out.println(" after rotation");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");
        }

    }
}
