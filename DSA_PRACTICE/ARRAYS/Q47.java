package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q47 {

    static int tripletPairs(int arr[],int n,int target){

        int count=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){

                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        System.out.println(" enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(" enter target ");
        int target=sc.nextInt();

        System.out.println(" total pair is " +tripletPairs(arr,n,target));

    }
}
