package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q29 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++){

                System.out.print(j+1);

            }

            for(int k=0;k<i;k++){
                System.out.print(k+1);
            }

            System.out.println();
        }

    }
}
