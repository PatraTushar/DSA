package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q15 {





    static void reverse(int arr[]){

        int n=arr.length;

        int i=0,j=n-1;

        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }




    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        reverse(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }







    }
}
