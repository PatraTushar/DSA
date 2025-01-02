package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q75 {

    static void printNumbers(int n){


        if(n==1){
            System.out.println(1);
            return;

        }

         //recursive work
        printNumbers(n-1);

        //self work

        System.out.println(n);


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        printNumbers(n);


    }
}
