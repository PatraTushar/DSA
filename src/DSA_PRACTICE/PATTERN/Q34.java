package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q34 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        char curr='A';

        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){

                System.out.print((char)(curr + j));

            }

            System.out.println();
        }



    }
}
