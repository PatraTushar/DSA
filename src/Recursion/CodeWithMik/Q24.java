package Recursion.CodeWithMik;

public class Q24 {

    static boolean check(int num, String s, int currSum, int idx) {

        if (idx == s.length()) return currSum == num;

        if (currSum > num) return false;

        int n = 0;


        for (int i = idx; i < s.length(); i++) {

            n = (n * 10) + (s.charAt(i) - '0');

            if (check(num, s, currSum + n, i + 1)) return true;


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

    public static void main(String[] args) {

        // leeTCode->2698

        int n = 10;
        System.out.println(punishmentNumber(n));

    }
}
