package QUESTIONS;
import java.util.Scanner;
public class Q26 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println(" enter rows ");

        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){

            //spaces

            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }


            //stars

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }


            //spaces

            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }





    }
}
