package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q76 {

    static void printNumbers(int n){

        //base case

        if(n==1){

            System.out.println(n);
            return;
        }


        //self work

        System.out.println(n);

        //recursive work

        printNumbers(n-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        printNumbers(n);




    }
}
