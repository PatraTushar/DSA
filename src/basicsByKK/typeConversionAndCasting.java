package basicsByKK;

import java.util.Scanner;

public class typeConversionAndCasting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
     //   float num=sc.nextFloat();
     //   System.out.println(num);

       // int a=(int)(67.56f);
      //  System.out.println(a);

        //automatic type promotion in expression

     //   int b=257;                    // maximum value we can store in byte is 256
     //   byte c=(byte)(b);
      //  System.out.println(c);         // 257 % 256 =1


//        byte d=40;
//        byte e=50;
//        byte f=100;
//        int ans=(d*e)/f;
//        System.out.println(ans);         //20
//
//        int number='A';
//        System.out.println(number);
//
//

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b) + (i/c) - (d-s);
        System.out.println((f+b) + " " +(i/c) + " " +(d-s));
        System.out.println(result);



    }
}
