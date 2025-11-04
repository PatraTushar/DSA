package Greedy;

public class Q3 {

    static String breakPalindrome(String palindrome) {

        //  Time Complexity: O(n/2) =O(n)
        //  Space Complexity: O(n)

        int n = palindrome.length();

        if (n == 1) return "";

        for (int i = 0; i < n / 2; i++) {

            char ch = palindrome.charAt(i);

            if (ch != 'a') {

                palindrome = palindrome.substring(0, i) + 'a' + palindrome.substring(i + 1);
                return palindrome;
            }


        }

        palindrome = palindrome.substring(0, n - 1) + 'b';

        return palindrome;

    }


    public static void main(String[] args) {

        String str = "abccba";
        System.out.println(breakPalindrome(str));


    }
}
