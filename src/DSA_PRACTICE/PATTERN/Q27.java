package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){

                if(i==0||j==0||i==rows-1||j==rows-1){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }

    }
}
