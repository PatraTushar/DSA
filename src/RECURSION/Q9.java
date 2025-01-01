package RECURSION;

import java.util.Scanner;

public class Q9 {

    static int sumWithAlternateSigns(int n){

        if(n==0){
            return n;
        }

        int ans=sumWithAlternateSigns(n-1);

        int finalAns;

        if(n%2==0){
             finalAns=ans-n;
        }

        else{
             finalAns=ans+n;
        }

        return finalAns;

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter n ");
        int n=sc.nextInt();


        System.out.println("Ans is "+sumWithAlternateSigns(n));

    }
}
