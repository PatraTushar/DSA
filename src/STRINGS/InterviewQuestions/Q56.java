package STRINGS.InterviewQuestions;

public class Q56 {

    static boolean canConstruct(String s, int k) {


        // Time Complexity: O(n)
        // Space Complexity: O(26)~O(1)


        int n = s.length();
        int oddFreqCharCount = 0;

        if (k == n) return true;

        if (k > n) return false;

        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] % 2 != 0) oddFreqCharCount++;

        }


        if (oddFreqCharCount <= k) return true;

        return false;


    }


    public static void main(String[] args) {

        // leeTCode->1440

        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s, k));
    }
}
