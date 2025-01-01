package DSA_PRACTICE.ARRAYS;

import java.util.Scanner;

public class Q51 {

    static void swap(int x,int y){

        System.out.println(" before swapping ");
        System.out.println(" a : " +x);
        System.out.println(" b : " +y);

        int temp=x;
        x=y;
        y=temp;

        System.out.println(" after swapping ");
        System.out.println(" a : " +x);
        System.out.println(" b : " +y);

    }

    static void swapWithoutTemp(int a,int b){

        System.out.println("original value before swapping");
        System.out.println(" a : " +a);  //9
        System.out.println(" b : " +b);  //3

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("value after swapping");
        System.out.println(" a : " +a);
        System.out.println(" b : " +b);


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);



        System.out.println(" enter a ");
        int a=sc.nextInt();

        System.out.println(" enter b ");
        int b=sc.nextInt();


      //  swap(a,b);
        swapWithoutTemp(a,b);




    }
}
