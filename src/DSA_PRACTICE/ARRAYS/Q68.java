package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q68 {

    static int[] freqArr(int arr[],int n){

        int frequency[]=new int[100000+1];

        for(int i=0;i<n;i++){
            frequency[arr[i]]++;
        }
    return frequency;
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

        int ans[]=freqArr(arr,n);

        System.out.println(" enter queries ");
        int q=sc.nextInt();


        while(q>0){

            System.out.println(" enter number to be searched ");
            int x=sc.nextInt();

            if(ans[x]>0){
                System.out.println(" yes ");
            }


            else{
                System.out.println(" no ");
            }

            q--;
        }



    }
}
