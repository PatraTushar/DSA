package functionsByKK;

import java.util.Scanner;

public class primeNumbers {

    static boolean isPrime(int n){

        if(n<1){
            return false;
        }

        int c=2;

        while(c*c<=n){

            if(n%c==0){
                return false;
            }

            c++;
        }

      return c*c>n;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));

        System.out.println(" enter a number ");
        int n=sc.nextInt();
        System.out.println(isPrime(n));


    }
}
