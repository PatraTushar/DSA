package java_Jspider;

public class NumberSeriesPrograms {


    static void fibonacciSeries(int n) {

        int a = 0;
        int b = 1;


        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;


        }

        System.out.println();
    }


    static void tribonacciSeries(int n) {

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");
            int sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }

        System.out.println();
    }

    static void reverseOfFibonacci(int n) {

        int a = 0;
        int b = 1;
        String res = "";

        for (int i = 0; i < n; i++) {

            res = " " + a + res;
            int c = a + b;
            a = b;
            b = c;

        }

        System.out.println(res.trim();
    }


    static void lucasSeries(int n) {

        int a = 2;
        int b = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;


        }

        System.out.println();


    }

    public static void main(String[] args) {

        fibonacciSeries(5);
        tribonacciSeries(7);
        lucasSeries(8);
        reverseOfFibonacci(5);


    }
}
