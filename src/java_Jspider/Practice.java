package java_Jspider;


import java.util.Comparator;


public class Practice {


    static void func() {

        int a = 100;

        if (a >0) {

            a++;
            System.out.println(" if block ");
        }



        else if (a >1000){

            a--;
            System.out.println(" else if block");
        }



        else {

            System.out.println(" else block ");

        }


        System.out.println(a);
    }


    public static void main(String[] args) {

        func();


    }
}
