package BitManipulation.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class Q23 {


    // Time Complexity : O(n)
    // Space Complexity : O(n)

    static int longestSubString(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        int[] vowel = new int[5];

        String currState = Arrays.toString(vowel);
        map.put(currState, -1);

        int result = 0;

        int n = s.length();


        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'a') {

                vowel[0] = (vowel[0] + 1) % 2;


            } else if (s.charAt(i) == 'e') {

                vowel[1] = (vowel[1] + 1) % 2;


            } else if (s.charAt(i) == 'i') {

                vowel[2] = (vowel[2] + 1) % 2;


            } else if (s.charAt(i) == 'o') {

                vowel[3] = (vowel[3] + 1) % 2;


            } else if (s.charAt(i) == 'u') {

                vowel[4] = (vowel[4] + 1) % 2;


            }


            currState = Arrays.toString(vowel);


            if (map.containsKey(currState)) {

                result = Math.max(result, i - map.get(currState));
            } else {

                map.put(currState, i);
            }


        }


        return result;


    }


    static int longestSubStringI(String s) {

        // Time Complexity : O(n)
        // Space Complexity : O(n)

        int n = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        int[] vowels = new int[5];
        String currState = Arrays.toString(vowels);
        map.put(currState, -1);

        for (int i = 0; i < n; i++) {


            if (s.charAt(i) == 'a') vowels[0] = (vowels[0]) ^ 1;
            else if (s.charAt(i) == 'e') vowels[1] = vowels[1] ^ 1;
            else if (s.charAt(i) == 'i') vowels[2] = vowels[2] ^ 1;
            else if (s.charAt(i) == 'o') vowels[3] = vowels[3] ^ 1;
            else if (s.charAt(i) == 'u') vowels[4] = vowels[4] ^ 1;

            currState = Arrays.toString(vowels);

            if (map.containsKey(currState)) {

                result = Math.max(result, i - map.get(currState));
            } else map.put(currState, i);


        }

        return result;

    }


    static int longestSubstringII(String s) {

        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int n = s.length();
        int mask = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(mask,-1);

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'a') mask = mask ^ (1 << 0);
            else if (s.charAt(i) == 'e') mask = mask ^ (1 << 1);
            else if (s.charAt(i) == 'i') mask = mask ^ (1 << 2);
            else if (s.charAt(i) == 'o') mask = mask ^ (1 << 3);
            else if (s.charAt(i) == 'u') mask = mask ^ (1 << 4);


            if (map.containsKey(mask)) {

                result = Math.max(result, i - map.get(mask));
            } else map.put(mask, i);
        }

        return result;

    }

    public static void main(String[] args) {

        // leeTCode->1371

        String s = "leetcodeisgreat";
        System.out.println(longestSubString(s));
        System.out.println(longestSubStringI(s));
        System.out.println(longestSubstringII(s));
    }
}
