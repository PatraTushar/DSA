package DSA_PRACTICE.PATTERN;
import java.util.Scanner;

public class Q26 {

    static void part1(int rows){

        for(int i=0;i<rows;i++){

            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<8-(2*i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void part2(int rows){

        for(int i=0;i<rows;i++){

            for(int j=0;j<rows-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<(2*i)+2;j++){
                System.out.print(" ");
            }

            for(int j=0;j<rows-i;j++){
                System.out.print("*");
            }

            System.out.println();


        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        part1(rows/2);
        part2((rows/2)-1);

    }
}
