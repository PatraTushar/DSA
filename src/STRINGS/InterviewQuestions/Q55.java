package STRINGS.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q55 {

    static boolean isSubset(int[] freq2, int[] freq1) {

        for (int i = 0; i < 26; i++) {

            if (freq1[i]<freq2[i]) return false;
        }

        return true;
    }


    static List<String> wordSubsets(String[] words1, String[] words2) {

        // Time Complexity: O(n*l1 + m*l2) , n = # of words in words1, l1 = average length of word in words1, similarly m and l2 for words2
        // Space Complexity: O(26)~O(1)

        List<String> result = new ArrayList<>();

        int[] freq2 = new int[26];

        for (String word : words2) {

            int[] temp = new int[26];

            for (char ch : word.toCharArray()) {

                temp[ch - 'a']++;

                freq2[ch - 'a'] = Math.max(freq2[ch - 'a'], temp[ch - 'a']);


            }
        }


        for (String word : words1) {

            int[] freq1 = new int[26];

            for (char ch : word.toCharArray()) {

                freq1[ch - 'a']++;
            }

            if (isSubset(freq2, freq1)) {

                result.add(word);
            }
        }

        return result;


    }

    public static void main(String[] args) {

        // leeTCode->916

        String[] word1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        List<String> result = wordSubsets(word1, words2);
        System.out.println(result);
    }
}
