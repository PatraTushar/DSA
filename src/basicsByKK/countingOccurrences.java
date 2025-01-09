package basicsByKK;

import java.util.Scanner;

public class countingOccurrences {

    static int occurrencesCount(int n,int x){

        int count=0;

        while(n>0){

            if(n%10==x){
                count++;

            }

            n=n/10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter a number ");
        int n=sc.nextInt();

        System.out.println(" enter a number to find how many time is is occurring in n ");
        int x=sc.nextInt();

        int ans=occurrencesCount(n,x);
        System.out.println(" ans is " +ans);

    }
}
