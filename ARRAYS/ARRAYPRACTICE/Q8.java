package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q8 {

    static int pairSumTriplet(int arr[],int n,int target){

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i+2;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] ==target){
                        count++;





                    }
                }
            }
        }

        return count;
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


        System.out.println(" enter target");
        int target=sc.nextInt();

       int ans=pairSumTriplet(arr,n,target);


        System.out.println(" total number of pair is " +ans);



    }
}
