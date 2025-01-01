package SORTING;

import java.util.Scanner;

public class B4 {

    static int searchIndex(int arr[],int n,int target){

        int start=0,end=n-1;


        while(start<=end){


            int mid=start +(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }

            if(arr[mid]<arr[end]){
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }

                else{
                    end=mid-1;
                }

            }

            else {
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }

                else{
                    start=mid+1;
                }
            }
        }


        return -1;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(" enter target  ");
        int target=sc.nextInt();

        System.out.println(" index of " + target + " is " +searchIndex(arr,n,target));
    }
}
