package SORTING;

import java.util.Scanner;

public class B8 {


    static int peakElement(int arr[],int n){

        int start=0,end=n-1;
        int ans=-1;

        while (start <= end) {

            int mid=start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){

                ans=mid+1;
                start=mid+1;

            }

            else{
                end=mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(" peak index is " +peakElement(arr,n));



    }
}
