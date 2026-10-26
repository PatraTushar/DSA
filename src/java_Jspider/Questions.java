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

    static void reverse(int num) {

        int rev = 0;

        while (num > 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println(rev);
    }


    static boolean isPalindrome(int num) {

        int actualNum=num;
        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;

            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return actualNum == rev;


    }

    static int findSum(int num){

        int sum=0;

        while (num>0){

            int digit=num%10;
            sum+=digit;
            num/=10;
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


        static boolean spyNumber(int num){

            int sum = findSum(num);
            int product = findProduct(num);

            return sum == product;
        }


        static boolean harshadNumber(int num){

        int sum=findSum(num);

        return num%sum==0;


        }



    public static void main(String[] args) {

        printFactor(20);

        System.out.println(countNumbers(12345));
        System.out.println(sumOfDigit(12345));
        System.out.println(productOfDigit(12345));
        findSumOfOddAndEven(123456);
        reverse(12345);
        System.out.println(isPalindrome(12321));
        System.out.println(spyNumber(231));


    }
}
