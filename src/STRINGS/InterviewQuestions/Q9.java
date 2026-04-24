package STRINGS.InterviewQuestions;

import java.util.Arrays;

public class Q9 {

    static boolean closeStrings(String word1, String word2) {

        // Time Complexity: O(n)
        // Space Complexity: O(1)


        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ele : word1.toCharArray()) {

            freq1[ele - 'a']++;
        }

        for (char ele : word2.toCharArray()) {
            freq2[ele - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != 0 && freq2[i]==0 || freq2[i]!=0 && freq1[i]==0) return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);


    }

    public static void main(String[] args) {

        // leeTCode->1657

        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));


    }
}
