package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=1;j<=rows-i-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }

            for(int j=1;j<=rows-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
