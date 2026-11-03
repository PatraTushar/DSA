package java_Jspider;

import java.util.Scanner;

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


    static boolean automorphicNumber(int num) {

        if (num < 0) return false;

        int temp = num;
        int square = num * num;


        while (temp > 0) {

            if (temp % 10 != square % 10) return false;

            temp /= 10;
            square /= 10;
        }


        return true;
    }


    static boolean techNumber(int num) {

        int actualNum = num;

        int countOfDigit = 0;

        while (num > 0) {
            countOfDigit++;
            num /= 10;
        }


        if (countOfDigit % 2 != 0) return false;

        int divisor = 1;

        for (int i = 0; i < countOfDigit / 2; i++) {

            divisor *= 10;

        }

        int firstHalf = actualNum / divisor;
        int secondHalf = actualNum % divisor;


        int sum = firstHalf + secondHalf;

        return sum * sum == actualNum;


    }


    static boolean neonNumber(int num) {

        int square = num * num;
        int sum = 0;

        while (square > 0) {

            int lastDigit = square % 10;
            sum += lastDigit;
            square /= 10;
        }

        return sum == num;

    }

    static String decimalToBinary(int num) {

        if (num == 0) return "0";

        String binary = "";

        while (num > 0) {

            int rem = num % 10;
            binary += rem;
            num /= 10;

        }

        return binary;

    }

    static boolean evilNumber(int num) {

        String binary = decimalToBinary(num);

        int countOnes = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') countOnes++;
        }

        return countOnes % 2 == 0;

    }


    static boolean evilNumberOptimized(int num) {

        if (num < 0) return false;

        int countOnes = 0;

        while (num > 0) {


            countOnes += num % 2;
            num /= 2;

        }

        return countOnes % 2 == 0;
    }


    static int largestInDigit(int digit) {

        int largest = 0;

        while (digit > 0) {

            int lastDigit = digit % 10;

            if (lastDigit > largest) largest = lastDigit;

            digit /= 10;
        }

        return largest;
    }


    static int smallestInDigit(int num) {

        int smallest = 9;

        while (num > 0) {

            int lastDigit = num % 10;

            if (lastDigit < smallest) smallest = lastDigit;

            num /= 10;
        }

        return smallest;
    }


    static int hcfOfTwoNumbers(int x, int y) {

        while (y != 0) {

            int rem = x % y;
            x = y;
            y = rem;
        }

        return x;
    }

    static int lcmOfTwoNumbers(int x, int y) {

        return x * y / hcfOfTwoNumbers(x, y);

    }


    static int nthLargest(int num, int n) {


        int count = 0;

        for (int i = 9; i >= 0; i--) {


            int temp = num;


            while (temp > 0) {


                int lastDigit = temp % 10;
                if (lastDigit == i) {
                    count++;
                    break;
                }
                temp /= 10;


            }

            if (count == n) return i;


        }


        System.out.println(" we cannot find nth largest ");

        return -1;
    }


    static int nthSmallest(int num, int n) {

        return -1;
    }


    static String xylemOrPhloem(int num) {


        int sumOfExtreme = 0;
        int sumOfMean = 0;

        int lastDigit = num % 10;
        sumOfExtreme += lastDigit;
        num /= 10;

        if (num >= 100) {

            while (num > 9) {

                int digit = num % 10;
                sumOfMean += digit;
                num /= 10;
            }


            sumOfExtreme += num;


        } else return " Neither Xylem Or Phloem ";


        return sumOfExtreme == sumOfMean ? " xylem Number " : " Phloem Number ";


    }


    static boolean checkXylemOrPhloem(int num) {


        int sumOfExtreme = 0;
        int sumOfMean = 0;


        int lastDigit = num % 10;
        sumOfExtreme += lastDigit;
        num /= 10;


        if (num >= 100) {

            while (num > 9) {

                int digit = num % 10;
                sumOfMean += digit;
                num /= 10;
            }


            sumOfExtreme += num;


        }

        return sumOfExtreme == sumOfMean;
    }


    static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return sum;
    }

    static boolean magicNumber(int num) {

        if (num <= 0) return false;

        while (num > 9) {

            num = sumOfDigits(num);


        }

        return num == 1;


    }


    static boolean magicNumberOptimized(int num) {

        if (num <= 0) return false;

        return num % 9 == 1;
    }


    static boolean checkMagicNumber(int num) {

        int sum = 0;

        while (num > 0 || sum > 9) {

            if (num == 0) {

                num = sum;
                sum = 0;
            }

            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;


        }


        return sum == 1;
    }


    static int findSumOfSquareOfDigit(int num) {

        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += lastDigit * lastDigit;
            num /= 10;
        }

        return sum;
    }


    static String checkHappyOrSad(int num) {

        int sumOfSquare = 0;

        while (num != 1 && num != 4) {

            num = findSumOfSquareOfDigit(num);

        }

        return num == 1 ? "Happy Number" : "Sad Number";

    }


    static int sortDigitsInAsc(int num) {

        int res = 0;

        for (int i = 1; i <= 9; i++) {

            int temp = num;

            while (temp > 0) {

                int lastDigit = temp % 10;
                if (lastDigit == i) res = res * 10 + i;
                temp /= 10;

            }


        }

        return res;
    }


    static int sortDigitsInDesc(int num) {

        int res = 0;

        for (int i = 9; i >= 0; i--) {

            int temp = num;

            while (temp > 0) {

                int lastDigit=temp%10;
                if (lastDigit==i) res=res*10+i;
                temp/=10;


            }
        }

        return res;
    }

    public static void main(String[] args) {


        System.out.println(isPalindrome(121));
        System.out.println(isPrime(13));
        System.out.println(spyNumber(231));
        System.out.println(HarshadNumber(24));

        System.out.println(smallestInDigit(21846));
        System.out.println(largestInDigit(21459));

        System.out.println(lcmOfTwoNumbers(12, 15));


        int num = 1234;

        if (num < 100) {

            System.out.println(" Neither xylem or phloem ");

        } else if (checkXylemOrPhloem(num)) System.out.println(" xylem number ");


        else System.out.println(" phloem number");


        System.out.println(checkHappyOrSad(19));
        System.out.println(sortDigitsInAsc(91425));
        System.out.println(sortDigitsInDesc(41295));

    }
}
