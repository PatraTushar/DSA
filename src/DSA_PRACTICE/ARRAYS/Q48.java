package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;


public class Q48 {

    static int findUnique(int arr[],int n){
        int ans=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int i=0;i<n;i++){

            if(arr[i]>0){

                ans=arr[i];

            }
        }


       return ans;

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

        System.out.println(" unique element is " +findUnique(arr,n));

    }
}
