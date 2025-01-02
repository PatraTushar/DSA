package DSA_PRACTICE.RECURSION;

import java.util.Scanner;

public class Q82 {

    static void   kMultiples(int num,int k){


        if(k==0){
            return;
        }

        kMultiples(num,k-1);

        System.out.print(num*k +" ");





    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter num ");
        int num=sc.nextInt();

        System.out.println(" enter k ");
        int k=sc.nextInt();

        kMultiples(num,k);
    }
}
