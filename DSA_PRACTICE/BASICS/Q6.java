package DSA_PRACTICE.BASICS;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();
        int count=0;

        while(n>0){

            n=n/10;
            count++;

        }

        System.out.println(" ans is " +count);


    }
}
