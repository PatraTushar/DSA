package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q2 {

    static int maximum(int arr[],int n){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println(" enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter elements in the array ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" maximum element is ");
        int ans=maximum(arr,n);
        System.out.println(ans);


    }
}
