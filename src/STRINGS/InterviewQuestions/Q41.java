package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;


public class Q41 {

    // Helper function to create a palindrome by mirroring the first half
    static long halfToPalindrome(long left, boolean even) {

        long resultNum = left;

        if (!even) left /= 10;

        while (left > 0) {

            int digit = (int) left % 10;
            resultNum = (resultNum * 10) + digit;
            left /= 10;

        }

        return resultNum;

    }


    static String nearestPalindrome(String n) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int length = n.length();
        int mid = length / 2;

        long firstHalf = Long.parseLong(n.substring(0, length % 2 == 0 ? mid : mid + 1));

        List<Long> possibleResult = new ArrayList<>();

        possibleResult.add(halfToPalindrome(firstHalf, length % 2 == 0));
        possibleResult.add(halfToPalindrome(firstHalf + 1, length % 2 == 0));
        possibleResult.add(halfToPalindrome(firstHalf - 1, length % 2 == 0));
        possibleResult.add((long) Math.pow(10, length) + 1);
        possibleResult.add((long) Math.pow(10, length - 1) - 1);


        long diff = Long.MAX_VALUE;
        long result = 0;
        long originalNum = Long.parseLong(n);

        for (long num : possibleResult) {

            if (num == originalNum) continue;

            if (Math.abs(num-originalNum)<diff){

                diff=Math.abs(num-originalNum);
                result=num;
            }

            else if (Math.abs(num-originalNum)==diff){
                result=Math.min(result,num);
            }
        }


        return Long.toString(result);


    }


    public static void main(String[] args) {

        // leeTCode->564


        String n = "123";
        System.out.println(nearestPalindrome(n));


    }
}
