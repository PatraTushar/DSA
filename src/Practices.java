public class Practices {

    static boolean isPalindrome(int num) {

        int actualNumber = num;
        int rev = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;

        }

        return actualNumber == rev;

    }


    static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) return false;
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));

    }


}

