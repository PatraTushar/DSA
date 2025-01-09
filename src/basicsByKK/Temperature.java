package basicsByKK;

import java.util.Scanner;

public class Temperature {

    // convert celsius to fahrenheit

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter temperature in celsius ");
        float tempC=sc.nextFloat();

        float tempF=(tempC * 9/5) +32;
        System.out.println(tempF);


    }
}
