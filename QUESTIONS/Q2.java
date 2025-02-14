
package QUESTIONS;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter principle");
        float p=sc.nextFloat();

        System.out.println("enter interest");
        float r=sc.nextFloat();

        System.out.println("enter time");
        float t=sc.nextFloat();

        float SI=(p * r * t)/100;

        System.out.println("principle" +p);
        System.out.println("rate" +r);
        System.out.println("time" +t);

        System.out.println("simple interest" +SI);
    }

}
