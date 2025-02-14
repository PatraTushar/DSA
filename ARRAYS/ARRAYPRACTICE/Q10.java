package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q10 {

    static int largest(int arr[],int n){

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        return largest;
    }

    static int secondLargest(int arr[],int n){

        int max=largest(arr,n);

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int secondLargest=largest(arr,n);
        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=secondLargest(arr,n);
        System.out.println(" second largest element is " +ans);





    }
}