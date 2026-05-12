package STRINGS.InterviewQuestions;

public class Q42 {

    static String reverse(String s) {

        int n = s.length();
        char[] ch = s.toCharArray();

        int i = 0;
        int j = n - 1;

        while (i < j) {

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;

        }

        return new String(ch);


    }

    static String shortestPalindrome(String s) {

        // Time Complexity  : O(n²)
        // Space Complexity : O(n)

        int n = s.length();

        String reverseS = reverse(s);


        for (int i = 0; i < n; i++) {

            if (s.substring(0, n - i).equals(reverseS.substring(i, n))) {

                String append = reverseS.substring(0, i);
                return append.concat(s);

            }
        }

        return "";


    }

    static int[] findLPS(String s) {

        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int i = 1;
        int length = 0;

        while (i < n) {

            if (s.charAt(i) == s.charAt(length)) {

                length++;
                lps[i] = length;
                i++;


            } else {

                if (length != 0) length = lps[length - 1];

                else {

                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;


    }


    static String shortestPalindromeI(String s) {

        // Time Complexity  : O(n)
        // Space Complexity : O(n)

        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        String temp = s + "#" + rev;


        int[] lps = findLPS(temp);

        int maxLPS = lps[temp.length() - 1];

        int appendRequired = n - maxLPS;

        return rev.substring(0, appendRequired) + s;


    }

    public static void main(String[] args) {

        // leeTCode->214

        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));
        System.out.println(shortestPalindromeI(s));
    }
}
