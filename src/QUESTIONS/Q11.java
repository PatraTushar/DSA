
package QUESTIONS;
import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

     //   int num=1;
        int sum=0;

      for(int num=1; num<=n; num++){
          sum=sum + num;
      }

        System.out.println(sum);


    }
}

