package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q24 {

    static int[] makeFrequencyArray(int arr[],int n){

        int freq[]=new int[100005];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        return freq;

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

        int[] freq=makeFrequencyArray(arr,n);

        System.out.println(" enter queries ");
        int Q=sc.nextInt();

        while(Q>0){
            System.out.println(" enter number to be searched ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println(" yes ");
            }
            else {
                System.out.println(" no ");
            }
            Q--;
        }


    }
}


