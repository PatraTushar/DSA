package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println((" enter rows "));
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){

            for(int j=0;j<rows-i-1;j++){

                System.out.print(" ");
            }

           for(int k=0;k<i+1;k++){
               System.out.print(k+1);
           }

           for(int l=i;l>0;l--){
               System.out.print(l);
           }

            System.out.println();
        }

    }
}
