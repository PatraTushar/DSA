package java_Jspider;

public class NumberPrograms {

    static boolean isPalindrome(int num) {

        int actualNum = num;
        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return rev == actualNum;

    }


    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) return false;
        }

        return true;

    }


    static boolean spyNumber(int num) {

        int sumOfDigit = 0;
        int productOfDigit = 1;

        while (num > 0) {

            int lastDigit = num % 10;
            sumOfDigit += lastDigit;
            productOfDigit *= lastDigit;
            num /= 10;
        }

        return sumOfDigit == productOfDigit;

    }


    static boolean HarshadNumber(int num) {

        if (num <= 0) return false;

        int actualNum = num;
        int sumOfDigit = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sumOfDigit += lastDigit;
            num /= 10;
        }

        return actualNum % sumOfDigit == 0;
    }


    static long findFactorial(int num) {

        long fact = 1;

        for (int i = num; i >= 1; i--) {

            fact *= i;
        }

        return fact;
    }


    static boolean strongNumber(int num) {

        int actualNum = num;
        int factorialSum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            int fact = (int) findFactorial(lastDigit);
            factorialSum += fact;
            num /= 10;


        }

        return actualNum == factorialSum;


    }


    static boolean strongNumberOptimized(int num) {

        if (num < 0) return false;

        int actualNum = num;
        int factorialSum = 0;

        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        while (num > 0) {

            int lastDigit = num % 10;
            factorialSum += fact[lastDigit];
            num /= 10;
        }

        return actualNum == factorialSum;
    }


    static int reverse(int num) {

        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return rev;
    }


    static boolean twistedPrimeNumber(int num) {

        int rev = reverse(num);

        boolean numberIsPrime = isPrime(num);
        boolean revIsPrime = isPrime(rev);

        return numberIsPrime && revIsPrime;


    }


    static boolean armstrongNumber(int num) {


        int actualNum = num;
        int countDigit = 0;
        int temp = num;

        while (temp > 0) {

            countDigit++;
            temp /= 10;
        }


        int newNumber = 0;


        while (num > 0) {

            int lastDigit = num % 10;
            newNumber += Math.pow(lastDigit, countDigit);
            num /= 10;


        }

        return actualNum == newNumber;


    }


    static boolean disariumNumber(int num) {

        int actualNum = num;
        int countOfDigit = 0;
        int temp = num;

        while (temp > 0) {

            countOfDigit++;
            temp /= 10;
        }


        int newNumber = 0;


        while (num > 0) {

            int lastDigit = num % 10;
            newNumber += Math.pow(lastDigit, countOfDigit--);
            num /= 10;
        }

        return actualNum == newNumber;

    }


    static boolean megaPrimeNumber(int num) {


        if (!isPrime(num)) return false;


        while (num > 0) {

            int lastDigit = num % 10;

            if (lastDigit != 2 && lastDigit != 3 && lastDigit != 5 && lastDigit != 7) return false;

            num /= 10;

        }

        return true;


    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPrime(13));
        System.out.println(spyNumber(231));
        System.out.println(HarshadNumber(24));


    }
}
