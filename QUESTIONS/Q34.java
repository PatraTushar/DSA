package QUESTIONS;

import java.util.Scanner;
public class Q34 {

    static int countOccurances(int arr[],int x){

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }

        return count;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();


        int arr[]=new int[n];
        System.out.println(" enter " + n + "elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(" enter  X" );
        int x=sc.nextInt();

        System.out.println(" count of x " + countOccurances(arr,x));


      //  int x=5;



    }
}
