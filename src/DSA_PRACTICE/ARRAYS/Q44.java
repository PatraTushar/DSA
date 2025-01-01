package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q44 {

    static int indicesOfLastOccurance(int arr[],int n,int x){

        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]==x){

                index=i;


            }
        }

        return index;
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

        System.out.println(" enter X ");
        int x=sc.nextInt();

        System.out.println(" index of last occurance is " +indicesOfLastOccurance(arr,n,x));


    }
}
