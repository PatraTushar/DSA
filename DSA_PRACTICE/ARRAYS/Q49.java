package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q49 {


    static int Max(int arr[],int n){

        int maximum=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }

        return maximum;

    }


    static int secondMax(int arr[],int n){

        int ans=Max(arr,n);

        for(int i=0;i<n;i++){
            if(arr[i]==ans){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        for(int i=0;i<n;i++){
            ans=Max(arr,n);

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

        System.out.println(" second max is " +secondMax(arr,n));








    }
}
