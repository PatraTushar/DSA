package DSA_PRACTICE.PATTERN;
import java.util.Scanner;

public class Q32 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter rows ");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1 +" ");
            }

            System.out.println();
        }

    }
}
