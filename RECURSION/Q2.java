package RECURSION;

import java.util.Scanner;

public class Q2 {

    static void printDecreasing(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter input");
        int n= sc.nextInt();

        printDecreasing(n);
    }
}
