package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){

            for(int j=0;j<2*i-i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<rows+(4-(2*i));j++){
                System.out.print("*");
            }

            for(int j=0;j<2*i-i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }



    }
}
