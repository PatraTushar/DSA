package Greedy;

import java.util.Arrays;
import java.util.HashMap;

public class Q30 {

    static int minimumDeletion(String word, int k) {

        //  Time Complexity: O(n + u + u log u + u²)  = O(n)   where u is the number of unique characters
        //  Space Complexity: O(u)=O(1)

        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        int[] freq = new int[map.size()];
        int length = freq.length;
        int p = 0;

        for (char key : map.keySet()) {

            freq[p++] = map.get(key);
        }

        Arrays.sort(freq);


        int result = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {

            int freqI = freq[i];
            int deletion = 0;

            for (int j = 0; j < length; j++) {

                if (i == j) continue;

                int freqJ = freq[j];

                if (freqJ < freqI) deletion += freqJ;

                else if (freqJ > freqI + k) {

                    deletion += freqJ - freqI - k;
                }


            }

            result = Math.min(deletion, result);
        }

        return result;


    }



    public static void main(String[] args) {

        // leeTCode->3085

        String word = "aabcaba";
        int k = 0;
        System.out.println(minimumDeletion(word, k));


    }
}
