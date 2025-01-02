package BASICS;
import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("ur name is " +name);

        System.out.println("enter number");
        int a=sc.nextInt();

        System.out.println(" the entered number is " +a);


    }
}
