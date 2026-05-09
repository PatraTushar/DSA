package STRINGS.KMPAlGORITHM;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    static int LPSBrute(String s) {

        // BRUTE FORCE FOR FINDING LPS(LONGEST PREFIX SUFFIX)

        // Time Complexity: O(n²)
        //Space Complexity: O(n²)

        int n = s.length();

        int maxLength = 0;

        List<String> prefixList = new ArrayList<>();
        List<String> suffixList = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {

            String prefix = s.substring(0, i + 1);
            prefixList.add(prefix);
        }

        System.out.println(prefixList);


        for (int i = n - 1; i > 0; i--) {

            String suffix = s.substring(i, n);
            suffixList.add(suffix);
        }

        System.out.println(suffixList);

        for (int i = 0; i < prefixList.size(); i++) {

            if (prefixList.get(i).equals(suffixList.get(i))) {

                int length = prefixList.get(i).length();

                if (length > maxLength) maxLength = length;
            }


        }

        return maxLength;
    }


    static int[] findLPS(String pattern) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = pattern.length();

        int[] LPS = new int[n];

        LPS[0] = 0;
        int length = 0;
        int i = 1;

        while (i < n) {

            if (pattern.charAt(i) == pattern.charAt(length)) {

                length++;
                LPS[i] = length;
                i++;
            } else {

                if (length != 0) length = LPS[length - 1];

                else {

                    LPS[i] = 0;
                    i++;
                }
            }
        }

        return LPS;

    }


    static List<Integer> kmp(String txt, String pattern) {

        // Time Complexity: O(m + n)
        // Space Complexity: O(n)

        int m = txt.length();
        int n = pattern.length();

        List<Integer> result = new ArrayList<>();
        int[] lps = findLPS(pattern);

        int i = 0;
        int j = 0;

        while (i < m) {

            if (txt.charAt(i) == pattern.charAt(j)) {

                i++;
                j++;
            }

            if (j == n) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i<m && txt.charAt(i) != pattern.charAt(j)) {

                if (j != 0) j = lps[j - 1];

                else i++;


            }
        }


        return result;


    }

    public static void main(String[] args) {

        String s = "ABCDEABCD";
        System.out.println(LPSBrute(s));


        String txt = "geekxgeek";
        String pattern = "geek";
        System.out.println(kmp(txt, pattern));


    }
}
