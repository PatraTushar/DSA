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

        System.out.println(res.trim());
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

    static int rev(int num) {


        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;

        }

        return rev;
    }

    static boolean checkPalindrome(int num) {

        return num == rev(num);
    }

    static void palindromeSeries(int n) {

        int count = 0;

        for (int i = 10; ; i++) {


            if (checkPalindrome(i)) {

                System.out.print(i + " ");
                count++;

                if (count == n) break;
            }
        }


    }

    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) return false;
        }


        return true;
    }


    static void primeNumberSeries(int n) {

        if (n <= 0) return;

        int count = 0;

        for (int i = 1; ; i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");
                count++;

                if (count == n) break;
            }
        }


    }


    static boolean twistedPrimeNumber(int num) {

        int rev = rev(num);

        boolean numberIsPrime = isPrime(num);
        boolean revIsPrime = isPrime(rev);

        return numberIsPrime && revIsPrime;


    }

    static void twistedPrimeNumberSeries(int n) {

        int count=0;

        for (int i = 10; ; i++) {

            if (twistedPrimeNumber(i)){

                System.out.print(i+" ");
                count++;

                if (count==n) break;
            }
        }
    }


    public static void main(String[] args) {

        fibonacciSeries(5);
        tribonacciSeries(7);
        lucasSeries(8);
        reverseOfFibonacci(5);

        palindromeSeries(10);
        System.out.println();
        primeNumberSeries(10);
        System.out.println();
        twistedPrimeNumberSeries(10);
        System.out.println();

        reverseOfFibonacci(8);


    }
}
