package RECURSION;

import java.util.Scanner;

public class Q6 {

   static  int count=0;

    static int countOfDigits(int n){





        if(n>0){
            count++;
            countOfDigits(n/10);

        }



        return count;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter n ");
         int n= sc.nextInt();


        System.out.println(" number of digits ");
        System.out.println(countOfDigits(n));

    }
}
