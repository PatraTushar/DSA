package RECURSION;

import java.util.Scanner;

public class Q7 {

    static int power(int p,int q){

        //BASE CASE
        if(q==0){
            return 1;
        }

        //RECURSIVE WORK

        int ans=power(p,q-1);

        //SELF WORK

        int finalAns=ans * p;

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter p ");
        int p= sc.nextInt();

        System.out.println(" enter q ");
        int q=sc.nextInt();


        System.out.println(" power of "  + p + " ^ "  + q + " is " +power(p,q));


    }
}
