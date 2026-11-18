public class dsaPractice {

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

    static boolean isPrime(int num) {

        if (num < 2) return false;


        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) return false;
        }

        return true;
    }


    static boolean spyNumber(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += lastDigit;
            product *= lastDigit;
            num /= 10;
        }

        return sum == product;
    }


    static boolean HarshadNumber(int num) {

        int actualNum = num;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return actualNum % sum == 0;
    }


    static int findFactorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    static boolean strongNumber(int num) {

        int actualNum = num;
        int factSum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            factSum += findFactorial(lastDigit);
            num /= 10;

        }

        return actualNum == factSum;

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

    static boolean twistedPrime(int num) {

        int rev = reverse(num);
        boolean numIsPrime = isPrime(num);
        boolean revIsPrime = isPrime(rev);

        return numIsPrime && revIsPrime;
    }


    static int countDigits(int num) {

        int count = 0;

        while (num > 0) {

            count++;
            num /= 10;
        }

        return count;

    }

    static boolean armStrong(int num) {

        int actualNum = num;

        int digitCount = countDigits(num);
        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digitCount);
            num /= 10;

        }


        return sum == actualNum;


    }


    static boolean disariumNumber(int num) {

        int actualNum = num;

        int digitCount = countDigits(num);
        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digitCount--);
            num /= 10;

        }


        return sum == actualNum;

    }


    static boolean megaPrime(int num) {

        int actualNum = num;

        if (!isPrime(num)) return false;

        while (num > 0) {

            int lastDigit = num % 10;

            if (lastDigit != 2 && lastDigit != 3 && lastDigit != 5 && lastDigit != 7) return false;

            num /= 10;
        }

        return true;
    }


    static boolean autoMorphic(int num) {


        int square = num * num;

        while (num > 0) {

            if (num % 10 != square % 10) return false;
            num /= 10;
            square /= 10;
        }

        return true;
    }


    static boolean techNumber(int num) {

        int actualNum = num;
        int countDigits = countDigits(num);

        if (countDigits % 2 != 0) return false;

        int divisor = 1;

        for (int i = 0; i < countDigits / 2; i++) {
            divisor *= 10;
        }

        int firstHalf = actualNum / divisor;
        int secondHalf = actualNum % divisor;

        int sum = firstHalf + secondHalf;

        return sum * sum == actualNum;


    }


    static boolean evilNumber(int num) {

        int countOnes = 0;

        while (num > 0) {

            countOnes += num % 2;
            num /= 2;

        }

        return countOnes % 2 == 0;
    }

    static int findHcf(int x, int y) {

        while (y != 0) {

            int rem = x % y;
            x=y;
            y=rem;

        }

        return x;

    }

    public static void main(String[] args) {


    }
}


