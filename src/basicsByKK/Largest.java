package basicsByKK;

import java.util.Scanner;

public class Largest {

    static int findMax(int a,int b,int c){
        int max=0;

        if(a>b){
            max=a;
        }
        else {
            max=b;
        }

        if(c>max){
            max=c;
        }

        return max;

    }



    public static void main(String[] args) {

        // find the largest of the 3 numbers

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int ans=findMax(a,b,c);
        System.out.println(ans);





    }
}
