package DSA_PRACTICE.PATTERN;
import java.util.Scanner;

public class Q20 {

    static void print18(int rows){
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

    static void print19(int rows){
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

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        print18(rows/2);
        print19(rows/2);




    }
}
