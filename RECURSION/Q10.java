package RECURSION;

import java.util.Scanner;

public class Q10 {

    static int gcd(int x,int y){

        int ans=1;

        for(int i=1;i<=x&i<=y;i++){

            if(x%i==0 && y%i==0){

                ans=i;



            }



        }

        return ans;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter x");
        int x=sc.nextInt();

        System.out.println(" enter y");
        int y=sc.nextInt();

       int ans= gcd(x,y);

        System.out.println(" gcd is ");
        System.out.println(ans);



    }
}
