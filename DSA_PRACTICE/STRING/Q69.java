package DSA_PRACTICE.STRING;

import java.util.Scanner;

public class Q69 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

       String str="abcd";

       for(int i=0;i<4;i++){
           for(int j=i+1;j<=4;j++){
               System.out.print(str.substring(i,j) +" ");
           }
       }






    }
}
