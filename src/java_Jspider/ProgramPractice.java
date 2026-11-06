package java_Jspider;

public class ProgramPractice {

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

        if (num <= 0) return false;

        int actualNumber = num;
        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return actualNumber % sum == 0;
    }


    static int findFactorial(int n) {

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static boolean strongNumber(int num) {


        int actualNumber = num;
        int factSum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            factSum += findFactorial(lastDigit);
            num /= 10;
        }

        return actualNumber == factSum;

    }


    static boolean twistedPrimeNumber(int num) {


        int actualNum = num;
        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return isPrime(actualNum) && isPrime(rev);


    }

    static int findTotalDigit(int num) {

        int count = 0;

        while (num > 0) {

            count++;
            num /= 10;
        }

        return count;
    }

    static boolean armstrongNumber(int num) {

        int actualNumber = num;
        int count = findTotalDigit(num);
        int exponentialSum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {

                power = power * lastDigit;

            }
            exponentialSum += power;
            num /= 10;

        }

        return actualNumber == exponentialSum;

    }


    static boolean disariumNumber(int num) {

        int actualNum = num;
        int countDigit = findTotalDigit(num);
        int sum = 0;


        while (num > 0) {

            int lastDigit = num % 10;
            int exponentialSum = 1;

            for (int i = 1; i <= countDigit; i++) {

                exponentialSum *= lastDigit;

            }

            sum += exponentialSum;
            countDigit--;
            num /= 10;
        }

        return actualNum == sum;

    }


    static boolean megaPrimeNumber(int num) {

        int actualNum = num;


        while (num > 0) {

            int lastDigit = num % 10;

            if (!isPrime(lastDigit)) return false;

            num /= 10;


        }

        return isPrime(actualNum);
    }


    static boolean automorphicNumber(int num) {

        int actualNum = num;
        int square = num * num;

        while (num > 0) {

            int lastDigitOfNum = num % 10;
            int lastDigitOfSquare = square % 10;

            if (lastDigitOfNum != lastDigitOfSquare) return false;

            num /= 10;
            square /= 10;
        }

        return true;

    }


    static boolean isPerfectSquare(int num) {

        if (num < 0) return false;

        for (int i = 1; ; i++) {

            int res = i * i;
            if (res == num) return true;

            else if (res > num) return false;
        }


    }

    static boolean techNumber(int num) {

        int actualNum = num;
        int countDigit = findTotalDigit(num);

        if (countDigit % 2 != 0) return false;

        int div = 1;

        for (int i = 0; i < countDigit / 2; i++) {

            div *= 10;
        }

        int firstHalf = actualNum / div;
        int secondHalf = actualNum % div;

        int sum = firstHalf + secondHalf;

        return actualNum == sum * sum;

    }


    static boolean NeonNumber(int num) {

        int actualNum = num;
        int square = num * num;
        int sum = 0;

        while (square > 0) {

            int lastDigit = square % 10;
            sum += lastDigit;
            square /= 10;
        }


        return actualNum == sum;
    }


    static boolean evilNumber(int num) {

        if (num < 0) return false;

        int count = 0;
        int actualNum = num;

        while (true) {

            int quotient = actualNum / 2;
            int remainder = actualNum % 2;

            if (remainder != 0) count++;

            if (quotient == 0) break;

            actualNum = quotient;

        }

        return count % 2 == 0;
    }


    static String decimalToBinary(int num) {

        StringBuilder binary = new StringBuilder();

        while (num > 0) {

            int rem = num % 2;
            binary.append(rem);
            num /= 2;

        }

        return binary.reverse().toString();


    }

    static int decimalToBinaryI(int num) {

        int binary = 0;
        int place = 1;

        while (num > 0) {

            int rem = num % 2;
            binary = binary + rem * place;
            place *= 10;
            num /= 2;
        }

        return binary;
    }


    static int binaryToDecimal(int num) {

        int decimal = 0;
        int power = 1;

        while (num > 0) {

            int rem = num % 10;
            decimal += rem * power;
            power *= 2;
            num /= 10;

        }

        return decimal;
    }

    static int findHcf(int x, int y) {

        while (y != 0) {

            int rem = x % y;
            x = y;
            y = rem;
        }


        return x;

    }

    static int hcf(int a, int b, int c) {

        int min = Math.min(a, Math.min(20, 30));

        for (int i = min; i >= 1; i--) {

            if (a % i == 0 && b % i == 0 & c % i == 0) return i;
        }

        return 1;
    }


    static int largestDigit(int num) {

        int largest = Integer.MIN_VALUE;

        while (num > 0) {

            int lastDigit = num % 10;
            if (lastDigit > largest) largest = lastDigit;
            num /= 10;

        }

        return largest;

    }


    static int findLcm(int x, int y) {

        int product = x * y;

        return product / findHcf(x, y);
    }


    static int findNthLargest(int num, int n) {

        int count = 0;

        for (int i = 9; i >= 0; i--) {

            int actualNum = num;

            while (actualNum > 0) {

                int lastDigit = actualNum % 10;
                if (lastDigit == i) {
                    count++;
                    break;
                }

                actualNum /= 10;
            }


            if (count == n) return i;


        }

        System.out.println(" we cannot find the the nth largest ");
        return -1;
    }


    static int findNthSmallest(int num, int n) {

        int count = 0;

        for (int i = 0; i <= 9; i++) {

            int actualNum = num;

            while (actualNum > 0) {

                int lastDigit = actualNum % 10;

                if (lastDigit == i) {

                    count++;
                    break;
                }

                actualNum /= 10;
            }

            if (count == n) return i;
        }

        System.out.println(" we cannot find the the nth smallest ");
        return -1;

    }


    static String xylemOrPhloem(int num) {

        int sumOfExtreme = 0;
        int sumOfMean = 0;

        if (num < 100) return "Not Xylem Or Phloem";

        sumOfExtreme += num % 10;
        num /= 10;

        while (num > 9) {

            sumOfMean += num % 10;
            num /= 10;
        }

        sumOfExtreme += num;


        return sumOfExtreme == sumOfMean ? "Xylem Number" : "Phloem Number";
    }


    static int sumOfDigit(int num) {

        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    static boolean magicNumber(int num) {


        if (num <= 0) return false;

        while (num > 9) {

            num = sumOfDigit(num);
        }

        return num == 1;
    }


    static int findSumOfSquareOfDigit(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }

    static String HappyOrSad(int num) {

        while (num != 1 && num != 4) {

            num = findSumOfSquareOfDigit(num);
        }

        return num == 1 ? "Happy Number" : "Sad Number";


    }

    static int sortDigitInAsc(int num) {

        int res=0;

        for (int i = 1; i <= 9; i++) {

            int actualNum = num;

            while (actualNum > 0) {

                int lastDigit = actualNum % 10;
                if (lastDigit == i)res=res*10+i;
                actualNum/=10;
            }
        }

        return res;

    }



    static int sortDigitsInDesc(int num) {

        int res = 0;

        for (int i = 9; i >= 0; i--) {

            int temp = num;

            while (temp > 0) {

                int lastDigit = temp % 10;
                if (lastDigit == i) res = res * 10 + i;
                temp /= 10;


            }
        }

        return res;
    }



    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(armstrongNumber(153));


    }
}
