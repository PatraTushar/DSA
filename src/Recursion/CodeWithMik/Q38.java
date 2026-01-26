package Recursion.CodeWithMik;

import java.util.HashMap;

public class Q38 {

    static int solve(int index, String[] words, int[] score, int currentScore, int[] freq) {


        if (index >= words.length) return currentScore;

        int j = 0;
        int tempScore = 0;
        int[] tempFreq = freq.clone();
        while (j < words[index].length()) {

            char ch = words[index].charAt(j);
            tempScore += score[ch - 'a'];

            tempFreq[ch - 'a']--;

            if (tempFreq[ch - 'a'] < 0) break;


            j++;


        }

        int take=0;

        if (j == words[index].length()) {

          take=  solve(index + 1, words, score, currentScore + tempScore, tempFreq);
        }


      int skip=  solve(index + 1, words, score, currentScore, freq);

        return Math.max(take,skip);


    }

    static int maxScoreWords(String[] words, char[] letters, int[] score) {

        //  Time Complexity (TC): O(2^n * L)    n = number of words   L = average length of a word
        //  Space Complexity (SC): O(n + 26)    Recursion stack:O(n)  Frequency array:O(26)


        int[] freq = new int[26];


        for (int ch : letters) {


            freq[ch - 'a']++;


        }

        return solve(0, words, score, 0, freq);


    }

    public static void main(String[] args) {

        // leeTCode->1255

        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(maxScoreWords(words, letters, score));


    }
}
