package Recursion.CodeWithMik;

public class Q25 {

    static void findPartitionSum(String s, int currentSum, int index) {

        //  Time Complexity (TC): O(2^(m-1))
        //  Space Complexity (SC): O(log k) where k is the number

        // base case: whole string consumed
        if (index == s.length()) {
            System.out.println(currentSum);
            return;
        }

        int num = 0;

        // try all partitions starting at index
        for (int i = index; i < s.length(); i++) {

            // build number digit by digit..33.
            num = num * 10 + (s.charAt(i) - '0');

            // recursive call
            findPartitionSum(s, currentSum + num, i + 1);

        }

    }


    static boolean checkI(int num, int square, int currSum) {

        if (num == 0) return currSum == num;


        return checkI(num, square / 10, currSum + (square % 10)) || checkI(num, square / 100, currSum + (square % 100)) || checkI(num, square / 1000, currSum + (square % 1000));

    }

    static int partitionSumI(int n) {

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

        String s = "1296";
        findPartitionSum(s, 0, 0);



    }
}
