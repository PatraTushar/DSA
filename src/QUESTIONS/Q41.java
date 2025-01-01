package QUESTIONS;

import java.util.Scanner;
public class Q41 {

    static int firstRepeatingNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println(" first repeating number " +firstRepeatingNumber(arr));


    }
}
