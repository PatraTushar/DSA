package STRINGS.InterviewQuestions;

import java.util.HashMap;

public class Q24 {

    static String sortVowels(String s) {

        // Time Complexity: O(n + n) = O(n)
        // Space Complexity: O(n + 10) = O(n)

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String vowels = "AEIOUaeiou";
        int j = 0;
        char[] result = s.toCharArray();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                while (map.getOrDefault(vowels.charAt(j), 0) == 0) {
                    j++;
                }

                result[i] = vowels.charAt(j);
                map.put(vowels.charAt(j), map.get(vowels.charAt(j)) - 1);


            }
        }

        return new String(result);

    }

    public static void main(String[] args) {

        // leeTCode->2785

        String s = "lEetcOde";
        System.out.println(sortVowels(s));


    }
}
