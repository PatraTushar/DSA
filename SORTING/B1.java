package SORTING;

import java.util.Scanner;

public class B1 {

    static int firstOccurance(int arr[],int n,int x){

        int start=0,end=n-1;
        int firstOccurance=-1;

        while(start<=end){

            int mid=start + (end-start)/2;

            if(x==arr[mid]){
                firstOccurance=mid;
                end=mid-1;
            }
            else if (x>arr[mid]) {
                start=mid+1;

            }

            else {
                end=mid-1;
            }

        }

        return firstOccurance;

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

        System.out.println(" enter x  ");
        int x=sc.nextInt();

        int finalAns=firstOccurance(arr,n,x);
        System.out.println(" first occurance of " + x + " is " +finalAns);

    }
}
