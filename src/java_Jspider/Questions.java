package java_Jspider;

public class Questions {

    static void printFactor(int n) {


        int fact = 1;

        while (fact <= n) {

            if (n % fact == 0) {
                System.out.println(fact);

            }

            fact++;
        }
    }

    static void isPrime(int num) {

        if (num < 2) {
            System.out.println(" Not Prime Number ");
            return;
        }


        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                System.out.println(" Not Prime Number ");
                return;
            }
        }

        System.out.println(" Prime Number ");

    }

    static int countNumbers(int n) {

        int count = 0;

        while (n > 0) {

            count++;
            n = n / 10;

        }

        return count;
    }

    static int sumOfDigit(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    static int productOfDigit(int num) {


        int product = 1;

        while (num > 0) {

            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        return product;


    }

    static void findSumOfOddAndEven(int num) {

        int oddSum = 0;
        int evenSum = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) evenSum += digit;
            else oddSum += digit;
            num /= 10;
        }

        System.out.println(oddSum);
        System.out.println(evenSum);

    }

    static int reverse(int num) {

        int rev = 0;

        while (num > 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }


    static boolean isPalindrome(int num) {

        int actualNum = num;
        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;

            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return actualNum == rev;


    }

    static int findSum(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    static int findProduct(int num) {

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num = num / 10;
        }

        return product;

    }


    static boolean spyNumber(int num) {

        int sum = findSum(num);
        int product = findProduct(num);

        return sum == product;
    }


    static boolean harshadNumber(int num) {

        int sum = findSum(num);

        return num % sum == 0;


    }

    static int binaryToDecimal(int binary) {


        int exponential = 1;
        int sum = 0;

        while (binary > 0) {

            int lastDigit = binary % 10;

            if (lastDigit == 1) sum += exponential;

            exponential *= 2;
            binary /= 10;
        }

        return sum;


    }

    static int findFact(int num) {

        int fact = 1;

        for (int i = num; i >= 1; i--) {

            fact *= i;
        }

        return fact;
    }


    static boolean strongNumber(int num) {


        if (num == 0) return false;

        int actualNum = num;
        int factSum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            int fact = findFact(lastDigit);
            factSum += fact;
            num /= 10;

        }

        return actualNum == factSum;
    }


    static boolean primeOrNot(int num) {

        if (num < 2) {
            return false;
        }


        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;


    }

    static boolean twistedPrime(int num) {

        int rev = reverse(num);

        return primeOrNot(num) == primeOrNot(rev);


    }

    static int findHCForGCD(int x, int y) {

        while (y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        return x;
    }




    public static void main(String[] args) {

        printFactor(20);

        System.out.println(countNumbers(12345));
        System.out.println(sumOfDigit(12345));
        System.out.println(productOfDigit(12345));
        findSumOfOddAndEven(123456);
        System.out.println(reverse(12345));
        System.out.println(isPalindrome(12321));
        System.out.println(spyNumber(231));
        System.out.println(binaryToDecimal(1010100));
        System.out.println(strongNumber(145));
        System.out.println(twistedPrime(13));
        System.out.println(findHCForGCD(10,20));


    }
}
