
package QUESTIONS;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
       int number = sc.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {

            System.out.println(" the value is " +number);

        }


    }
}
