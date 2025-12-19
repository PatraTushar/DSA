package Recursion.CodeWithMik;

public class Q24 {

    static boolean check(int num, String s, int currSum, int idx) {

        if (idx == s.length()) return currSum == num;

        if (currSum > num) return false;

        boolean possible = false;

        for (int j = idx; j < s.length(); j++) {

            String substring = s.substring(idx, j + 1);
            int val = Integer.parseInt(substring);

            possible = possible || check(num, s, currSum + val, j + 1);

            if (possible) return true;
        }

        return possible;


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
