package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        System.out.println(" enter columns ");
        int columns=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){

                if((i+j)%2==0){
                    System.out.print(1);
                }

                else{
                    System.out.print(2);
                }
            }

            System.out.println();
        }



    }
}
