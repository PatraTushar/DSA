package java_Jspider;

public class Operators {

    public static void main(String[] args) {

//        // pre increment operator
//        int a = 10;
//        System.out.println(a++);
//        System.out.println(a);
//
//
//        int x = 10;
//        int y = x++;
//        System.out.println(y);
//
//
//        int b = 10;
//        int c = b++ + b++;
//        System.out.println(b +  c++);
//


        int a=10;
        int b=a++ + a++ + a;
        int c=++a + ++b + a + b  +10;
        int d=a++ + b++ + c++;
        int e=--a + --b + --c + --d;
        System.out.println(a+b+c+d+e);



    }
}
