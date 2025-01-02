package RECURSION;

import java.util.Scanner;



public class Q11 {

    static int gcd(int x,int y){

        if(y==0){
            return x;
        }

        int ans=gcd(y,x%y);;

        return ans;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter x");
        int x=sc.nextInt();

        System.out.println(" enter y");
        int y=sc.nextInt();

        int ans=gcd(x,y);

        System.out.println(" gcd is ");
        System.out.println(ans);



    }
}
