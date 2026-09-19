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


//        int a=10;
//        int b=a++ + a++ + a;
//        int c=++a + ++b + a + b  +10;
//        int d=a++ + b++ + c++;
//        int e=--a + --b + --c + --d;
//        System.out.println(a+b+c+d+e);


        int a = 10;
        int b = a++ + a-- + a++ + a--;
        int c = a++ + b-- + b-- + b-- + a;
        int d = --a + --b + --c + ++a + ++b + ++c;
        System.out.println(--a + --b + ++c + ++d);


        System.out.println(!true);
        System.out.println(!false);


        char c1 = 'a';
        System.out.println(++c1);
        System.out.println(++c1);
        System.out.println(++c1);


        System.out.println(10 + 10);
        System.out.println('a' + 10);
        System.out.println("Hi" + 10 + 20);
        System.out.println("Hi" + (10 + 20));
        System.out.println("Hi" + true + 30);
        System.out.println(true + "Hi" + 20);
        //System.out.println(true+10+20);  // CTE


        System.out.println(" ---------------------------- ");


        int n = 123;

        while (n > 0) {

            System.out.println(n % 10);
            n = n / 10;


        }

        System.out.println(" ------------------------- ");

        int n1 = 626262;
        while (n1 > 0) {

            System.out.println(n1 % 10);
            n1 = n1 / 10;


        }


        System.out.println(" ----------------------- ");

        int n2 = 123456;
        while (n2 > 0) {

            System.out.println(n2 % 100);
            n2 = n2 / 100;


        }


        System.out.println("------------------------");

        int p1 = 10;
        p1 += 20;
        System.out.println(p1);


        float f=23.7f;
        f+=10;
        System.out.println(f);


        char ch='c';
        ch+=10;
        System.out.println(ch);


        long l=23;
        l+=40.21;
        System.out.println(l);


        double d2=34.5;
        d2+='a';
        System.out.println(d2);



        short s=23;
        s+=20.4;
        System.out.println(s);



        char c3='e';
        c3+=2.2;
        System.out.println(c3);



        long l1=23;
        l1%=10;
        System.out.println(l1);


        long l2=55;
        l2%=10.5;
        System.out.println(l2);


        String s1="Hello";
        s1+=10;
        System.out.println(s1);

        String s3="welcome";
        s3+='A';
        System.out.println(s3);



    }
}
