package DSA_PRACTICE.PATTERN;

import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        System.out.println(" enter columns ");
        int columns=sc.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
