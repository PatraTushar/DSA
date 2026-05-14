package STRINGS.InterviewQuestions;

public class Q59 {

    static long countValidNumbers(String str, String suffix, int limit) {

        if (str.length() < suffix.length()) return 0;

        long count = 0;

        String trailing = str.substring(str.length() - suffix.length());
        int prefixLength = str.length() - suffix.length();

        for (int i = 0; i < prefixLength; i++) {

            int digit = str.charAt(i) - '0';

            if (digit <= limit) {

                count += digit * Math.pow(limit + 1, prefixLength - i - 1);
            } else {

                count += Math.pow(limit + 1, prefixLength - i);
                return count;
            }
        }

        if (trailing.compareTo(suffix) >= 0) count++;

        return count;


    }

    static long numberOfPowerfulInt(long start, long finish, int limit, String s) {

        // Time Complexity: O(n - m + m + m) = O(n)    n = str.length()  m = suffix.length()
        // Space Complexity: O(m)

        return countValidNumbers(Long.toString(finish), s, limit) - countValidNumbers(Long.toString(start - 1), s, limit);


    }

    public static void main(String[] args) {

        // leeTCode->2999

        long start=1;
        long finish=6000;
        int limit=4;
        String s="124";
        System.out.println(numberOfPowerfulInt(start,finish,limit,s));



    }
}
