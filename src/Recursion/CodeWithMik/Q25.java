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


    public static void main(String[] args) {

        String s = "1296";
        findPartitionSum(s, 0, 0);


    }
}
