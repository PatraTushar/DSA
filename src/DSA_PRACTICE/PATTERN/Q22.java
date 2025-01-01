package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();



        for(int i=0;i<rows;i++){



            for(int j=0;j<i+1;j++){

                if((i+j)%2==0){

                    System.out.print(" 1 ");

                }

                else{
                    System.out.print(" 0 ");

                }


            }

            System.out.println();
        }

    }
}
