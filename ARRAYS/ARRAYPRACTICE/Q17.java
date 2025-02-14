package ARRAYS.ARRAYPRACTICE;

import java.util.Scanner;

public class Q17 {

    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }

    static void frequencyOfSortedArray(int arr[],int n) {

        int freq = 1;
        int i = 1;

        while (i < n) {

            while (i < n && arr[i] == arr[i - 1]) {

                freq++;
                i++;
            }

            System.out.println(arr[i - 1] + " " + freq);
            freq = 1;
            i++;


        }

        if(n==1 || arr[i-1]!=arr[i-2]){
            System.out.println(arr[i-1] + " " + freq);
        }
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

        System.out.println(" given array ");
        printArray(arr,n);

        System.out.println(" frequency array ");
        frequencyOfSortedArray(arr,n);





    }
}
