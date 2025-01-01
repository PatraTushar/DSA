
package QUESTIONS;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int number = sc.nextInt();

        if (number % 3 == 0 || number % 5 == 0) {

            System.out.println(" the value is " + number);

        }
    }
}