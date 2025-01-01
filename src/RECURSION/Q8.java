package RECURSION;

import java.util.Scanner;

public class Q8 {

    static void printMultiples(int n,int k){

        //BASE CASE
        if(k==0){
            return;

        }

        //RECURSIVE WORK

        printMultiples(n,k-1);

        //SELF WORK

        System.out.println(n * k);




    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();

        System.out.println(" enter k ");
        int k=sc.nextInt();

        printMultiples(n,k);

    }
}
