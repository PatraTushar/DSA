package Recursion.CodeWithMik;

public class Q24 {

    static boolean check(int num, String s, int currSum, int idx) {

        //  Time Complexity (TC): O(n.2^(m-1))
        //  Space Complexity (SC): O(log k)  where k is  number

        if (idx == s.length()) return currSum == num;

        if (currSum > num) return false;

        int currentDigit = 0;


        for (int i = idx; i < s.length(); i++) {

            currentDigit = (currentDigit * 10) + (s.charAt(i) - '0');

            if (check(num, s, currSum + currentDigit, i + 1)) return true;


        }

        return false;
    }


    static int punishmentNumber(int n) {

        int punish = 0;

        for (int num = 1; num <= n; num++) {

            int sqr = num * num;

            String s = Integer.toString(sqr);


            if (check(num, s, 0, 0)) {

                punish += sqr;

            }

        }

        return punish;


    }


    static boolean checkI(int num, int square, int currSum) {

        if (square == 0) return currSum == num;


        return checkI(num, square / 10, currSum + (square % 10)) ||
                checkI(num, square / 100, currSum + (square % 100)) ||
                checkI(num, square / 1000, currSum + (square % 1000)) ||
                checkI(num, square / 10000, currSum + (square % 10000));

    }


    static int punishmentNumberI(int n) {

        //  Time Complexity (TC): O(n * 4^(log₁₀(n²)))
        //  Space Complexity (SC): O log(n^2)=2 log n ⇒ O(log n)

        int result = 0;

        for (int num = 1; num <= n; num++) {

            int square = num * num;

            if (checkI(num, square, 0)) {

                result += square;
            }


        }

        return result;
    }


    public static void main(String[] args) {

        // leeTCode->2698

        int n = 10;
        System.out.println(punishmentNumber(n));
        System.out.println(punishmentNumberI(n));

    }
}
