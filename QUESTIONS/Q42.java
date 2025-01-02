package QUESTIONS;

public class Q42 {
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

    static void swap(int a,int b){

        System.out.println("original value before swapping");
        System.out.println(" a : " +a);  //9
        System.out.println(" b : " +b);  //3

       int temp=a;
        a=b;
        b=temp;
        System.out.println("value after swapping");
        System.out.println(" a : " +a);
        System.out.println(" b : " +b);



    }

    public static void main(String[] args) {

        int a=9;
        int b=3;
        int arr[]=new int[1];

        //  swap(a,b);
        swapWithoutTemp(a,b);

    }
}
